package cts.stepdefinition;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class Firstdaycucumber {
	static WebDriver driver;
	@Given("User launch the browser")
	public void user_launch_the_browser() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RESHMA\\parcts\\Junit\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("h  Sttp://demo.guru99.com/telecom/");
	}

	@When("User click the addCustomer")
	public void user_click_the_addCustomer() {
		System.out.println("When");
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("Entered valid details.")
	public void entered_valid_details() {
	    driver.findElement(By.xpath("//label[text()='Done']")).click();
	    System.out.println("When2");
	    driver.findElement(By.id("fname")).sendKeys("parveen");
	    driver.findElement(By.id("lname")).sendKeys("rihana");
	    driver.findElement(By.id("email")).sendKeys("parveenam95@gmail.com");
	    driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("chennai");;
	    driver.findElement(By.id("telephoneno")).sendKeys("97645638");
	    driver.findElement(By.xpath("//input[@name='submit']")).click();
	}
	
	@When("Entered valid details")
	public void entered_valid_details(DataTable cusDetails) {
		
		Map<String, String> datas = cusDetails.asMap(String.class, String.class);
		 driver.findElement(By.xpath("//label[text()='Done']")).click();
		   System.out.println("When2");
		    driver.findElement(By.id("fname")).sendKeys(datas.get("fname"));
		    driver.findElement(By.id("lname")).sendKeys(datas.get("lname"));
		    driver.findElement(By.id("email")).sendKeys(datas.get("email"));
		    driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(datas.get("address"));;
		    driver.findElement(By.id("telephoneno")).sendKeys(datas.get("phno"));
		    driver.findElement(By.xpath("//input[@name='submit']")).click();
	  
	}
	@SuppressWarnings("deprecation")
	@Then("I validate the outcomes")
public void i_validate_the_outcomes() {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
}


}
