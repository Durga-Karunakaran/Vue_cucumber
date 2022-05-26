package stepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
//import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.HomePage_Vue;

public class Stepdefinition {
	public static WebDriver driver;
	public WebElement todo;
	public WebElement markall;
	public WebElement clearall;
	public static Properties prop;
	
	@Before
	public void before() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("./configs/config.properties");
			try {
				prop.load(fis);
				String URL=prop.getProperty("URL");
				System.out.println(" URL from prop file is " +URL);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			
		}
	
	@Given("^Launch URL$")
	public void launch_URL() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String prop_URL=prop.getProperty("URL");
	    driver.get(prop_URL);
	    driver.manage().window().maximize(); 

	}

	@When("^Add Task in Todo list$")
	public void add_Task_in_Todo_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		todo=driver.findElement(By.xpath("//input[@class='new-todo']"));
		todo.sendKeys("To Iron");
		todo.sendKeys(Keys.ENTER);
	}
	@When("^Add Task in Todo list \"([^\"]*)\"$")
	public void add_Task_in_Todo_list(String task) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HomePage_Vue taskname= new HomePage_Vue(driver);
		taskname.enter_Name(task);
		/*todo=driver.findElement(By.xpath("//input[@class='new-todo']"));
		todo.sendKeys(task);
		todo.sendKeys(Keys.ENTER); */
	} 
	@When("^Mark Task as completed$")
	public void mark_Task_as_completed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HomePage_Vue marktask= new HomePage_Vue(driver);
		marktask.mark_all_completed();		
		/* markall=driver.findElement(By.xpath("//input[@id='toggle-all']/following-sibling::label"));
		markall.click();
		Thread.sleep(1000);*/
	}

	@Then("^Remove Completed Task$")
	public void remove_Completed_Task() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HomePage_Vue clearcomplete= new HomePage_Vue(driver);
		clearcomplete.remove_completed();
		/*clearall=driver.findElement(By.xpath("//button[@class='clear-completed']"));
		clearall.click();
		Thread.sleep(500); */
	}

	@After
	public void after() throws Exception
	{
		driver.close();
	}
	
}
