package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishlistPage extends BasePage{

    @FindBy(xpath = "//span[@class='wishlist-label']")
    WebElement wishlistLink;

    @FindBy(id = "updatecart")
    WebElement updateWishlistButton;

    public WishlistPage(WebDriver driver) {
        super(driver);
    }

    public void clickWishlistLink(){
        wishlistLink.click();
    }

    public boolean isUpdateWishlistButtonDisplayed(){
        return updateWishlistButton.isDisplayed();
    }


}
