package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    @FindBy(xpath = "//h1[text()='Register']")
    WebElement registerPageText;

    @FindBy(id = "gender-male")
    WebElement maleCheckbox;

    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @FindBy(id = "LastName")
    WebElement lastNameField;

    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(id = "Company")
    WebElement companyField;

    @FindBy(id = "Password")
    WebElement passwordField;

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @FindBy(id = "register-button")
    WebElement registerButton;

    @FindBy(xpath = "//div[text()='Your registration completed']")
    WebElement registrationSuccessMessage;

    @FindBy(xpath = "//a[text()='Continue']")
    WebElement continueButton;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public boolean isRegisterPageDisplayed() {
        return registerPageText.isDisplayed();
    }

    public void fillRegistrationForm(String first, String last, String email, String company, String password) {
        maleCheckbox.click();
        firstNameField.sendKeys(first);
        lastNameField.sendKeys(last);
        emailField.sendKeys(email);
        companyField.sendKeys(company);
        passwordField.sendKeys(password);
        confirmPasswordField.sendKeys(password);
    }

    public void clickRegister() {
        registerButton.click();
    }

    public boolean isRegistrationSuccessful() {
        return registrationSuccessMessage.isDisplayed();
    }

    public void clickContinue() {
        continueButton.click();
    }
}
