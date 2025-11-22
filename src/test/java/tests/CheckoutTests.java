package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import utills.ScrollUtils;
import utills.WaitUtils;

public class CheckoutTests extends BaseTest {
    @Test(priority = 13, description = "Verify that one product from 3 different categories successfully added to cart")
    public void verifyThatOneProductFrom3DifferentCategoriesSuccessfullyAddedToCart() throws InterruptedException {
        ScrollUtils scroll = new ScrollUtils(driver);
        scroll.scrollByPixels(0);
        checkoutPage.clickElectronicsCategoryLink();
        scroll.scrollByPixels(700);
        checkoutPage.addElectronicsProductToCart();
        WaitUtils.setImplicitWait(driver,10);
        Assert.assertTrue(checkoutPage.isProductAddedToCartMessageVisible(),"Electronics Product not added to cart");
        checkoutPage.clickMessageCloseButton();
        Thread.sleep(5000);
        scroll.scrollByPixels(0);
        checkoutPage.clickApparelCategoryLink();
        scroll.scrollByPixels(700);
        checkoutPage.addApparelProductToCart();
        WaitUtils.setImplicitWait(driver,10);
        Assert.assertTrue(checkoutPage.isProductAddedToCartMessageVisible(),"Apparel Product not added to cart");
        checkoutPage.clickMessageCloseButton();
        Thread.sleep(5000);
        scroll.scrollByPixels(0);
        checkoutPage.clickDigitalDownloadsLink();
        scroll.scrollByPixels(700);
        checkoutPage.addDigitalDownloadProductToCart();
        WaitUtils.setImplicitWait(driver,10);
        Assert.assertTrue(checkoutPage.isProductAddedToCartMessageVisible(),"Digital Download Product not added to cart");
        checkoutPage.clickMessageCloseButton();


    }



}
