package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankResultTransferCurrencyPage {

    @FindBy(css = "#alerts-container>div.alert.alert-success")
    public WebElement notificationConfirmTransferCurrency;


    public String getNotificationConfirmTransferCurrency() {
        return notificationConfirmTransferCurrency.getText();
    }

}
