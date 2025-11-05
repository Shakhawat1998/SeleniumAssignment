package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//h2[text()='Welcome to our store']")
    WebElement welcomeText;

    @FindBy(xpath = "//a[text()='Register']")
    WebElement registerButton;

    @FindBy(xpath = "//a[text()='Log in']")
    WebElement loginButton;

    @FindBy(xpath = "//a[text()='Log out']")
    WebElement logoutButton;

    @FindBy(xpath = "//a[@class='ico-account']")
    WebElement myAccountLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isWelcomeTextVisible() {
        return welcomeText.isDisplayed();
    }

    public void clickRegister() {
        registerButton.click();
    }

    public boolean isLogoutVisible() {
        return logoutButton.isDisplayed();
    }

    public void clickLogout() {
        logoutButton.click();
    }

    public boolean isLoginVisible() {
        return loginButton.isDisplayed();
    }

    public void clickLogin() {
        loginButton.click();
    }

    public boolean isMyAccountVisible() {
        return myAccountLink.isDisplayed();
    }
}
