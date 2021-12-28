package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;
import pageObject.HomePO;
import pageObject.PageGerneratorManager;

public class HomePageSteps {
	WebDriver driver;
	HomePO homePage;
	public HomePageSteps() {
		this.driver = Hooks.openAndQuitBrowser();
		homePage = PageGerneratorManager.getHomePage(driver);
	}

	@Then("^Home page is displayed$")
	public void homePageIsDisplayed() {
	  Assert.assertEquals(homePage.getMessageDisplayed(), "Welcome To Manager's Page of Guru99 Bank");
	}
}
