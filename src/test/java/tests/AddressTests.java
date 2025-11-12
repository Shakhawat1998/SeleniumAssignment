package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddressPage;
import pages.MyAccountPage;

import java.time.Duration;
import java.util.Random;

public class AddressTests extends BaseTest{

    @Test(priority = 5, description = "Verify user is redirected to my account page")
    public void verifyUserIsRedirectedToMyAccountPage(){
        homePage.clickMyAccount();
        Assert.assertTrue(myAccountPage.isMyAccountHeadingVisible(),"My account heading is not visible");
    }

    @Test(priority = 6, description = "Verify user is redirected to address page")
    public void verifyUserIsRedirectedToAddressPage() throws InterruptedException {
        myAccountPage.clickAddressLink();
        Assert.assertTrue(addressPage.isAddNewAddressHeadingVisible(), "My new address heading is visible");
    }

    @Test(priority = 7, description = "Verify that new address is added by completing address form")
    public void verifyNewAddressIsAddedByCompletingAddressForm(){

        addressPage.clickAddNewButton();
        String email = "user" + new Random().nextInt(10000) + "@test.com";
        addressPage.fillAddressForm("Shakhawat","Hossain",email,"Afghanistan","City 1","Address 1","1234","01234567891");
        addressPage.clickSaveButton();
        Assert.assertTrue(addressPage.isEditButtonDisplayed(),"edit button is not visible after address update");

    }

    @Test(priority = 8, description = "Verify that new password is updated")
    public void verifyNewPasswordIsUpdated() throws InterruptedException {
        myAccountPage.clickChangePasswordLink();
        changePasswordPage.changePasswordPageformFill("123456","123456789","123456789");
        changePasswordPage.clickChangePassword();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(changePasswordPage.isNewPasswordUpdated(),"Password didn't change");
    }
}
