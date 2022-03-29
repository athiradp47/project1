package org.stepdef;

import org.baseclass.BaseClass;
import org.locator.FifthPage;
import org.locator.FourthPage;
import org.locator.LoginPage;
import org.locator.SecondPage;
import org.locator.ThirdPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition3 extends BaseClass {
	LoginPage page = new LoginPage();
	SecondPage second = new SecondPage();
	ThirdPage third = new ThirdPage();
	FourthPage fourth = new FourthPage();
	FifthPage fifth = new FifthPage();
	@Given("user is on adacting page on chrome")
	public void user_is_on_adacting_page_on_chrome() {
	   
	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String string, String string2) {
	   
	    WebElement user = page.getUser();
	    typeText(user, string);
	    
	    WebElement pass = page.getPass();
	    typeText(pass, string2);
	}

	@When("user should click on login button")
	public void user_should_click_on_login_button() throws InterruptedException {
		WebElement btnsearch = page.getBtnsearch();
		btn(btnsearch);
		Thread.sleep(3000);
		
	}

	@Then("user should validate home page screen is visible or not")
	public void user_should_validate_home_page_screen_is_visible_or_not() {

		System.out.println(" first page finish");
	}
	
	
	@When("user is on search page ,enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_is_on_search_page_enter(String location, String hotels, String room_type, String room_nos, String datepick_in, String datepick_out, String adult_room, String child_room) {
		
		WebElement dloc = second.getLocatio();
		dropDown(dloc, location);
		
		WebElement dophotel = second.getHotel();
		dropDown(dophotel, hotels);
		
		WebElement doproom = second.getRoom();
		dropDown(doproom, room_type);
		
		WebElement doproomno = second.getRoomno();
		dropDown(doproomno, room_nos);
		
		WebElement datein = second.getDatein();
		datein.clear();
		typeText(datein, datepick_in);
		
		WebElement dateout = second.getDateout();
		dateout.clear();
		typeText(dateout, datepick_out);
		
		WebElement dopadultroom = second.getAdultroom();
		dropDown(dopadultroom, adult_room);
		
		WebElement dopchildroom = second.getChildroom();
		dropDown(dopchildroom, child_room);
		
		
	}

	@When("user clicks on search button")
	public void user_clicks_on_search_button() {
		
	    WebElement submitbutton = second.getSubmitbutton();
	    btn(submitbutton);
	    
	}

	@Then("user user should validate second page screen is visible or not")
	public void user_user_should_validate_second_page_screen_is_visible_or_not() {
	    System.out.println("second page finish");
	}
	
	@Then("user should click on radio button and click on continue button")
	public void user_should_click_on_radio_button_and_click_on_continue_button() {
		WebElement radiobutton = third.getRadiobutton();
		btn(radiobutton);
		
		WebElement butncont = third.getButncont();
		btn(butncont);
	  
	}
	
	@When("user is on payment page ,enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_is_on_payment_page_enter(String fname, String lname, String txtaddress, String cardno, String cardtyp, String cardmon, String cardyr, String cvv) {
	 WebElement firstname = fourth.getFirstname();
	 typeText(firstname, fname);
	 
	 WebElement lastname = fourth.getLastname();
	 typeText(lastname, lname);
	 
	 WebElement address = fourth.getAddress();
	 typeText(address, txtaddress);
	 
	 WebElement cardnum = fourth.getCardnum();
	 typeText(cardnum, cardno);
	 
	 WebElement cardtype = fourth.getCardtype();
	 dropDown(cardtype, cardtyp);
	 
	 WebElement cardmonth = fourth.getCardmonth();
	 dropDown(cardmonth, cardmon);
	 
	 WebElement cardyear = fourth.getCardyear();
	 dropDown(cardyear, cardyr);
	 
	 WebElement cardcvv = fourth.getCardcvv();
	 typeText(cardcvv, cvv);
	  
	}

	@When("user clicks book now button")
	public void user_clicks_book_now_button() throws InterruptedException {
		WebElement butnbook = fourth.getButnbook();
		btn(butnbook);
		Thread.sleep(7000);
	}
	
	@Then("get oder id")
	public void get_oder_id() {
		WebElement orderid = fifth.getOrderid();
		String attribute = orderid.getAttribute("value");
		System.out.println(attribute);
	
	}
	    
	

	    
		

}