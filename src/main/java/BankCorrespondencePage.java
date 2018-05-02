import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankCorrespondencePage {

    @FindBy(id = "new-message-btn")
    public WebElement buttomNewMessages;

    @FindBy (xpath = "//*[@id=\"messages\"]")
    public WebElement listMessages;


    public BankNewMessagesPage clickNewMessages () {
        buttomNewMessages.click();
        return PageFactory.initElements(Browser.browser,  BankNewMessagesPage.class);
    }

    public String getTextSendMessages() {
        String textSendMessages = listMessages.getText();
        return (textSendMessages);
    }


}
