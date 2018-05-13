package framework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

    public static void clickWithJS(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) Browser.getBrowser();
        executor.executeScript("arguments[0].click();", element);
    }


   // public static void waitForElementPresent(WebElement element) {
    //    WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), 2);
    //        wait.until(ExpectedConditions.elementToBeClickable(element));

    //}
}

