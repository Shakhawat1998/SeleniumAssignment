package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pages.*;
import utils.ReportManager;

import java.lang.reflect.Method;

public class BaseTest {

    protected static WebDriver driver;

    protected static ExtentReports extent;
    protected static ExtentTest test;

    protected static HomePage homePage;
    protected static RegisterPage registerPage;
    protected static LoginPage loginPage;
    protected static MyAccountPage myAccountPage;
    protected static AddressPage addressPage;
    protected static ChangePasswordPage changePasswordPage;
    protected static ProductPage productPage;
    protected static WishlistPage wishlistPage;
    protected static ComparePage comparePage;
    protected static CheckoutPage checkoutPage;

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
        comparePage = new ComparePage(driver);
        checkoutPage = new CheckoutPage(driver);


        extent = ReportManager.getReportInstance();

    }

    @BeforeMethod
    public void beforeMethod(Method method) {
        // Create a test node for each @Test method
        test = extent.createTest(method.getName());
        test.info("Starting test: " + method.getName());
    }

    @AfterSuite
    public void tearDownSuite() {

        if (extent != null) {
            extent.flush();
        }



        if (driver != null) {
            driver.quit();
        }
    }
}
