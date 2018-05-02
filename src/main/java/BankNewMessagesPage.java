import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankNewMessagesPage {

    @FindBy(id = "send-button")
    public WebElement buttomSentMessages;

    @FindBy (xpath = "//*[@id=\"new-message-form\"]/div[1]/div[1]/div/select/option[6]")
    public WebElement subjectMessage;

    @FindBy (xpath = "//*[@id=\"message-text\"]/div/textarea")
    public WebElement textAreaMessages;


    public BankNewMessagesPage chooseSubjectMessage() {
        subjectMessage.click();
        return PageFactory.initElements(Browser.browser, BankNewMessagesPage.class);
    }

    public BankNewMessagesPage inputTextToMessages () throws InterruptedException {
        Thread.sleep(1000);
        textAreaMessages.sendKeys("Тестовое сообщение");
        return PageFactory.initElements(Browser.browser, BankNewMessagesPage.class);
    }

    public BankCorrespondencePage clickSentMessages () {
        buttomSentMessages.click();
        return PageFactory.initElements(Browser.browser, BankCorrespondencePage.class);
    }



}