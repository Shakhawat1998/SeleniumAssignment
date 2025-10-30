package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//h2[text()='Welcome to our store']")
    WebElement welcomeMessage;

    @FindBy(xpath = "//a[text()='Register']")
    WebElement registerButton;

    @FindBy(xpath = "//a[text()='Log out']")
    WebElement logoutButton;

    @FindBy(xpath = "//a[text()='My account']")
    WebElement myAccountLink;

    @FindBy(xpath = "//a[text()='Log in']")
    WebElement loginButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isWelcomeMessageDisplayed() {
        return welcomeMessage.isDisplayed();
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

    public void clickLogin() {
        loginButton.click();
    }

    public boolean isLogoutDisplayed() {
        return logoutButton.isDisplayed();
    }


    public boolean isLoginDisplayed() {
        return loginButton.isDisplayed();
    }

    public boolean isMyAccountDisplayed() {
        return myAccountLink.isDisplayed();
    }

    public void clickLogout() {
        logoutButton.click();
    }



}
