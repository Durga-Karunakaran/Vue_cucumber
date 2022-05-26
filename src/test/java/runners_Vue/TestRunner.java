package runners_Vue;

import java.io.*;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import dataProviders.FileReaderManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/featuresVue/Vue_EndtoEndTests.Feature"
		,glue={"stepDefinitions"}
		,dryRun=false
		,monochrome = true
		,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
		,tags={"@Basic, @Multiple"}
		)
public class TestRunner {
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	    Reporter.setSystemInfo("Machine", 	"Mac OS Catalina 10.15.7" + "64 Bit");
	    Reporter.setSystemInfo("Selenium", "3.141.0");
	    Reporter.setSystemInfo("Maven", "3.7.0");
	    Reporter.setSystemInfo("Java Version", "1.10.1");
	}
}
