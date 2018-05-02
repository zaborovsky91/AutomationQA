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
    public void saleOfCurrency() throws InterruptedException {
        String notification = Navigation.openBankLoginPage()
                .clickLoginButtom()
                .clickConfirmPhoneButtom()
                .moveDropdownMenuCurrency()
                .clickLinkCurrencyPage()
                .moveDropdownMenuOutgoingAccounts()
                .chooseUsdAccounts()
                .inputAmountInUsd()
                .moveDropdownMenuIncommingAccounts()
                .chooseRubAccounts()
                .inputPaymentDetails()
                .clickButtomCalculate()
                .clickButtomConfirmTransferCurency()
                .getNotificationConfirmTransferCurrency();
        System.out.println(notification);



                //.getAmmountOutgoingBalance();
        //assertTrue(valueAmmountOutgoingBalance > 0, "outgoing balance is not positive");

    }



   @AfterTest
    public void closeBrowser() {
        Browser.closeBrowser();
    }
}