package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddressPage;
import pages.MyAccountPage;

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
}
