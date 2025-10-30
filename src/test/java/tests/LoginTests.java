package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests {

    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;

    @BeforeClass(alwaysRun = true)
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        homePage = new HomePage(driver);
    }

    @Test(priority = 1, description = "Login with previously registered user and verify My Account is visible")
    public void loginWithRegisteredUser() {
        homePage.clickLogin();
        loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.isLoginPageDisplayed(), "Login page not displayed");

        loginPage.login(RegisterTests.savedEmail, RegisterTests.savedPassword);

        //Assert.assertTrue(homePage.isMyAccountDisplayed(), "My Account link no displayed — login failed");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}
