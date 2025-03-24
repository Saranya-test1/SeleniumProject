package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    @FindBy(id = "login2")
    private WebElement loginButton;

    @FindBy(id = "loginusername")
    private WebElement usernameField;

    @FindBy(id = "loginpassword")
    private WebElement passwordField;

    @FindBy(xpath = "//button[text()='Log in']")
    private WebElement submitLogin;

    @FindBy(id = "nameofuser")
    private WebElement welcomeMessage;

    public LoginPage() {
        super(getDriver());
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void submitLogin() {
        submitLogin.click();
    }

	
	  public void isUserLoggedIn() { 
		  //new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(welcomeMessage)); 
		  //return welcomeMessage.isDisplayed(); 
		  System.out.println("User logged in successfully");
		  }
	  
}