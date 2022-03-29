$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/adactinlogin.feature");
formatter.feature({
  "name": "validating login function of adactin webpage",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "validating login with correct username and correct passwoord",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on adacting page on chrome",
  "keyword": "Given "
});
formatter.step({
  "name": "user enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should click on login button",
  "keyword": "And "
});
formatter.step({
  "name": "user should validate home page screen is visible or not",
  "keyword": "Then "
});
formatter.step({
  "name": "user is on search page ,enter \"\u003clocation\u003e\",\"\u003cHotel\u003e\",\"\u003cRoom Type\u003e\",\"\u003cNumber of Rooms\u003e\",\"\u003cCheck In Date\u003e\",\"\u003cCheck Out Date\u003e\",\"\u003cAdults per Room\u003e\",\"\u003cChildren per Room\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on search button",
  "keyword": "And "
});
formatter.step({
  "name": "user user should validate second page screen is visible or not",
  "keyword": "Then "
});
formatter.step({
  "name": "user should click on radio button and click on continue button",
  "keyword": "And "
});
formatter.step({
  "name": "user is on payment page ,enter \"\u003cFirst Name\u003e\",\"\u003cLast Name\u003e\",\"\u003cBilling Address\u003e\",\"\u003cCredit Card No\u003e\",\"\u003cCredit Card Type\u003e\",\"\u003cExpiry month\u003e\",\"\u003cExpiry year\u003e\",\"\u003cCVV Number\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks book now button",
  "keyword": "And "
});
formatter.step({
  "name": "get oder id",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "",
        "password",
        "",
        "location",
        "",
        "Hotel",
        "",
        "Room Type",
        "",
        "Number of Rooms",
        "",
        "Check In Date",
        "",
        "Check Out Date",
        "",
        "Adults per Room",
        "",
        "Children per Room",
        "",
        "First Name",
        "",
        "Last Name",
        "",
        "Billing Address",
        "",
        "Credit Card No",
        "",
        "Credit Card Type",
        "",
        "Expiry month",
        "",
        "Expiry year",
        "",
        "CVV Number"
      ]
    },
    {
      "cells": [
        "SuryaVijay47",
        "",
        "VijaySurya@47",
        "",
        "Adelaide",
        "",
        "Hotel Hervey",
        "",
        "Double",
        "",
        "5 - Five",
        "",
        "29/03/2022",
        "",
        "1/04/2022",
        "",
        "3 - Three",
        "",
        "2 - Two",
        "",
        "Arjun",
        "",
        "Ram",
        "",
        "chennai",
        "",
        "1234567891234567",
        "",
        "Master Card",
        "",
        "February",
        "",
        "2022",
        "",
        "675"
      ]
    }
  ]
});
formatter.scenario({
  "name": "validating login with correct username and correct passwoord",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on adacting page on chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition3.user_is_on_adacting_page_on_chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"SuryaVijay47\" and \"VijaySurya@47\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition3.user_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition3.user_should_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should validate home page screen is visible or not",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition3.user_should_validate_home_page_screen_is_visible_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on search page ,enter \"Adelaide\",\"Hotel Hervey\",\"Double\",\"5 - Five\",\"29/03/2022\",\"1/04/2022\",\"3 - Three\",\"2 - Two\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition3.user_is_on_search_page_enter(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition3.user_clicks_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user user should validate second page screen is visible or not",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition3.user_user_should_validate_second_page_screen_is_visible_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click on radio button and click on continue button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition3.user_should_click_on_radio_button_and_click_on_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on payment page ,enter \"Arjun\",\"Ram\",\"chennai\",\"1234567891234567\",\"Master Card\",\"February\",\"2022\",\"675\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition3.user_is_on_payment_page_enter(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks book now button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition3.user_clicks_book_now_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get oder id",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition3.get_oder_id()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});