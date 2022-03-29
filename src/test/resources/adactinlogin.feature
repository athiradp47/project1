Feature: validating login function of adactin webpage

  Scenario Outline: validating login with correct username and correct passwoord
    Given user is on adacting page on chrome
    When user enter "<username>" and "<password>"
    And user should click on login button
    Then user should validate home page screen is visible or not
    When user is on search page ,enter "<location>","<Hotel>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>","<Children per Room>"
    And user clicks on search button
    Then user user should validate second page screen is visible or not
    And user should click on radio button and click on continue button
    When user is on payment page ,enter "<First Name>","<Last Name>","<Billing Address>","<Credit Card No>","<Credit Card Type>","<Expiry month>","<Expiry year>","<CVV Number>"
    And user clicks book now button
    Then get oder id

    Examples: 
      | username     |  | password      |  | location |  | Hotel        |  | Room Type |  | Number of Rooms |  | Check In Date |  | Check Out Date |  | Adults per Room |  | Children per Room |  | First Name |  | Last Name |  | Billing Address |  | Credit Card No   |  | Credit Card Type |  | Expiry month |  | Expiry year |  | CVV Number |
      | SuryaVijay47 |  | VijaySurya@47 |  | Adelaide |  | Hotel Hervey |  | Double    |  | 5 - Five        |  | 29/03/2022    |  | 1/04/2022      |  | 3 - Three       |  | 2 - Two           |  | Arjun      |  | Ram       |  | chennai         |  | 1234567891234567 |  | Master Card      |  | February     |  |        2022 |  |        675 |
