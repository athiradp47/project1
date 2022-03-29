package org.locator;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FifthPage extends BaseClass {
	
	public FifthPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name ="order_no")
	private WebElement orderid;
	

	public WebElement getOrderid() {
		return orderid;
	}

	

}
