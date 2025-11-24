package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ScrollUtils;
import utils.WaitUtils;

public class CheckoutTests extends BaseTest {
    @Test(priority = 14, description = "Verify that one product from 3 different categories successfully added to cart")
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

    @Test(priority = 15,description = "Verify that all 3 products are visible in shopping cart")
    public void verifyThatAll3ProductsAreVisibleInShoppingCart() throws InterruptedException {
        Thread.sleep(5000);
        ScrollUtils scroll = new ScrollUtils(driver);
        scroll.scrollByPixels(0);
        checkoutPage.clickShoppingCartButton();
        scroll.scrollByPixels(300);
        WaitUtils.setImplicitWait(driver,10);
        int productCountInShoppingCart = checkoutPage.getProductCount();
        Assert.assertTrue(productCountInShoppingCart == 3, "number of products added in shopping cart is not three");
    }





}
