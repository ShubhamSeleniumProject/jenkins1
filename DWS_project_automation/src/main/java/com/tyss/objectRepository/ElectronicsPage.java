package com.tyss.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {
	public ElectronicsPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title='Show products in category Camera, photo']")
	private WebElement camera_link;
	
	
	@FindBy(xpath="//img[@title='Show products in category Cell phones']")
	private WebElement cell_link;


	public WebElement getCamera_link() {
		return camera_link;
	}


	public WebElement getCell_link() {
		return cell_link;
	}
	
	
	
	

}
