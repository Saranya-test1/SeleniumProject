package pages;


import org.openqa.selenium.WebDriver;

import utils.DriverFactory;

public class BasePage {
	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	/*
	 * public void openApplication() { driver.get("https://www.demoblaze.com/"); }
	 */

	/*
	 * public class BasePage() { BasePage.driver = driver;
	 * PageFactory.initElements(driver, this); }
	 */

	/*
	 * public static WebDriver getDriver() { return driver; }
	 */
}
