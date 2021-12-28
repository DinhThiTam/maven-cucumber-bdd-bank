package pageObject;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.LoginPageUI;

public class LoginPO extends BasePage{
	private WebDriver driver;

	public LoginPO(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickToHereLink() {
		  waitForElementClickable(driver, LoginPageUI.HERE_LINK);
		  clickToElement(driver, LoginPageUI.HERE_LINK);
		}
	
	public void submitValidInfoToFormLogin(String userName, String password ) {
		waitForElementVisible(driver, LoginPageUI.USERID_TEXTBOX);
		senkeyToElement(driver, LoginPageUI.USERID_TEXTBOX, userName);
		
		waitForElementVisible(driver, LoginPageUI.USERID_TEXTBOX);
		senkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
		
		waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);

	}
	
	public String getLoginPageUrl() {
		return getPageURL(driver);
	}
	

}
