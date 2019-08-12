Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Title of your scenario
   # Given User can  Launch the browser.
   # When User click the Addcustomer Details.
    #  | fname   | parveen           |
      #| lname   | rihana            |
     # | email   | parveen@gmail.com |
   
   #   | address | chennai           |
  
  #    | phno    |        8667344864 |
    #And user click the Add tariff Details.
   # Then I validate  Outcomes.

  Scenario Outline: 
    Given User can  Launch the browser.
    When User click the Addcustomer Details"<fname>","<lname>","<email>","<address>","<phno>"
    And user click the Add tariff Details.
    Then I validate  Outcomes.

    Examples: 
      | fname           | lname  | email             | address | phno       |
      | karthi          | rajan  | kr@gmail.com      | tanjore |  123455666 |
      | parveen         | rihana | parveen@gmail.com | chennai | 8667344864 |
      | narayanamoorthy | rajan  | kr@gmail.com      | tanjore |  123455666 |
