package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReporter {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		try {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extendReports.html");
		
		 // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("Google search test", "this is to validate the google search functionality");
        
//        String ProjectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", "/Users/deepaka/Downloads/chromedriver");
        driver = new ChromeDriver();
        
        test.log(Status.INFO, "Starting the testcase");
        
        driver.get("https://www.google.com");
        
        test.pass("Navigating to google");
        
        driver.findElement(By.name("q")).sendKeys("hello");
        test.pass("Entered text in search box");
        
        Thread.sleep(2000);
        
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        test.pass("Pressed enter key ");
        
        
        driver.quit();
        test.pass("Closed the browser");
        
        test.pass("Test Completed");
        
        // calling flush writes everything to the log file
        extent.flush();
		}catch(Exception e) {
        	e.printStackTrace();
        }
        
        
        
        
        
        
        
        
        
		
	}
	
	

}
