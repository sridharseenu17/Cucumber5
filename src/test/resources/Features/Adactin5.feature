Feature: Verifying the Adactin application

  Scenario Outline: Checking the functionality of the Adactin application
    Given User is in the Adactin webpage
    When User enter the userName and password
      | userName | SridharGS |
      | password | zxcvbnm   |
    Then user should click the login button
    Given User is in search hotel page and user should select location, hotels, room type and number of rooms
    Then User should mention the "<checkIn>" and "<checkOut>" date
    And user should select Adults per room and Children per room
    Then User should click the search button
    Given User is in select hotel page and user should select the hotel
    Then User should click the continue button
    Given User is in book a hotel page and User should enter "<firstName>", "<lastName>", "<billingAddress>" and "<creditCardNumber>".
    And User should Select credit card type and expiry details.
    When User enter the "<cvvNumber>".
    Then User should click book now button.

    Examples: 
      | checkIn    | checkOut   | firstName | lastName | billingAddress | creditCardNumber | cvvNumber |
      | 02/09/2020 | 03/08/2020 | Sridhar   | G S      | Chennai        | 1234567891012345 |       007 |
