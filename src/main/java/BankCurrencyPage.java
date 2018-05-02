import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankCurrencyPage {

    @FindBy(xpath = "//*[@id=\"acc1\"]/option[4]")
    public WebElement usdAccounts;

    @FindBy(xpath = "//*[@id=\"acc2\"]/option[2]")
    public WebElement rubAccounts;

    @FindBy (xpath = "//*[@id=\"acc1\"]")
    public WebElement dropDownMenuOutgoingAccounts;

    @FindBy (xpath = "//*[@id=\"acc2\"]")
    public WebElement dropDownMenuIncommingAccounts;

    @FindBy (xpath = "//*[@id=\"from-amount\"]")
    public WebElement fieldAmmountSale;

    @FindBy (xpath = "//*[@id=\"payment-details\"]/div/textarea")
    public WebElement paymentDetails;

    @FindBy (id = "forward")
    public WebElement buttomCalculate;

    public BankCurrencyPage moveDropdownMenuOutgoingAccounts () {
        Actions builder = new Actions(Browser.browser);
        builder.moveToElement(dropDownMenuOutgoingAccounts).build().perform();
        return PageFactory.initElements(Browser.browser, BankCurrencyPage.class);
    }

    public BankCurrencyPage chooseUsdAccounts() {
        usdAccounts.click();
        return PageFactory.initElements(Browser.browser, BankCurrencyPage.class);
    }

    public String getAmountFromDollarsAccounts () {
        String amountDollarsAccountsInText = usdAccounts.getText();
        String amountDollarsAccountsWithoutText = amountDollarsAccountsInText.split(":")[1].split("\\$")[0];
        return (amountDollarsAccountsWithoutText);
    }

    public BankCurrencyPage inputAmountInUsd () {
        String amountInDollars = getAmountFromDollarsAccounts();
        fieldAmmountSale.sendKeys(amountInDollars);
        return PageFactory.initElements(Browser.browser, BankCurrencyPage.class);

    }

    public BankCurrencyPage moveDropdownMenuIncommingAccounts () {
        Actions builder = new Actions(Browser.browser);
        builder.moveToElement(dropDownMenuIncommingAccounts).build().perform();
        return PageFactory.initElements(Browser.browser, BankCurrencyPage.class);
    }

    public BankCurrencyPage chooseRubAccounts() {
        rubAccounts.click();
        return PageFactory.initElements(Browser.browser, BankCurrencyPage.class);
    }

    public BankCurrencyPage inputPaymentDetails () {
        paymentDetails.sendKeys("Перевод на рублевый счет");
        return PageFactory.initElements(Browser.browser, BankCurrencyPage.class);
    }

    public BankVerifyCurrencyTransferPage clickButtomCalculate () {
        buttomCalculate.click();
        return PageFactory.initElements(Browser.browser, BankVerifyCurrencyTransferPage.class);
    }

}
