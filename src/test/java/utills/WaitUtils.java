package utills;

import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class WaitUtils {

    // Generic implicit wait setup
    public static void setImplicitWait(WebDriver driver, int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }
}
