package pageObject;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.CommonPageUI;

public class CommonPO extends BasePage {
	private WebDriver driver;

	public CommonPO(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterToTextboxByFieldName(String fieldName, String value) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_TEXTBOX, fieldName);
		if (fieldName.equals("Date of Birth")) {
			removeAttributeInDOM(driver, CommonPageUI.DYNAMIC_TEXTBOX, "type", fieldName);
		}
		senkeyToElement(driver, CommonPageUI.DYNAMIC_TEXTBOX, value, fieldName);
	}
	
	public void enterToTextAreaByFieldName(String fieldName, String value) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_TEXTAREA, fieldName);
		senkeyToElement(driver, CommonPageUI.DYNAMIC_TEXTAREA, value, fieldName);
	}
	
	public void clickToButtonByValueAttribute(String valueAttribute) {
		waitForElementClickable(driver,CommonPageUI.DYNAMIC_BUTTON, valueAttribute);
		clickToElement(driver,CommonPageUI.DYNAMIC_BUTTON, valueAttribute);
	}
	
	public void clickToMenuLinkByText(String menuName) {
		waitForElementClickable(driver,CommonPageUI.DYNAMIC_MENU_LINK, menuName);
		clickToElement(driver,CommonPageUI.DYNAMIC_MENU_LINK, menuName);
	}
	
	public boolean isMessageDisplayedByText(String message) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_MESSAGE, message);
		return isElementDisplayed(driver, CommonPageUI.DYNAMIC_MESSAGE, message);
	}
	
	public String getValueByRowName(String rowName) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_VALUE_BY_ROW_NAME, rowName);
		return getElementText(driver, CommonPageUI.DYNAMIC_VALUE_BY_ROW_NAME, rowName);
	}
	
	public void clickToRadioButtonByValue(String radioButtonValue) {
		waitForElementClickable(driver,CommonPageUI.DYNAMIC_RADIO_BUTTON, radioButtonValue);
		clickToElement(driver,CommonPageUI.DYNAMIC_RADIO_BUTTON, radioButtonValue);
	}
	
}
