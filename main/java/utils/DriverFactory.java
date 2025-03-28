package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	private static WebDriver driver;

	/*
	 * private DriverManager() {
	 * 
	 * }
	 */
	public static WebDriver getDriver() {
		if (driver == null) {
			/*
			 * if (browser.equalsIgnoreCase("chrome")) {
			 * System.setProperty("webdriver.chrome.driver",
			 * "C:\\WebDriver\\chromedriver-win64\\chromedriver.exe"); driver = new
			 * ChromeDriver(); }
			 */
			/*
			 * System.out.println("Initializing webdriver"); driver = new ChromeDriver();
			 * driver.manage().window().maximize();
			 */

			System.setProperty("webdriver.chrome.driver", "C:/WebDriver/chromedriver-win64/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			// ChromeOptions options = ChromeDriver(options);

		}
		return driver;
	}

	/*
	 * public static WebDriver getDriver() { if(driver == null) {
	 * initializeDriver(); } return driver; }
	 */
	public static void quitDriver() {
		if (driver != null) {
			System.out.println("Closing Webdriver");
			driver.quit();
			driver = null;
		}
	}

}
