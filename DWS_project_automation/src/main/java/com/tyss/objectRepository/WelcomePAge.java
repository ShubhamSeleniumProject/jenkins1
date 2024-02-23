package com.tyss.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePAge {
	public WelcomePAge(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
		
	}
	
	@FindBy(linkText = "Register")
	private WebElement RegisterLink;
	
	@FindBy(partialLinkText = "Log in")
	private WebElement Loginlink;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoppingLink;
	
	@FindBy(xpath="//span[text()='Wishlist']")
	private WebElement wishlistLink;

	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	public WebElement getLoginlink() {
		return Loginlink;
	}

	public WebElement getShoppingLink() {
		return shoppingLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}
	
	
	
	
	

}
