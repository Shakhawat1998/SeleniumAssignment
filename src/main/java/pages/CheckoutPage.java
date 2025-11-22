package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
}
