import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class BankRegressionTest {

    @BeforeClass
    public void browser() {
        Browser.openBrowser();
    }

    @Test (priority=1)
    public void loginToBank() {
        String userLogin = Navigation.openBankLoginPage()
                .clickLoginButtom()
                .clickConfirmPhoneButtom()
                .clickLinkUserSettings()
                .openLinkChangeLogin()
                .getUserLogin();
        assertTrue(userLogin.contains("demo"), "Sign in successful && Login is correct");
    }

    @Test (priority=2)
    public void checkBalance() {
        double valueAmmountOutgoingBalance = Navigation.openBankLoginPage()
                .clickLoginButtom()
                .clickConfirmPhoneButtom()
                .moveDropdownMenuStatements()
                .clickLinkStatementsPage()
                .clickPeriodLink()
                .getAmmountOutgoingBalance();
        assertTrue(valueAmmountOutgoingBalance > 0, "Outgoing balance is not positive");
    }

    @Test (priority=3)
    public void saleOfCurrency() {
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
        assertTrue(notification.contains("Перевод выполнен!"), "Translation failed");
    }

    @Test (priority=4)
    public void sendMessages() throws InterruptedException {
        String textSendMessages = Navigation.openBankLoginPage()
                .clickLoginButtom()
                .clickConfirmPhoneButtom()
                .clickMessagesButtom()
                .clickNewMessages()
                .chooseSubjectMessage()
                .inputTextToMessages()
                .clickSentMessages()
                .getTextSendMessages();
        assertTrue(textSendMessages.contains("Прочее\n" + "Тестовое сообщение"), "The message is not present");
    }

    @AfterTest
    public void closeBrowser() {
        Browser.closeBrowser();
    }
}

