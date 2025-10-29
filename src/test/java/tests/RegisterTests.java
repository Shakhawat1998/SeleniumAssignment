package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
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

    @BeforeClass(alwaysRun = true)
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        homePage = new HomePage(driver);
    }

    @Test(priority = 1, description = "Verify home page loads successfully with welcome message visible")
    public void verifyHomePageLoads() {
        Assert.assertTrue(homePage.isWelcomeMessageDisplayed(), "Home page welcome message  displayed");
    }

    @Test(priority = 2, description = "Verify register page is displayed when clicking the Register button")
    public void verifyRegisterPageDisplayed() {
        homePage.clickRegisterButton();
        registerPage = new RegisterPage(driver);
        Assert.assertTrue(registerPage.isRegisterPageDisplayed(), "Register page title  visible");
    }

    @Test(priority = 3, description = "Verify user can register successfully with valid details")
    public void verifySuccessfulRegistration() {
        int randomNumber = 1000 + random.nextInt(9000); // generates number between 1000–9999
        String uniqueEmail = "testuser" + randomNumber + "@mail.com";

        registerPage.fillRegistrationForm("John", "Doe", uniqueEmail, "QA Company", "Password@123");
        registerPage.clickRegister();

        Assert.assertTrue(registerPage.isRegistrationSuccessful(), "Registration success message  displayed");

        registerPage.clickContinue();

        Assert.assertTrue(homePage.isLogoutDisplayed(), "Logout button  displayed after successful registration");
    }

    @Test(priority = 4, description = "Verify logout functionality works correctly")
    public void verifyLogoutFunctionality() {
        homePage.clickLogout();

    }


    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
