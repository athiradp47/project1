package org.locator;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	private WebElement user;
	
	@FindBy(name = "password")
	private WebElement pass;
	
	@FindBy(xpath = "//input[@name='login']")
	private WebElement btnlogin;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getBtnsearch() {
		return btnlogin;
	}
	

	
}
	
	
	
	
	


