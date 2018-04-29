import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BankLoginTest {

    @BeforeClass
    public void browser() {
        Browser.openBrowser();
    }

    @Test
    public void loginToBank() {
        String textUserLogin = Navigation.openBankLoginPage()
                .clickLoginButtom()
                .clickConfirmPhoneButtom()
                .clickLinkUserSettings()
                .openLinkChangeLogin()
                .getUserLogin();
        System.out.println(textUserLogin);
        //Assert.assertTrue(textUserLogin.contains("demo"), "Sign in successful && Login is correct");
    }

    @AfterTest
    public void closeBrowser() {
        Browser.closeBrowser();
    }
}