import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class Browser {

    public static ChromeDriver browser;

    public static void openBrowser() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("chrome.switches", "--disable-extensions");
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");
        System.setProperty("webdriver.chrome.driver", "./target/classes/chromedriver.exe");
        options.addArguments("--test-type");

        browser = new ChromeDriver(options);
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    public static void closeBrowser() {
        browser.quit();
    }

}
