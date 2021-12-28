package stepDefinitions;


import org.openqa.selenium.WebDriver;

import commons.BasePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObject.LoginPO;
import pageObject.PageGerneratorManager;
import pageUIs.LoginPageUI;

public class LoginPageSteps extends BasePage{
	WebDriver driver;
	LoginPO loginPage;
	TestContext testcontext;
	
	public LoginPageSteps(TestContext testcontext) {
		this.driver = Hooks.openAndQuitBrowser();
		this.testcontext = testcontext;
		loginPage = PageGerneratorManager.getLoginPage(driver);
	}
	
	@Given("^Get login page Url$")
	public void getLoginPageUrl() {
		testcontext.getDataContext().setContext(Context.LOGIN_URL, loginPage.getLoginPageUrl());
		//loginPageURL = loginPage.getLoginPageUrl();
	}

	@When("^Open to Register Page$")
	public void openToRegisterPage() {
	 loginPage.clickToHereLink();
	}


	@When("^Submit valid info to form login$")
	public void submitValidInfoToFormLogin() {
		loginPage.submitValidInfoToFormLogin(RegisterPageSteps.userName, RegisterPageSteps.password);
	}

}
