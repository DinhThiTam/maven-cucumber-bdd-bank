package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSteps {
	WebDriver driver;
	
	@Given("^Open facebook application$")
	public void openFacebookApplication()   {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}

	@When("^Input to Username textbox$")
	public void inputToUsernameTextbox()  {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("dttam@gmail.com");
	
	}

	@When("^Input to Password textbox$")
	public void inputToPasswordTextbox()  {
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("123456");
}

	@When("^Input to Username textbox with \"([^\"]*)\"$")
	public void input_to_Username_textbox_with(String username) {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(username);
		
	}

	@When("^Input to Password textbox	with \"([^\"]*)\"$")
	public void input_to_Password_textbox_with(String password)  {
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
	}

	@When("^Click to Login button$")
	public void clickToLoginButton()  {
		driver.findElement(By.name("login")).click();
}
	
	@And("^Close application$")
	public void closeApplication()  {
		 driver.quit();
	    }

}
