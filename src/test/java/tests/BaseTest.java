package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.*;

public class BaseTest {

    protected static WebDriver driver;

    protected static HomePage homePage;
    protected static RegisterPage registerPage;
    protected static LoginPage loginPage;
    protected static MyAccountPage myAccountPage;
    protected static AddressPage addressPage;
    protected static ChangePasswordPage changePasswordPage;
    protected static ProductPage productPage;
    protected static WishlistPage wishlistPage;

    // Shared data across tests
    protected static String savedEmail;
    protected static String savedPassword;


    @BeforeSuite
    public void setUpSuite() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://test470.nop-station.com/");
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
        myAccountPage = new MyAccountPage(driver);
        addressPage = new AddressPage(driver);
        changePasswordPage = new ChangePasswordPage(driver);
        productPage = new ProductPage(driver);
        wishlistPage = new WishlistPage(driver);

    }

    @AfterSuite
    public void tearDownSuite() {
        if (driver != null) {
            driver.quit();
        }
    }
}
