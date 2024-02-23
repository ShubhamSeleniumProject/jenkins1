package com.tyss.genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtility {
	
	public void getDataMouserelated(WebDriver driver,WebElement element)
	{
		
		
		Actions act=new Actions(driver);
		 act.contextClick(element).perform();
		
	}

}
