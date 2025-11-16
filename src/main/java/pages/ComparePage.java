package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ComparePage extends BasePage {

    @FindBy(xpath = "(//a[normalize-space()='Jewelry'])[1]")
    WebElement JewelryCategoryLink;

    @FindBy(xpath = "(//button[text()=\"Add to compare list\"])[2]")
    WebElement product1AddToWishlistButton;

    @FindBy(xpath = "(//button[text()=\"Add to compare list\"])[3]")
    WebElement product2AddToWishlistButton;

    @FindBy(xpath = "(//a[normalize-space()='Compare products list'])[1]")
    WebElement compareProductListLink;

    @FindBy(xpath = "//table/tbody/tr[3]/td")
    private List<WebElement> thirdRowCells;


    public ComparePage(WebDriver driver) {
        super(driver);
    }

    public void clickJewelryCategoryLink(){
        JewelryCategoryLink.click();
    }

    public void addProduct1ToWishlist(){
        product1AddToWishlistButton.click();
    }

    public void addProduct2ToWishlist(){
        product2AddToWishlistButton.click();
    }

    public  void clickCompareProductListLink(){
        compareProductListLink.click();
    }

    public int getThirdRowCellCount() {
        return thirdRowCells.size();
    }

}
