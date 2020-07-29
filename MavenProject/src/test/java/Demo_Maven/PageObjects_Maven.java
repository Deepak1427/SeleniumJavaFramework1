package Demo_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class PageObjects_Maven {

	protected static WebDriver driver;
	
	PageObjects_Maven(WebDriver driver){
		PageObjects_Maven.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	public WebElement overlay;
	
	@FindBy(xpath="//input[@name='q']")
	public WebElement textbox;
	
	@FindBy(xpath="//button[@class='vh79eN']")
	public WebElement search;
	
//	@FindBy(xpath="//div[@class='_4IiNRh _2mtkou' and @title='4 GB']")
//	public WebElement checkbox;
	
}
