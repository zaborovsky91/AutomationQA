package framework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Utils {

    public static void clickWithJS (WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) Browser.getBrowser();
        executor.executeScript("arguments[0].click();", element);
    }


    public static boolean waitForElementPresent (WebElement element) {
        try{
            WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), 12);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
}

