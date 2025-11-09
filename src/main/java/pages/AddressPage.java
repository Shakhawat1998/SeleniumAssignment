package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddressPage extends BasePage {

    @FindBy(xpath = "//h1[normalize-space()='My account - Addresses']")
    WebElement addNewAddressHeading;

    @FindBy(xpath = "//button[text()='Add new']")
    WebElement addNewButton;

    @FindBy(id = "Address_FirstName")
    WebElement firstNameInput;

    @FindBy(id = "Address_LastName")
    WebElement lastNameInput;

    @FindBy(id = "Address_Email")
    WebElement emailInput;

    @FindBy(id = "Address_CountryId")
    WebElement countryDropdown;

    @FindBy(id = "Address_StateProvinceId")
    WebElement stateDropdown;

    @FindBy(id = "Address_City")
    WebElement cityInput;

    @FindBy(id = "Address_Address1")
    WebElement address1Input;

    @FindBy(id = "Address_ZipPostalCode")
    WebElement zipCodeInput;

    @FindBy(id = "Address_PhoneNumber")
    WebElement phoneNumberInput;

    @FindBy(xpath = "//button[text()='Save']")
    WebElement saveButton;

    public AddressPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAddNewAddressHeadingVisible() {
        return addNewAddressHeading.isDisplayed();
    }

    public void clickAddNewButton(){
        addNewButton.click();
    }

    public void fillAddressForm(String firstName, String lastName, String email, String country, String state,
                                String city, String address1, String zip, String phone) {

        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        emailInput.sendKeys(email);

        new Select(countryDropdown).selectByVisibleText(country);
        new Select(stateDropdown).selectByVisibleText(state);

        cityInput.sendKeys(city);
        address1Input.sendKeys(address1);
        zipCodeInput.sendKeys(zip);
        phoneNumberInput.sendKeys(phone);
    }

    public void clickSaveButton() {
        saveButton.click();
    }
}
