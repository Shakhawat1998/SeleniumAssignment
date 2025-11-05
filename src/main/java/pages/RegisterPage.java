package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    @FindBy(xpath = "//h1[text()='Register']")
    WebElement registerText;

    @FindBy(id = "gender-male")
    WebElement maleCheckbox;

    @FindBy(id = "FirstName")
    WebElement firstNameInput;

    @FindBy(id = "LastName")
    WebElement lastNameInput;

    @FindBy(id = "Email")
    WebElement emailInput;

    @FindBy(id = "Company")
    WebElement companyInput;

    @FindBy(id = "Password")
    WebElement passwordInput;

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordInput;

    @FindBy(id = "register-button")
    WebElement registerSubmit;

    @FindBy(xpath = "//div[text()='Your registration completed']")
    WebElement registrationSuccessMessage;

    @FindBy(xpath = "//a[text()='Continue']")
    WebElement continueButton;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public boolean isRegisterTextVisible() {
        return registerText.isDisplayed();
    }

    public void fillFullRegistration(String fname, String lname, String email, String company, String password) {
        maleCheckbox.click();
        firstNameInput.sendKeys(fname);
        lastNameInput.sendKeys(lname);
        emailInput.sendKeys(email);
        companyInput.sendKeys(company);
        passwordInput.sendKeys(password);
        confirmPasswordInput.sendKeys(password);
    }

    public void fillMandatoryFields(String fname, String lname, String email, String password) {
        firstNameInput.sendKeys(fname);
        lastNameInput.sendKeys(lname);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        confirmPasswordInput.sendKeys(password);
    }

    public void clickRegisterButton() {
        registerSubmit.click();
    }

    public boolean isRegistrationSuccessVisible() {
        return registrationSuccessMessage.isDisplayed();
    }

    public void clickContinueButton() {
        continueButton.click();
    }
}
