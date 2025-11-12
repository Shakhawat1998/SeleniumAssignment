package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ProductsTests extends BaseTest{
    @Test(priority = 9,description = "Verify that a product is added to wishlist")
    public void verifyProductIsAddedToWishlist() throws InterruptedException {
        homePage.goBackToHomePage();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 800)");
        Thread.sleep(5000);
    }
}
