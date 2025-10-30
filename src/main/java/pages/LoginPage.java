package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//h1[text()='Welcome, Please Sign In!']")
    WebElement loginPageHeader;

    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(id = "Password")
    WebElement passwordField;

    @FindBy(xpath = "//button[text()='Log in']")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isLoginPageDisplayed() {
        return loginPageHeader.isDisplayed();
    }

    public void login(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}
