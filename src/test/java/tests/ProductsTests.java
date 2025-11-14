package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import utills.ScrollUtils;

public class ProductsTests extends BaseTest{
    @Test(priority = 9,description = "Verify that a product is added to wishlist")
    public void verifyProductIsAddedToWishlist() throws InterruptedException {
        homePage.goBackToHomePage();
        ScrollUtils scroll = new ScrollUtils(driver);
        scroll.scrollByPixels(800);
        productPage.clickProductLink();
        scroll.scrollByPixels(800);
        productPage.selectRam("2 GB");
        productPage.selectHDD();
        productPage.clickAddToWishlistButton();
        Thread.sleep(5000);

    }
}
