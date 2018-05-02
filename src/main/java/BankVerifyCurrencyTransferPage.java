import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BankVerifyCurrencyTransferPage {

    @FindBy(css = "#confirm")
    public WebElement buttomConfirmTransferCurency;


    public  BankResultTransferCurrencyPage clickButtomConfirmTransferCurency() {
        Browser.browser.manage().timeouts();
        buttomConfirmTransferCurency.click();
        return PageFactory.initElements(Browser.browser,  BankResultTransferCurrencyPage.class);
    }

}
