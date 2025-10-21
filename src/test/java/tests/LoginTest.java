package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        driver.get("https://example.com/login"); // Change this to your real URL
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("admin");
        loginPage.enterPassword("password");
        loginPage.clickLogin();
        // Add assertions here
    }
}
