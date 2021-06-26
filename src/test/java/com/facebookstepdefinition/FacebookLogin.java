package com.facebookstepdefinition;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class FacebookLogin {
     
	@When("user fill up the details")
	public void user_fill_up_the_details(DataTable dataTable) {
		List<String> list = dataTable.asList();
		Hooks.driver.findElement(By.id("email")).sendKeys(list.get(0));
		Hooks.driver.findElement(By.id("pass")).sendKeys(list.get(1));
	    
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
	  Hooks.driver.findElement(By.xpath("//*[@name='login']")).click();
	 
	}

	@Then("user verifies home page")
	public void user_verifies_home_page() {
		
	   
	}


}
