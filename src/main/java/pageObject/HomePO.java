package pageObject;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.HomePageUI;

public class HomePO extends BasePage {
	private WebDriver driver;

	public HomePO(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getMessageDisplayed() {
		waitForElementVisible(driver, HomePageUI.MESSAGE_DISPLAYED);
		return getElementText(driver, HomePageUI.MESSAGE_DISPLAYED);
	}
}
