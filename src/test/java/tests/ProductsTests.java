package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ScrollUtils;
import utils.WaitUtils;

import java.io.File;

public class ProductsTests extends BaseTest{
    @Test(priority = 10,description = "Verify that a product is added to wishlist")
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
        Thread.sleep(5000);

    }

    @Test(priority = 11, description = "Verify that wishlist page is not empty")
    public void verifyWishlistPageIsNotEmpty() throws InterruptedException {
        ScrollUtils scroll = new ScrollUtils(driver);
        scroll.scrollByPixels(0);
        wishlistPage.clickWishlistLink();
        Assert.assertTrue(wishlistPage.isUpdateWishlistButtonDisplayed(),"Wishlist page is empty");
    }

    @Test(priority = 12, description = "Verify that digital product is downloaded successfully")
    public void verifyDigitalProductDownloaded() throws InterruptedException {
        wishlistPage.clickDigitalDownloadLink();
        ScrollUtils scroll = new ScrollUtils(driver);
        scroll.scrollByPixels(300);
        wishlistPage.clickDigitalProductLink();
        wishlistPage.clickDownloadSampleButton();
//        Thread.sleep(5000);
        WaitUtils.setImplicitWait(driver,10);
        String downloadPath = "C:\\Users\\BS01347\\Downloads";
        String fileName = "Night_Vision_1.txt";
        File file = new File(downloadPath + "\\" + fileName);
        Assert.assertTrue(file.exists(), "Downloaded file does NOT exist in the download folder!");

    }

    @Test(priority = 13, description = "Verify that two products are added to compare list")
    public void verifyTwoProductsAreAddedToCompareList() throws InterruptedException {
        comparePage.clickJewelryCategoryLink();
        ScrollUtils scroll = new ScrollUtils(driver);
        scroll.scrollByPixels(500);
        comparePage.addProduct1ToWishlist();
        Thread.sleep(5000);
        comparePage.addProduct2ToWishlist();
        Thread.sleep(5000);
        WaitUtils.setImplicitWait(driver,10);
        scroll.scrollByPixels(500);
        comparePage.clickCompareProductListLink();
        scroll.scrollByPixels(500);
        Thread.sleep(5000);
        int productCount = comparePage.getThirdRowCellCount() - 1;
        Assert.assertTrue(productCount == 2 ,"Product count in compare list is not equal to 2");

    }




}
