package cts.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioAdding {
	static WebDriver driver;
	@Given("User can launch the browser.")
public void user_can_launch_the_browser()  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RESHMA\\parcts\\Junit\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/");	  
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[text()='Add Customer'][1]")).click();
	    driver.findElement(By.xpath("//label[text()='Done']")).click();
		System.out.println("Given 2 was Done");	
	    }
	@When("User add customer details {string},{string},{string},{string},{string}")
public void user_add_customer_details(String s1, String s2, String s3, String s4, String s5) {
		    driver.findElement(By.id("fname")).sendKeys(s1);
		    driver.findElement(By.id("lname")).sendKeys(s2);
		    driver.findElement(By.id("email")).sendKeys(s3);
		    driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(s4);
		    driver.findElement(By.id("telephoneno")).sendKeys(s5);
		    driver.findElement(By.xpath("//input[@name='submit']")).click();
	}
@When("User click the add tarrify details.")
public void user_click_the_add_tarrify_details()  {
	System.out.println("Enter customer id");
	WebElement cid = driver.findElement(By.tagName("h3"));
	String cusId = cid.getText();
      driver.findElement(By.xpath("//a[text()='Home']")).click();
	  driver.findElement(By.xpath("(//a[text()='Add Tariff Plan to Customer'])[1]")).click();
      driver.findElement(By.id("customer_id")).sendKeys(cusId);
	  driver.findElement(By.xpath("//input[@name='submit']")).click();
	  driver.findElement(By.xpath("//input[@class='fit']")).click();
	  driver.findElement(By.xpath("//a[text()='Home']")).click();
	 	}
	@Then("I validate the outcomes.")
public void i_validate_the_outcomes(){
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]")).isDisplayed());
	    System.out.println("Sucessfully run the codes");	
	}
}
