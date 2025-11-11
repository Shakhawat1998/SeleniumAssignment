package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

    @FindBy(xpath = "//h1[text()='My account - Customer info']")
    WebElement myAccountHeading;

    @FindBy(xpath = "(//a[normalize-space()='Addresses'])[1]")
    WebElement addressLink;

    @FindBy(xpath = "//a[normalize-space()='Change password']")
    WebElement changePasswordLink;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean isMyAccountHeadingVisible() {
        return myAccountHeading.isDisplayed();
    }

    public void clickAddressLink() {
        addressLink.click();
    }

    public void clickChangePasswordLink(){
        changePasswordLink.click();
    }

}
