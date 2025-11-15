package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductPage;
import utills.ScrollUtils;
import utills.WaitUtils;

import java.io.File;
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
        productPage.closeMessage();
        Thread.sleep(10000);
    }

    @Test(priority = 10, description = "Verify that wishlist page is not empty")
    public void verifyWishlistPageIsNotEmpty() throws InterruptedException {
        ScrollUtils scroll = new ScrollUtils(driver);
        scroll.scrollByPixels(0);
        wishlistPage.clickWishlistLink();
        Assert.assertTrue(wishlistPage.isUpdateWishlistButtonDisplayed(),"Wishlist page is empty");
    }

    @Test(priority = 11, description = "Verify that digital product is downloaded successfully")
    public void verifyDigitalProductDownloaded() throws InterruptedException {
        wishlistPage.clickDigitalDownloadLink();
        ScrollUtils scroll = new ScrollUtils(driver);
        scroll.scrollByPixels(300);
        wishlistPage.clickDigitalProductLink();
        wishlistPage.clickDownloadSampleButton();
        Thread.sleep(5000);
        String downloadPath = "C:\\Users\\BS01347\\Downloads";
        String fileName = "Night_Vision_1.txt";
        File file = new File(downloadPath + "\\" + fileName);
        Assert.assertTrue(file.exists(), "Downloaded file does NOT exist in the download folder!");

    }

}
