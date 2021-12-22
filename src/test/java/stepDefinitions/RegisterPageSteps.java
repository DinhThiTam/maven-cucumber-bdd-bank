package stepDefinitions;


import org.openqa.selenium.WebDriver;

import commons.BasePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageUIs.RegisterPageUI;

public class RegisterPageSteps extends BasePage {
	WebDriver driver;
	
	static String userName, password;
	public RegisterPageSteps() {
		this.driver = Hooks.openAndQuitBrowser();
	}

	@When("^Input to Username$")
	public void inputToUsername() {
	  waitForElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
	  senkeyToElement(driver,  RegisterPageUI.EMAIL_TEXTBOX, "dttam1@gmail.com");
	 
	}

	@When("^Click to Submit button on page$")
	public void clickToSubmitButtonOnPage() {
		waitForElementClickable(driver, RegisterPageUI.SUBMIT_BUTTON);
	  clickToElement(driver, RegisterPageUI.SUBMIT_BUTTON);
	 
	}

	@Then("^Get username and password$")
	public void getUsernameAndPassword() {
	  waitForElementVisible(driver, RegisterPageUI.GET_USER_ID);
	  userName = getElementText(driver,RegisterPageUI.GET_USER_ID);
	  
	  waitForElementVisible(driver, RegisterPageUI.GET_PASS_ID);
	  password = getElementText(driver,RegisterPageUI.GET_PASS_ID);	 
	}
	
	@When("^Back to Login page$")
	public void backToLoginPage() {
		driver.navigate().to(LoginPageSteps.loginPageURL);
	}


}
