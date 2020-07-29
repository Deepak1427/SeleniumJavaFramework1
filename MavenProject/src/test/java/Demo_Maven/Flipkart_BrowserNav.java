package Demo_Maven;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flipkart_BrowserNav {
	
	public static WebDriver driver;
	
	
	
	@BeforeTest
	public void BrowserInvoke() throws InterruptedException {
	
	
			System.setProperty("webdriver.chrome.driver","/Users/deepaka/Downloads/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().fullscreen();
			
	}
			
			@Test(testName = "Flipkart", description = "Add to cart")
			public void test() throws InterruptedException {	
			
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
//			WebElement overlay =driver.findElement(By.xpath(".//button[@class='_2AkmmA _29YdH8']"));
//			overlay.click();
			homepage(driver);
			
			}
			
			public void homepage(WebDriver driver) throws InterruptedException {
				
				PageObjects_Maven obj = new PageObjects_Maven(driver);
				System.out.println(obj);
//				Thread.sleep(2000);
				System.out.println("Driver" + driver);
				
				obj.overlay.click();
				
				obj.textbox.sendKeys("Mobile");
				obj.search.click();
				
//				WebElement checkbox1 = driver.findElement(By.xpath("//div[@class='_4IiNRh _2mtkou' and @title='4 GB']"));
//				checkbox1.click();
//				Thread.sleep(2000);
//				obj.checkbox.click();
			
			
//			WebElement textbox = driver.findElement(By.name("q"));
//			textbox.sendKeys("mobiles");
			
			Thread.sleep(2000);
//			
//			WebElement search = driver.findElement(By.className("gNO89b"));
//			search.click();
		
		
	}
			@AfterTest
			public void Browserclose() {
				
				driver.quit();
			}

}
