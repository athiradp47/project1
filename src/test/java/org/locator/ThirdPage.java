package org.locator;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdPage extends BaseClass {
	public ThirdPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(name ="continue")
	private WebElement butncont;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getButncont() {
		return butncont;
	}
	
	
	
	

}
