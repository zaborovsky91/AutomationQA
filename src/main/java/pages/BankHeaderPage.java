package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankHeaderPage {

    @FindBy(id= "statements-statement")
    public WebElement linkStatementsPage;

    @FindBy(id = "currency-exchange")
    public WebElement linkCurrencyPage;

    @FindBy(id = "accounts-index")
    public WebElement dropDownMenuStatements;

    @FindBy(id = "currency-rates")
    public WebElement dropDownMenuCurrency;

    @FindBy(id = "messages-button")
    public WebElement buttomMessages;

    @FindBy(id = "settings-button")
    public WebElement linkUserSettings;

}
