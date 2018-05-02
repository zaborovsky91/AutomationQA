import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class BankSentMessageTest {

    @BeforeClass
    public void browser() {
        Browser.openBrowser();
    }

    @Test
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
        assertTrue(textSendMessages.contains("Прочее\n" + "Тестовое сообщение"));
    }

        @AfterTest
        public void closeBrowser() {
            Browser.closeBrowser();
        }
}