package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class AddingTarifff {
	static WebDriver driver;
	@Given("user should be telecom homepage")
	public void user_should_be_telecom_homepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RESHMA\\parcts\\Practise\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");

	}

	@Given("user should navigate to Addtariffplan page")
	public void user_should_navigate_to_Addtariffplan_page() {
		   driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("user should enter plan details")
	public void user_should_enter_plan_details() {
		driver.findElement(By.id("rental1")).sendKeys("399");
		driver.findElement(By.xpath("//input[@name='local_minutes']")).sendKeys("2000");
		driver.findElement(By.xpath("//input[@name= 'inter_minutes']")).sendKeys("1000");
		driver.findElement(By.xpath("//input[@id='sms_pack']")).sendKeys("400");
		driver.findElement(By.xpath("//input[@id='minutes_charges']")).sendKeys("256");
		driver.findElement(By.xpath("(//div[@style='font-weight:300']/input)[6]")).sendKeys("452");
		driver.findElement(By.xpath("//input[@id='sms_charges']")).sendKeys("1");
	}
	@When("user should enter plan details.")
	public void user_should_enter_plan_details(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		
		driver.findElement(By.id("rental1")).sendKeys(data.get(1).get(0));
		driver.findElement(By.xpath("//input[@name='local_minutes']")).sendKeys(data.get(3).get(1));
		driver.findElement(By.xpath("//input[@name= 'inter_minutes']")).sendKeys(data.get(3).get(1));
		driver.findElement(By.xpath("//input[@id='sms_pack']")).sendKeys(data.get(3).get(2));
		driver.findElement(By.xpath("//input[@id='minutes_charges']")).sendKeys(data.get(3).get(5));
		driver.findElement(By.xpath("(//div[@style='font-weight:300']/input)[6]")).sendKeys(data.get(3).get(4));
		driver.findElement(By.xpath("//input[@id='sms_charges']")).sendKeys(data.get(3).get(6));
	}

	@When("user should enter plan detail")
	public void user_should_enter_plan_detail(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);	
	driver.findElement(By.id("rental1")).sendKeys(data.get(1).get("MR"));
	driver.findElement(By.xpath("//input[@name='local_minutes']")).sendKeys(data.get(3).get("IM"));
	driver.findElement(By.xpath("//input[@name= 'inter_minutes']")).sendKeys(data.get(3).get("LM"));
	driver.findElement(By.xpath("//input[@id='sms_pack']")).sendKeys(data.get(3).get("SMS"));

	}
	@When("user should submit the plan details")
	public void user_should_submit_the_plan_details() {
		   driver.findElement(By.xpath("//ul[@class='actions']/li/input")).click();
	}


}
