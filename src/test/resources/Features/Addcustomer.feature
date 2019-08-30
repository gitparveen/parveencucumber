@regression @sanity
Feature: Add Customer functionality
  I want to use this template for my feature file

Background:
    Given user should be in telecom home page
    And user click on add customer button

@smoke @cucumber
  Scenario: add customer with valid data
    When user enters all the fields
    And user click on submit button
    Then user should be displayed the customer id is generated

@parveen @cucumber
  Scenario: add customer with One Dimensional list
    When user enters all the fields.
      |parveen | rihana | parveen@gmail.com | chennai |8667344864 |
    And user click on submit button
    Then user should be displayed the customer id is generated

@smoke  @java @parveen
  Scenario: add customer with One Dimensional list
    When user enters all the field
      | fname   | rihaha          |
      | lname   | parveen            |
      | email   | rihanA@gmail.com |
      | address | cuddalore        |
      | phno    | 9600239915 |
   And user click on submit button
    Then user should be displayed the customer id is generated

@parveen
  Scenario Outline: 
 
    When user enters all the fields"<fname>","<lname>","<email>","<address>","<phno>"
    And user click on submit button
   Then user should be displayed the customer id is generated

    Examples: 
      | fname    | lname | email           | address | phno        |
      | java    | jdk | parveen@gmail.com | chennai | 12344556667 |
      | selenium |tool| rihana@gmail.com |trichy| 8678578449 |
      | cucumber | jenkins | tharik@gmail.com | chennai | 543479667 |
      | testng   | pom| ashraf@gmail.com | banglore | 1896958009|
      | junit    | unit | imran@gmail.com | chennai | 12344556667 |
