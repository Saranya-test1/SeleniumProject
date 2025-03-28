package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import pages.CartPage;
import utils.DriverFactory;

public class CartSteps {
	//CartPage cartPage = new CartPage();
	private WebDriver driver;
    private CartPage cartPage;
    
    public CartSteps() {
        this.driver = DriverFactory.getDriver();  // Get WebDriver instance
        this.cartPage = new CartPage(driver);   // Pass WebDriver to CartPage
    }
    
	@When("User adds {string} to the cart")
	public void user_adds_product(String productName) {
		cartPage.clickProduct();
		cartPage.addToCart();
	}

	@Then("The product should be added to the cart")
	public void verify_product_added() {
		cartPage.goToCart();
		cartPage.isProductAdded();
		// Assert.assertTrue(cartP.isDisplayed(), "Product is not displayed in the cart!");}
	}

	/*
	 * @And("The discount should be displayed correctly") public void
	 * check_discount() { String discount = cartPage.getDiscount();
	 * Assert.assertNotNull(discount); System.out.println("Discount displayed: " +
	 * discount); }
	 */
}