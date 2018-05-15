package pages;

import framework.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankVerifyCurrencyTransferPage {

    @FindBy(id = "confirm")
    public WebElement buttomConfirmTransferCurency;

    @FindBy(id = "confirmation-frame")
    public WebElement getIframe;

    public BankResultTransferCurrencyPage clickButtomConfirmTransferCurency() {
        Browser.getBrowser().switchTo().frame(getIframe);
        buttomConfirmTransferCurency.click();
        Browser.getBrowser().switchTo().defaultContent();
        return PageFactory.initElements(Browser.getBrowser(), BankResultTransferCurrencyPage.class);
    }

}
