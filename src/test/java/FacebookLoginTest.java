import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;


public class FacebookLoginTest {

    private WebDriver browser;
    public static final String LOGIN = "";
    public static final String PASSWORD = "";


    @BeforeClass
    public void openBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("chrome.switches", "--disable-extensions");
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");
        System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
        options.addArguments("--test-type");

        browser = new ChromeDriver(options);
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test (groups="test")
    public void testSearch() throws InterruptedException {
        browser.get("https://www.facebook.com/");
        browser.findElement(By.cssSelector("input#email.inputtext")).sendKeys(LOGIN);
        browser.findElement(By.cssSelector("input#pass.inputtext")).sendKeys(PASSWORD);
        browser.findElement(By.xpath(".//*[contains(@class, 'uiButtonConfirm')]")).click();
        browser.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
        String searchTextLogout = browser.findElement(By.xpath("//div/ul[@class='_54nf']")).getText();
        assertTrue(searchTextLogout.contains("Выйти"));
    }

    @AfterClass
    public void closeBrowser() {
        browser.quit();
    }
}

