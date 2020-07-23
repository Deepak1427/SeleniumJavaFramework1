package com.Practise.Firstcode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class PageObjects {

	protected static WebDriver driver;
	
	PageObjects(WebDriver driver){
		PageObjects.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	public WebElement overlay;
	
	@FindBy(xpath="//input[@name='q']")
	public WebElement textbox;
	
	@FindBy(xpath="//button[@class='vh79eN']")
	public WebElement search;
	
	
	
}
