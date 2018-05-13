package pages;

import framework.Browser;
import framework.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankNewMessagesPage {

    @FindBy(id = "send-button")
    public WebElement buttomSentMessages;

    @FindBy(xpath = "//*[@id=\"new-message-form\"]/div[1]/div[1]/div/select/option[6]")
    public WebElement subjectMessage;

    @FindBy(xpath = "//*[@id=\"message-text\"]/div/textarea")
    public WebElement textAreaMessages;


    public BankNewMessagesPage chooseSubjectMessage() {
        subjectMessage.click();
        return PageFactory.initElements(Browser.getBrowser(), BankNewMessagesPage.class);
    }

    public BankNewMessagesPage inputTextToMessages(String texMessages) throws InterruptedException {
        Thread.sleep(1000);
        //Utils.waitForElementPresent(textAreaMessages);
        textAreaMessages.sendKeys(texMessages);
        return PageFactory.initElements(Browser.getBrowser(), BankNewMessagesPage.class);
    }

    public BankCorrespondencePage clickSentMessages() {
        buttomSentMessages.click();
        return PageFactory.initElements(Browser.getBrowser(), BankCorrespondencePage.class);
    }


}
