package stepDefinitions;


import org.openqa.selenium.WebDriver;

import commons.BasePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageUIs.LoginPageUI;

public class LoginPageSteps extends BasePage{
	WebDriver driver;
	static String loginPageURL;
	
	public LoginPageSteps() {
		this.driver = Hooks.openAndQuitBrowser();;
	}
	
	@Given("^Get login page Url$")
	public void getLoginPageUrl() {
		loginPageURL = getPageURL(driver);
	}

	@Given("^Open to Register Page$")
	public void openToRegisterPage() {
	  waitForElementClickable(driver, LoginPageUI.HERE_LINK);
	  clickToElement(driver, LoginPageUI.HERE_LINK);
	}


	@When("^Submit valid info to form login$")
	public void submitValidInfoToFormLogin() {
		waitForElementVisible(driver, LoginPageUI.USERID_TEXTBOX);
		senkeyToElement(driver, LoginPageUI.USERID_TEXTBOX, RegisterPageSteps.userName);
		
		waitForElementVisible(driver, LoginPageUI.USERID_TEXTBOX);
		senkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, RegisterPageSteps.password);
		
		waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);

	}

}
