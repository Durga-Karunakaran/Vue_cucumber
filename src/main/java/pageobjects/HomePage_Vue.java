package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Vue {
	WebDriver driver;
	public HomePage_Vue(WebDriver driver) {
		this.driver=driver;
	    PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//input[@class='new-todo']") 
	private WebElement task_txtbx;
	
	@FindBy(how = How.XPATH, using = "//input[@id='toggle-all']/following-sibling::label") 
	private WebElement mark_all;
	
	@FindBy(how = How.XPATH, using = "//button[@class='clear-completed']") 
	private WebElement clear_complete;
	
	public void enter_Name(String name) {
		task_txtbx.sendKeys(name);
		task_txtbx.sendKeys(Keys.ENTER); 
	}
	
	public void mark_all_completed() throws InterruptedException {
		mark_all.click();
		Thread.sleep(1000);
	}
	
	public void remove_completed() throws InterruptedException {
		clear_complete.click();
		Thread.sleep(1000);
	}
}
