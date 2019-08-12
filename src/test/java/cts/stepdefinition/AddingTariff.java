package cts.stepdefinition;

import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddingTariff {
	static WebDriver driver;
	@Given("User can  Launch the browser.")
public void user_can_Launch_the_browser()  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RESHMA\\parcts\\Junit\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/");	  
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[text()='Add Customer'][1]")).click();
	    driver.findElement(By.xpath("//label[text()='Done']")).click();
		System.out.println("Given 2 was Done");	
	}
	@When("User click the Addcustomer Details.")
public void user_click_the_Addcustomer_Details(DataTable cusdetails) {
	 Map<String, String>cusData= cusdetails.asMap(String.class,String.class); 
	 driver.findElement(By.id("fname")).sendKeys(cusData.get("fname"));
	    driver.findElement(By.id("lname")).sendKeys(cusData.get("lname"));
	    driver.findElement(By.id("email")).sendKeys(cusData.get("email"));
	    driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(cusData.get("address"));
	    driver.findElement(By.id("telephoneno")).sendKeys(cusData.get("phno"));
	    driver.findElement(By.xpath("//input[@name='submit']")).click();
	}
	
	@When("User click the Addcustomer Details{string},{string},{string},{string},{string}")
	public void user_click_the_Addcustomer_Details(String A, String B, String C, String D, String E) {
		
		 driver.findElement(By.id("fname")).sendKeys(A);
		    driver.findElement(By.id("lname")).sendKeys(B);
		    driver.findElement(By.id("email")).sendKeys(C);
		    driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(D);
		    driver.findElement(By.id("telephoneno")).sendKeys(E);
		    driver.findElement(By.xpath("//input[@name='submit']")).click();
	   
	}
@When("user click the Add tariff Details.")
public void user_click_the_Add_tariff_Details(DataTable tariffdetails) {
		Map<String,String> tariff= tariffdetails.asMap(String.class,String.class);
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
	@Then("I validate  Outcomes.")
public void i_validate_Outcomes() {
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]")).isDisplayed());
	    System.out.println("Sucessfully run the codes");
	    
	}


}
