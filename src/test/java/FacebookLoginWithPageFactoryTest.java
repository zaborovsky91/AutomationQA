import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FacebookLoginWithPageFactoryTest {

    public static final String LOGIN = "conspiracion@mail.ru";
    public static final String PASSWORD = "291722a";

    @BeforeClass
    public void browser() {
        Browser.openBrowser();
    }

    @Test
    public void loginToFacebook() {
        String textLabelLogout = Navigation.openFacebookMainPage()
                .enterCreditinalsAndSubmit(LOGIN, PASSWORD)
                .clickOnNavigationLabelMenu()
                .getLabelLogout();
        Assert.assertTrue(textLabelLogout.contains("Выйти"), "Sign in successful && Logout is present");
    }

    @AfterTest
    public void closeBrowser() {
        Browser.closeBrowser();
    }
}
