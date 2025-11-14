package utills;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;




    public class ScrollUtils {

        private WebDriver driver;
        private JavascriptExecutor js;


        public ScrollUtils(WebDriver driver) {
            this.driver = driver;
            this.js = (JavascriptExecutor) driver;
        }

        public void scrollByPixels(int pixels) {
            js.executeScript("window.scrollBy(0, " + pixels + ")");
        }
    }


