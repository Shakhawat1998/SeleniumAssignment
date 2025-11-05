package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test(description = "Login using credentials from mandatory registration", priority = 4)
    public void loginWithMandatoryCredentials() {
        homePage.clickLogin();
        loginPage.login(savedEmail, savedPassword);
        Assert.assertTrue(homePage.isMyAccountVisible(), "My account link not visible — login failed!");
    }
}
