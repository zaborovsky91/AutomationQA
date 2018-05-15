package framework;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;


public class Utils {

    public static void clickWithJS(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) Browser.getBrowser();
        executor.executeScript("arguments[0].click();", element);
    }


    public static void waitForElementPresent(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), 3);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForElementPresent2 (String element) {
        WebDriverWait wait = new WebDriverWait(Browser.getBrowser(), 33);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(element)));
    }


}

