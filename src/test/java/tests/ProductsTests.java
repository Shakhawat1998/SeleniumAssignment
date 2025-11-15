package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductPage;
import utills.ScrollUtils;
import utills.WaitUtils;

import java.time.Duration;

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
        WaitUtils.setImplicitWait(driver, 10);
        Assert.assertTrue(productPage.isProductAddedToWishlistMessageDisplayed(),"product is not added to wishlist");

    }
}
