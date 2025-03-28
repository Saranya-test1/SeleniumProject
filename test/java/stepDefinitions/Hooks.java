package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.BasePage;
import utils.DriverFactory;

public class Hooks {
	private WebDriver driver;
	 private BasePage basePage;
	
	@Before
	public void setup() {
		 driver = DriverFactory.getDriver();
	        basePage = new BasePage(driver);
	        //basePage.openApplication();
	        System.out.println("Browser launched and navigated to Demoblaze.");
	    }
	    
	
	@After
	public void teardown() {
		DriverFactory.quitDriver();
	}

}
