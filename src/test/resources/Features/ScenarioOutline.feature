
Feature: Title of your feature
  I want to use this template for my feature file

 
  Scenario Outline: Title of your scenario outline.
    Given User can launch the browser.
    When User add customer details "<fname>","<lname>","<email>","<address>","<phno>"
    And User click the add tarrify details.
    Then I validate the outcomes.

    Examples: 
      |fname  |lname       |email               |address  | phno     |
      |Rihana |Parveen     |parveenam@gmail.com |chennai  |989693478 |
      |nasrin |server      |nasrin@gmail.com    |cuddalore|985993478 |  
      |Ashraf |Mohammed    |ashraf@gmail.com    |Banglore |697243478 |
      |Tharik |ali         |tharik@gmail.com    |Cuddalore|879709898 |
      |THaj   |nisha       |thajnisha@gmail.com |jkm      |890786927 |
      |Imran  |Khan        |imran@gmail.com     |chennai  |097309708 |
      |Rehman |basheer     |rehman@gmail.com    |chennai  |774696909 |
      
