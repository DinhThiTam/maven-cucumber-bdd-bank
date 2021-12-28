package stepDefinitions;


import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;

public class HomePageSteps {
	WebDriver driver;
	
	public HomePageSteps() {
		this.driver = Hooks.openAndQuitBrowser();
	}


	
	

	@Then("^Home page is displayed$")
	public void homePageIsDisplayed() {
	  
	 
	}
}
