import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class BankCheckBalanceTest {

    @BeforeClass
    public void browser() {
        Browser.openBrowser();
    }

    @Test
    public void loginToBank() {
        double valueAmmountOutgoingBalance = Navigation.openBankLoginPage()
                .clickLoginButtom()
                .clickConfirmPhoneButtom()
                .moveDropdownMenuStatements()
                .clickLinkStatementsPage()
                .clickPeriodLink()
                .getAmmountOutgoingBalance();
        assertTrue(valueAmmountOutgoingBalance > 0, "outgoing balance is not positive");

    }



   @AfterTest
    public void closeBrowser() {
        Browser.closeBrowser();
    }
}