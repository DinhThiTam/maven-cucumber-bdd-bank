package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObject.CommonPO;
import pageObject.PageGerneratorManager;
import utilities.DataUtil;

public class CommonPageSteps {
	WebDriver driver;
	CommonPO commonPage;
	DataUtil fakeData;
	String emailAddress;
	
	public CommonPageSteps() {
		this.driver = Hooks.openAndQuitBrowser();
		commonPage = PageGerneratorManager.getCommonPage(driver);
		fakeData = DataUtil.getData();
		emailAddress = fakeData.getEmailAddress();
	}
	
	@Given("^Open \"([^\"]*)\" page$")
	public void openPage(String menuLink)  {
	   commonPage.clickToMenuLinkByText(menuLink);
	  
	}

	@When("^Input to \"([^\"]*)\" textbox with value \"([^\"]*)\"$")
	public void inputToTextboxWithValue(String fieldName, String inputValue)  {
		if (fieldName.equals("E-mail")) {
			inputValue = emailAddress;
		}
		commonPage.enterToTextboxByFieldName(fieldName, inputValue);
	  
	}

	@When("^Click to \"([^\"]*)\" radio button$")
	public void clickToRadioButton(String radioValue)  {
	    commonPage.clickToRadioButtonByValue(radioValue);
	  
	}

	@When("^Input to \"([^\"]*)\" textarea with value \"([^\"]*)\"$")
	public void inputToTextareaWithValue(String fieldName, String inputValue)  {
	    commonPage.enterToTextAreaByFieldName(fieldName, inputValue);
	  
	}

	@When("^Click to \"([^\"]*)\" button$")
	public void clickToButton(String buttonValue)  {
		commonPage.clickToButtonByValueAttribute(buttonValue);
	  
	}

	@Then("^Success message displayed with \"([^\"]*)\"$")
	public void successMessageDisplayedWith(String expectedMessage)  {
		Assert.assertTrue(commonPage.isMessageDisplayedByText(expectedMessage));
	  
	}

	@Then("^The valid value displayed at \"([^\"]*)\" with \"([^\"]*)\"$")
	public void theValidValueDisplayedAtWith(String rowName, String expectedValue)  {
		if (rowName.equals("Email")) {
			expectedValue = emailAddress;
		}
	    Assert.assertEquals(commonPage.getValueByRowName(rowName), expectedValue);
	}
}
