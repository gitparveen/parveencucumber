$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Addcustomer.feature");
formatter.feature({
  "name": "Add Customer functionality",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user should be in telecom home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Addingcustomer.user_should_be_in_telecom_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on add customer button",
  "keyword": "And "
});
formatter.match({
  "location": "Addingcustomer.user_click_on_add_customer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "add customer with valid data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@cucumber"
    }
  ]
});
formatter.step({
  "name": "user enters all the fields",
  "keyword": "When "
});
formatter.match({
  "location": "Addingcustomer.user_enters_all_the_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Addingcustomer.user_click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be displayed the customer id is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "Addingcustomer.user_should_be_displayed_the_customer_id_is_generated()"
});
formatter.result({
  "status": "passed"
});
});