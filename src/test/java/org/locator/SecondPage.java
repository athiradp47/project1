package org.locator;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondPage extends BaseClass {
	
	public SecondPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name ="location")
	private WebElement locatio;
	
	@FindBy(name = "hotels")
	private WebElement hotel;
	
	@FindBy(name ="room_type")
	private WebElement room;
	
	@FindBy(name ="room_nos")
	private WebElement roomno;
	
	@FindBy(name ="datepick_in")
	private WebElement datein;
	
	@FindBy(name ="datepick_out")
	private WebElement dateout;
	

	@FindBy(name ="adult_room")
	private WebElement adultroom;
	
	
	@FindBy(name ="child_room")
	private WebElement childroom;
	
	@FindBy(name = "Submit")
	private WebElement submitbutton;



	public WebElement getLocatio() {
		return locatio;
	}


	public WebElement getHotel() {
		return hotel;
	}


	public WebElement getRoom() {
		return room;
	}


	public WebElement getRoomno() {
		return roomno;
	}


	public WebElement getDatein() {
		return datein;
	}


	public WebElement getDateout() {
		return dateout;
	}


	public WebElement getAdultroom() {
		return adultroom;
	}


	public WebElement getChildroom() {
		return childroom;
	}
	public WebElement getSubmitbutton() {
		return submitbutton;
	}


	
}
	

