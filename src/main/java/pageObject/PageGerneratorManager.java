package pageObject;

import org.openqa.selenium.WebDriver;

public class PageGerneratorManager {
	 WebDriver driver;

	private PageGerneratorManager() {
	}
	
	public static HomePO getHomePage (WebDriver driver) {
		return new HomePO(driver);
	}
	
	public static LoginPO getLoginPage (WebDriver driver) {
		return new LoginPO(driver);
	}
	
	public static RegisterPO getRegisterPage (WebDriver driver) {
		return new RegisterPO(driver);
	}
	
	public static CommonPO getCommonPage (WebDriver driver) {
		return new CommonPO(driver);
	}
}
