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

    //@Test(priority = 15,description = "Verify that all 3 products are visible in shopping cart")
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


    //@Test(priority = 16,description = "Verify that gift wrapping dropdown option is selected as yes")
    public void verifyThatGiftWrappingOptionIsSelectedAsYes() throws InterruptedException {
        ScrollUtils scroll = new ScrollUtils(driver);
        scroll.scrollByPixels(400);
        Thread.sleep(5000);
        checkoutPage.selectYesInGiftWrappingDropdown();
        WaitUtils.setImplicitWait(driver,10);
        String selectedGiftWrappingDropdownText = checkoutPage.getSelectedGiftWrappingDropdownText();
        Assert.assertEquals(selectedGiftWrappingDropdownText,"Yes [+$10.00]");

    }


    //@Test(priority = 17, description = "Verify that gift wrapping amount is added properly when selected yes")
    public void verifyThatGiftWrappingAmountIsAddedProperlyWhenSelectedYes() throws InterruptedException {
        Thread.sleep(2000);
        double giftWrappingAmount = checkoutPage.getGiftWrappingAmount();
        Assert.assertTrue(giftWrappingAmount > 0);
    }

    //@Test(priority = 18, description = "Verify that total price is correct")
    public void verifyThatTotalPriceIsCorrect() throws InterruptedException {
        Thread.sleep(2000);
        ScrollUtils scroll = new ScrollUtils(driver);
        scroll.scrollByPixels(-200);
        Thread.sleep(2000);
        Double Total;
        checkoutPage.getTotal();
    }







}
