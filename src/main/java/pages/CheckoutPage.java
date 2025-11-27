package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckoutPage extends BasePage {

    @FindBy(xpath = "(//a[normalize-space()='Electronics'])[1]")
    WebElement electronicsCategoryLink;

    @FindBy(xpath = "(//a[normalize-space()='Apparel'])[1]")
    WebElement apparelCategoryLink;

    @FindBy(xpath = "(//a[normalize-space()='Digital downloads'])[1]")
    WebElement digitalDownloadCategory;

    @FindBy(xpath = "(//button[text()='Add to cart'])[1]")
    WebElement electronicsProductAddToCartButton;

    @FindBy(xpath = "(//button[text()='Add to cart'])[3]")
    WebElement apparelProductAddToCartButton;

    @FindBy(xpath = "(//button[text()='Add to cart'])[2]")
    WebElement digitalDownloadProductAddToCartButton;

    @FindBy(xpath = "(//p[@class='content'])[1]")
    WebElement productAddedToCartMessage;

    @FindBy(xpath = "(//span[@title='Close'])[1]")
    WebElement messageCloseButton;

    @FindBy(xpath = "(//span[@class='cart-label'])[1]")
    WebElement shoppingCartButton;

    @FindBy(xpath = "//table[@class='cart']//tbody//tr")
    private  List<WebElement>ShoppingCartProductList;

    @FindBy(id="checkout_attribute_1")
    WebElement giftWrappingDropdown;

    @FindBy(xpath = "(//div[@class='selected-checkout-attributes'])[1]")
    WebElement selectedCheckoutAttributes;

    @FindBy(xpath = "//tbody/tr/td[6]")
    private List<WebElement>productPrices;

    double subTotal = 0.0;
    double Total = 0.0;

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }


    public void clickElectronicsCategoryLink(){
        electronicsCategoryLink.click();
    }

    public void clickApparelCategoryLink(){
        apparelCategoryLink.click();
    }

    public void clickDigitalDownloadsLink(){
        digitalDownloadCategory.click();
    }

    public void addElectronicsProductToCart(){
        electronicsProductAddToCartButton.click();
    }

    public void addApparelProductToCart(){
        apparelProductAddToCartButton.click();
    }

    public void addDigitalDownloadProductToCart(){
        digitalDownloadProductAddToCartButton.click();
    }

    public boolean isProductAddedToCartMessageVisible(){
        return productAddedToCartMessage.isDisplayed();
    }

    public void clickMessageCloseButton(){
        messageCloseButton.click();
    }

    public void clickShoppingCartButton(){
        shoppingCartButton.click();
    }

    public int getProductCount(){
        return ShoppingCartProductList.size();
    }

    public void selectYesInGiftWrappingDropdown(){
        new Select(giftWrappingDropdown).selectByValue("2");
    }

    public String getSelectedGiftWrappingDropdownText(){
        return new Select(giftWrappingDropdown).getFirstSelectedOption().getText();
    }

    public double getGiftWrappingAmount(){
        String fullText = selectedCheckoutAttributes.getText();
        String GiftWrappingText = fullText.split("\n")[0];
        String amount = GiftWrappingText.replaceAll(".*\\[\\+\\$(.*?)\\].*", "$1");
        double giftWrappingAmount = Double.parseDouble(amount);
        return giftWrappingAmount;

    }

    public double getPackageAmount(){
        String fullText = selectedCheckoutAttributes.getText();
        String PackageText = fullText.split("\n")[1];
        String amount = PackageText.replaceAll(".*\\[\\+\\$(.*?)\\].*", "$1");
        double packageAmount = Double.parseDouble(amount);
        return packageAmount;

    }

    public void getTotal(){
        for(WebElement priceElement: productPrices){
            String priceText = priceElement.getText().trim();
            double priceValue = Double.parseDouble(priceText.replace("$", ""));
            subTotal+=priceValue;
        }
        Total = subTotal + getGiftWrappingAmount() + getPackageAmount();
        System.out.println(Total);
    }

}
