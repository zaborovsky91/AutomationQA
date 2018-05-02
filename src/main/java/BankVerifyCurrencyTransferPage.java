import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BankVerifyCurrencyTransferPage {

    @FindBy(xpath = "//*[@id=\"confirm\"]")
    public WebElement buttomConfirmTransferCurency;


    public  BankResultTransferCurrencyPage clickButtomConfirmTransferCurency() throws InterruptedException {
        Thread.sleep(2000);
        buttomConfirmTransferCurency.click();
        return PageFactory.initElements(Browser.browser,  BankResultTransferCurrencyPage.class);
    }

}
