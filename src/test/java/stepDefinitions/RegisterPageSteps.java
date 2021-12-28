package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObject.PageGerneratorManager;
import pageObject.RegisterPO;
import pageUIs.RegisterPageUI;

public class RegisterPageSteps extends BasePage {
	WebDriver driver;
	RegisterPO registerPage;
	TestContext testcontext;

	static String userName, password;

	public RegisterPageSteps(TestContext testcontext) {
		this.driver = Hooks.openAndQuitBrowser();
		this.testcontext = testcontext;
		registerPage = PageGerneratorManager.getRegisterPage(driver);

	}

	@When("^Input to Username$")
	public void inputToUsername() {
		registerPage.inputToUsername("dttam.cntt@gmail.com");

	}

	@When("^Click to Submit button on page$")
	public void clickToSubmitButtonOnPage() {
		registerPage.clickToSubmitButtonOnPage();

	}

	@Then("^Get username and password$")
	public void getUsernameAndPassword() {
		testcontext.getDataContext().setContext(Context.USER_ID, registerPage.getUserName());
		testcontext.getDataContext().setContext(Context.PASSWORD, registerPage.getPassword());
	}

	@When("^Back to Login page$")
	public void backToLoginPage() {
		registerPage.backToLoginPage(testcontext.getDataContext().getContext(Context.LOGIN_URL));
	}

}
