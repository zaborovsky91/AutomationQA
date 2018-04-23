import org.openqa.selenium.support.PageFactory;

public class Navigation {

    public static FacebookMainPage openFacebookMainPage() {
        Browser.browser.navigate().to("https://www.facebook.com/");
        return PageFactory.initElements(Browser.browser, FacebookMainPage.class);
    }

    public static BankLoginPage openBankLoginPage() {
        Browser.browser.navigate().to("https://idemo.bspb.ru/");
        return PageFactory.initElements(Browser.browser, BankLoginPage.class);
    }
}
