import framework.Browser;
import framework.Navigation;
import framework.ParserCsv;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

import static org.testng.Assert.assertTrue;

public class BankRegressionTest {

    @BeforeClass
    public void browser() {
        Browser.openBrowser();
    }

    @DataProvider(name = "csv")
    public Iterator<Object[]> searchFromCsv() {
        return ParserCsv.loadDataFromFile();
    }

    @Test(priority = 1)
    public void loginToBank() {
        String userLogin = Navigation.openBankLoginPage()
                .clickLoginButtom()
                .clickConfirmPhoneButtom()
                .clickLinkUserSettings()
                .openLinkChangeLogin()
                .getUserLogin();
        assertTrue(userLogin.contains("demo"), "Sign in successful && Login is correct");
    }

    @Test(priority = 2)
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

    @Test(priority = 3)
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

    @Test(dataProvider = "csv", priority = 4)
    public void sendMessages(String textMessages) throws InterruptedException {
        String textSendMessages = Navigation.openBankLoginPage()
                .clickLoginButtom()
                .clickConfirmPhoneButtom()
                .clickMessagesButtom()
                .clickNewMessages()
                .chooseSubjectMessage()
                .inputTextToMessages(textMessages)
                .clickSentMessages()
                .getTextSendMessages();
        assertTrue(textSendMessages.contains("Прочее\n" + textMessages), "The message is not present");
    }

    @AfterMethod
    public void takeScreenShotOnFailure(ITestResult testResult) throws IOException {
        if (testResult.getStatus() == ITestResult.FAILURE) {
            File scrFile = ((TakesScreenshot)Browser.getBrowser()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File("errorScreenshots\\" + testResult.getName() + "-"
                    + Arrays.toString(testResult.getParameters()) +  ".jpg"));
        }
    }

    @AfterTest
    public void closeBrowser() {
        Browser.closeBrowser();
    }
}

