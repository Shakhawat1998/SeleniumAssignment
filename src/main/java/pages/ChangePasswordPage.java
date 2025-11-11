package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordPage extends BasePage {

    @FindBy(id = "OldPassword")
    WebElement oldPasswordInputField;

    @FindBy(id = "NewPassword")
    WebElement newPasswordInputField;

    @FindBy(id ="ConfirmNewPassword")
    WebElement confirmNewPasswordInputField;

    @FindBy(xpath = "//button[normalize-space()='Change password']")
    WebElement changePasswordButton;

    @FindBy(xpath = "(//p[@class='content'])[1]")
    WebElement passwordUpdatedMessage;



    public ChangePasswordPage(WebDriver driver) {
        super(driver);
    }


    public void changePasswordPageformFill(String oldpassword, String newpassword, String confirmnewpassword){
        oldPasswordInputField.sendKeys(oldpassword);
        newPasswordInputField.sendKeys(newpassword);
        confirmNewPasswordInputField.sendKeys(confirmnewpassword);
    }

    public void clickChangePassword(){
        changePasswordButton.click();
    }

    public boolean isNewPasswordUpdated(){
        return passwordUpdatedMessage.isDisplayed();
    }
}
