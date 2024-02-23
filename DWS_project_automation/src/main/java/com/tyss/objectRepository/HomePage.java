package com.tyss.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement elec_link;


	public WebElement getElec_link() {
		return elec_link;
	}
	
	@FindBy(linkText = "Log out")
	private WebElement logout_link;


	public WebElement getLogout_link() {
		return logout_link;
	}
	
	
	
	

}
