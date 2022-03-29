package org.locator;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FourthPage extends BaseClass {
	public FourthPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name= "first_name")
	private WebElement firstname;
	
	@FindBy(name = "last_name")
	private WebElement lastname;
	
	@FindBy(name = "address")
	private WebElement address;
	
	@FindBy(name = "cc_num")
	private WebElement cardnum;
	
	@FindBy(name = "cc_type")
	private WebElement cardtype;
	
	

	@FindBy(name = "cc_exp_month")
	private WebElement cardmonth;
	
	@FindBy(name = "cc_exp_year")
	private WebElement cardyear;
	
	@FindBy(name = "cc_cvv")
	private WebElement cardcvv;
	
	@FindBy(name = "book_now")
	private WebElement butnbook;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardnum() {
		return cardnum;
	}
	
	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getCardmonth() {
		return cardmonth;
	}

	public WebElement getCardyear() {
		return cardyear;
	}

	public WebElement getCardcvv() {
		return cardcvv;
	}

	public WebElement getButnbook() {
		return butnbook;
	}
	

}
