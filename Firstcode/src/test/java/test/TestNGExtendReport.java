package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestNGExtendReport {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver;
	
	
	@BeforeSuite
	public void setUp() {
		
		htmlReporter = new ExtentHtmlReporter("extent.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
	}
        
        @BeforeTest
    	public void beforTest() {
    		
        	System.setProperty("webdriver.chrome.driver", "/Users/deepaka/Downloads/chromedriver");
            driver = new ChromeDriver(); 
		
	}
	@Test
	public void test1() throws Exception {
		
		
		
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		driver.get("https://www.google.com");
		test.pass("Navigated to google page");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
        test.info("This step shows usage of info(details)");
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.addScreenCaptureFromPath("screenshot.png");
		
		
	}
	
	@Test
	public void test2() throws Exception {
		
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
        test.info("This step shows usage of info(details)");
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.addScreenCaptureFromPath("screenshot.png");
	}
	@AfterTest
	public void afterTest() {
		
		driver.quit();
	}
	
	@AfterSuite
	public void tearDown() {
		
		extent.flush();
	}

}
