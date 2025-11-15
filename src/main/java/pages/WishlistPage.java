package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishlistPage extends BasePage{

    @FindBy(xpath = "//span[@class='wishlist-label']")
    WebElement wishlistLink;

    @FindBy(id = "updatecart")
    WebElement updateWishlistButton;


    @FindBy(xpath = "(//a[normalize-space()='Digital downloads'])[1]")
    WebElement digitalDownloadsCategoryLink;


    @FindBy(xpath = "//img[@title='Show details for Night Visions']")
    WebElement digitalProductLink;

    @FindBy(xpath = "//a[text()='Download sample']")
    WebElement downloadSampleButton;

    public WishlistPage(WebDriver driver) {
        super(driver);
    }

    public void clickWishlistLink(){
        wishlistLink.click();
    }

    public boolean isUpdateWishlistButtonDisplayed(){
        return updateWishlistButton.isDisplayed();
    }

    public void clickDigitalDownloadLink(){
        digitalDownloadsCategoryLink.click();
    }

    public void clickDigitalProductLink(){
        digitalProductLink.click();
    }

    public void clickDownloadSampleButton(){
        downloadSampleButton.click();
    }


}
