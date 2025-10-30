package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;
import pages.RegisterPage;

import java.util.Random;

public class RegisterTests {

    WebDriver driver;
    HomePage homePage;
    RegisterPage registerPage;
    Random random = new Random();

    public static String savedEmail;
    public static String savedPassword;

    @BeforeClass(alwaysRun = true)
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        homePage = new HomePage(driver);
    }

    @Test(priority = 1, description = "Verify home page loads successfully with welcome message visible")
    public void verifyHomePageLoads() {
        Assert.assertTrue(homePage.isWelcomeMessageDisplayed(), "Home page welcome message is not displayed");
    }

    @Test(priority = 2, description = "Verify register page is displayed when clicking the Register button")
    public void verifyRegisterPageDisplayed() {
        homePage.clickRegisterButton();
        registerPage = new RegisterPage(driver);
        Assert.assertTrue(registerPage.isRegisterPageDisplayed(), "Register page is not visible");
    }

    @Test(priority = 3, description = "Verify user can register successfully with valid details")
    public void verifySuccessfulRegistration() {
        int randomNumber = 1000 + random.nextInt(9000); // generates number between 1000–9999
        String Email = "testuser" + randomNumber + "@mail.com";

        registerPage.fillRegistrationForm("Shakhawat", "Hossain", Email, "BS23", "Password@123");
        registerPage.clickRegister();

        Assert.assertTrue(registerPage.isRegistrationSuccessful(), "Registration success message is not displayed");

        registerPage.clickContinue();

        Assert.assertTrue(homePage.isLogoutDisplayed(), "Logout button is not displayed after successful registration");
    }

    @Test(priority = 4, description = "Verify logout functionality works correctly")
    public void verifyLogoutFunctionality() {
        homePage.clickLogout();
        Assert.assertTrue(homePage.isLoginDisplayed(), "Login button is not displayed after logout");

    }


    @Test(priority = 5,description = "Register a new user using only mandatory fields and verify registration success")
    public void verifySuccessfulRegistrationUsingMandatoryFields(){
        homePage.clickRegisterButton();
        int randomNum = 1000 + random.nextInt(9000);
        savedEmail = "testuser" + randomNum + "@mail.com";
        savedPassword = "Password@123";
        registerPage.registerFormUsingMandatoryFields("Shakhawat","Hossain",savedEmail,savedPassword);
        registerPage.clickRegister();
        registerPage.clickContinue();
        Assert.assertTrue(homePage.isLogoutDisplayed(), "Logout is not displayed");

    }

    @Test(priority = 7,description = "Verify logout works and login button appears after logout")
    public void verifyLogoutFunctionalityAfterRegistrationWithMandatoryFields(){
        homePage.clickLogout();
        Assert.assertTrue(homePage.isLoginDisplayed(), "Login button is not displayed after logout");

    }





    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
