package com.tyss.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CameraPAge {
	
	public CameraPAge(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="products-orderby")
	private WebElement sortBy;
	
	@FindBy(id="products-pagesize")
	private WebElement display_sort;
	
	@FindBy(id="products-viewmode")
	private WebElement view_sort;
	
	@FindBy(xpath="//img[@alt='Picture of 1MP 60GB Hard Drive Handycam Camcorder']")
	private WebElement handycam;

	public WebElement getHandycam() {
		return handycam;
	}

	public WebElement getSortBy() {
		return sortBy;
	}

	public WebElement getDisplay_sort() {
		return display_sort;
	}

	public WebElement getView_sort() {
		return view_sort;
	}
	
	
	

}
