package framework;

import org.openqa.selenium.support.PageFactory;
import pages.BankLoginPage;
import pages.FacebookMainPage;

public class Navigation {

    public static FacebookMainPage openFacebookMainPage() {
        Browser.getBrowser().get("https://www.facebook.com/");
        return PageFactory.initElements(Browser.getBrowser(), FacebookMainPage.class);
    }

    public static BankLoginPage openBankLoginPage() {
        Browser.getBrowser().get("https://idemo.bspb.ru/");
        return PageFactory.initElements(Browser.getBrowser(), BankLoginPage.class);
    }

   }
