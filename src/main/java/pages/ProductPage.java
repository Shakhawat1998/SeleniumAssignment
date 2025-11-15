package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductPage extends BasePage{

    @FindBy(xpath = "//a[normalize-space()='Build your own computer']")
    WebElement productLink;

    @FindBy( id = "product_attribute_2")
    WebElement ramDropdown;

    @FindBy(id ="product_attribute_3_6")
    WebElement hDDCheckbox;


    @FindBy(id ="add-to-wishlist-button-1")
    WebElement addToWishlistButton;

    @FindBy(xpath = "//p[@class='content']")
    WebElement productAddedToWishlistMessage;



    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickProductLink(){
        productLink.click();
    }

    public void selectRam(String option){
        new Select(ramDropdown).selectByVisibleText(option);
    }

    public void selectHDD(){
        hDDCheckbox.click();
    }

    public void clickAddToWishlistButton(){
        addToWishlistButton.click();
    }

    public boolean isProductAddedToWishlistMessageDisplayed(){
        return productAddedToWishlistMessage.isDisplayed();
    }
}
