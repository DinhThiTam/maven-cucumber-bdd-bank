package pageObject;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.RegisterPageUI;

public class RegisterPO extends BasePage {
	private WebDriver driver;

	public RegisterPO(WebDriver driver) {
		this.driver = driver;
	}

	public void inputToUsername(String value) {
		waitForElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
		senkeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, value);

	}

	public void clickToSubmitButtonOnPage() {
		waitForElementClickable(driver, RegisterPageUI.SUBMIT_BUTTON);
		clickToElement(driver, RegisterPageUI.SUBMIT_BUTTON);

	}

	public String getUserName() {
		waitForElementVisible(driver, RegisterPageUI.GET_USER_ID);
		return getElementText(driver, RegisterPageUI.GET_USER_ID);
	}

	public String getPassword() {
		waitForElementVisible(driver, RegisterPageUI.GET_PASS_ID);
		return getElementText(driver, RegisterPageUI.GET_PASS_ID);
	}

	public void backToLoginPage(String url) {
		driver.navigate().to(url);
	}

}
