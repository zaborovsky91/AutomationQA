import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class BankSaleOfCurrencyTest {

    @BeforeClass
    public void browser() {
        Browser.openBrowser();
    }

    @Test
    public void loginToBank() {
        Navigation.openBankLoginPage()
                .clickLoginButtom()
                .clickConfirmPhoneButtom()
                .moveDropdownMenuCurrency()
                .clickLinkCurrencyPage()
                .moveDropDownMenuAccounts()
                .chooseDollarsAccounts()
                .getAmmountFromDollarsAccounts();
                //.getAmmountOutgoingBalance();
        //assertTrue(valueAmmountOutgoingBalance > 0, "outgoing balance is not positive");

    }



   //@AfterTest
    //public void closeBrowser() {
       // Browser.closeBrowser();
    //}
}