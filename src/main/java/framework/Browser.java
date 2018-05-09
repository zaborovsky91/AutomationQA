package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class Browser {


    public static ThreadLocal<WebDriver> browser = new ThreadLocal<>();

    public static WebDriver getBrowser() {
        return browser.get();
    }

    public static void openBrowser() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("chrome.switches", "--disable-extensions");
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");
        System.setProperty("webdriver.chrome.driver", "./target/classes/chromedriver.exe");
        options.addArguments("--test-type");

        browser.set(new ChromeDriver(options));
        browser.get().manage().window().maximize();
        browser.get().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    public static void closeBrowser() {
        getBrowser().quit();
    }

}
