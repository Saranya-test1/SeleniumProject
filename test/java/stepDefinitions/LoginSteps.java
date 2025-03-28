package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import utils.DriverFactory;
import pages.BasePage;

public class LoginSteps {
	private WebDriver driver;
	 private LoginPage loginPage; 
	
	 public LoginSteps() {  // Constructor
	        this.driver = DriverFactory.getDriver();  // Get WebDriver instance
	        this.loginPage = new LoginPage(driver);   // Pass WebDriver to LoginPage
	    }

	@Given("User launches the Demoblaze website")
	public void user_launches_demoblaze_website() {
		/*
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://www.demoblaze.
		 * driver = DriverFactory.getDriver(); basePage = new BasePage(driver); // Pass
		 * WebDriver instance basePage.openApplication();
		 com/"); BasePage basePage = new
		 * BasePage(driver);
		 */
		/**/
		loginPage.openApplication();
	}

	@When("User logs in with {string} and {string}")
	public void user_logs_in(String username, String password) {
		//loginPage = new LoginPage();
		loginPage.clickLoginButton();
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.submitLogin();
	}

	@Then("User should be logged in successfully")
	public void verify_login() throws InterruptedException {
		// Assert.assertTrue(loginPage.isUserLoggedIn());
		loginPage.isUserLoggedIn();
		Thread.sleep(1000);
	}

}