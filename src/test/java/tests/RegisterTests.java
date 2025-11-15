package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utills.WaitUtils;

import java.time.Duration;
import java.util.Random;

public class RegisterTests extends BaseTest {

    @Test(description = "Verify homepage welcome message is visible")
    public void verifyHomePageWelcomeText(){
        Assert.assertTrue(homePage.isWelcomeTextVisible(), "Welcome text is not visible!");

    }

    @Test(description = "Register user with all fields and logout", priority = 1)
    public void registerUserWithAllFields()  {
        homePage.clickRegister();
        Assert.assertTrue(registerPage.isRegisterTextVisible(), "Register page is not visible!");

        String email = "user" + new Random().nextInt(10000) + "@test.com";
        registerPage.fillFullRegistration("Shakhawat", "Hossain", email, "BS23", "123456");
        registerPage.clickRegisterButton();
        WaitUtils.setImplicitWait(driver, 10);
        Assert.assertTrue(registerPage.isRegistrationSuccessVisible(), "Registration success message not visible!");
        registerPage.clickContinueButton();
        WaitUtils.setImplicitWait(driver, 10);
        Assert.assertTrue(homePage.isLogoutVisible(), "Logout button not visible after registration!");
        homePage.clickLogout();
        WaitUtils.setImplicitWait(driver, 10);
        Assert.assertTrue(homePage.isLoginVisible(), "Login button not visible after logout!");
    }

    @Test(description = "Register user with only mandatory fields", priority = 2)
    public void registerUserWithMandatoryFields() {
        homePage.clickRegister();
        Assert.assertTrue(registerPage.isRegisterTextVisible(), "Register page not visible!");

        savedEmail = "User" + new Random().nextInt(10000) + "@test.com";
        savedPassword = "123456";

        registerPage.fillMandatoryFields("Jane", "Doe", savedEmail, savedPassword);
        registerPage.clickRegisterButton();
        WaitUtils.setImplicitWait(driver, 10);
        Assert.assertTrue(registerPage.isRegistrationSuccessVisible(), "Mandatory registration failed!");
        registerPage.clickContinueButton();
        Assert.assertTrue(homePage.isLogoutVisible(), "Logout button not visible after mandatory registration!");
    }

    @Test(description = "Logout after mandatory registration", priority = 3)
    public void logoutAfterMandatoryRegistration() {
        homePage.clickLogout();
        Assert.assertTrue(homePage.isLoginVisible(), "Login button not visible after logout!");
    }
}
