package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.HomePage;
import pages.RegisterPage;
import pages.LoginPage;

public class BaseTest {

    protected static WebDriver driver;
    protected static HomePage homePage;
    protected static RegisterPage registerPage;
    protected static LoginPage loginPage;

    // Shared data across tests
    protected static String savedEmail;
    protected static String savedPassword;

    @BeforeSuite
    public void setUpSuite() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
    }

    @AfterSuite
    public void tearDownSuite() {
        if (driver != null) {
            driver.quit();
        }
    }
}
