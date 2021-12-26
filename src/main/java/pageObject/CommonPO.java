package pageObject;

import org.openqa.selenium.WebDriver;

import commons.BasePage;

public class CommonPO extends BasePage {
	private WebDriver driver;

	public CommonPO(WebDriver driver) {
		this.driver = driver;
	}
	
}
