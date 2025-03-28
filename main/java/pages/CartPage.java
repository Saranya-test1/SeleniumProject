package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends BasePage {
	
	@FindBy(xpath = "//a[normalize-space()='Samsung galaxy s6']")
	private WebElement selectProduct;

	@FindBy(xpath = "//a[normalize-space()='Add to cart']")
	private WebElement addToCartButton;

	@FindBy(id = "cartur")
	private WebElement cartLink;

	@FindBy(xpath = "//tbody/tr[1]/td[2]")
	private WebElement cartProduct;

	@FindBy(xpath = "//td[contains(text(),'Samsung galaxy s6')]/following-sibling::td[2]")
	private WebElement productDiscount;

	public CartPage(WebDriver driver) {
		super(driver);
	    PageFactory.initElements(driver, this);
	}
	
	
	public void clickProduct() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)"); 
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * WebElement element =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//a[normalize-space()='Samsung galaxy s6']"))); element.click();
		 */
		WebElement productLink = driver.findElement(By.xpath("//a[normalize-space()='Samsung galaxy s6']"));
		productLink.click();
		//selectProduct.click();
	}
	
	public void addToCart() {
		//new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
	   
		addToCartButton.click();
	}

	public void goToCart() {
		cartLink.click();
	}

	public void isProductAdded() {
		cartProduct.isDisplayed();
	}

	public String getDiscount() {
		return productDiscount.getText();
	}
}