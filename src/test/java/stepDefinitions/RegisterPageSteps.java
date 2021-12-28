package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObject.PageGerneratorManager;
import pageObject.RegisterPO;
import pageUIs.RegisterPageUI;
import utilities.DataUtil;

public class RegisterPageSteps extends BasePage {
	WebDriver driver;
	RegisterPO registerPage;
	TestContext testcontext;
	DataUtil fakeData;

	public RegisterPageSteps(TestContext testcontext) {
		this.driver = Hooks.openAndQuitBrowser();
		this.testcontext = testcontext;
		fakeData = DataUtil.getData();
		registerPage = PageGerneratorManager.getRegisterPage(driver);

	}

	@When("^Input to Username$")
	public void inputToUsername() {
		registerPage.inputToUsername(fakeData.getEmailAddress());

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
