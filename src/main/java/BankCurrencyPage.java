import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankCurrencyPage {

    @FindBy(xpath = "//*[@id=\"acc1\"]/option[4]")
    public WebElement usdAccounts;

    @FindBy(xpath = "//*[@id=\"acc2\"]/option[2]")
    public WebElement rubAccounts;

    @FindBy(xpath = "//*[@id=\"acc1\"]")
    public WebElement dropDownMenuOutgoingAccounts;

    @FindBy(xpath = "//*[@id=\"acc2\"]")
    public WebElement dropDownMenuIncommingAccounts;

    @FindBy(xpath = "//*[@id=\"from-amount\"]")
    public WebElement fieldAmmountSale;

    @FindBy(xpath = "//*[@id=\"payment-details\"]/div/textarea")
    public WebElement paymentDetails;

    @FindBy(id = "forward")
    public WebElement buttomCalculate;

    public BankCurrencyPage moveDropdownMenuOutgoingAccounts() {
        Actions builder = new Actions(Browser.getBrowser());
        builder.moveToElement(dropDownMenuOutgoingAccounts).build().perform();
        return PageFactory.initElements(Browser.getBrowser(), BankCurrencyPage.class);
    }

    public BankCurrencyPage chooseUsdAccounts() {
        usdAccounts.click();
        return PageFactory.initElements(Browser.getBrowser(), BankCurrencyPage.class);
    }

    public String getAmountFromUsdAccounts() {
        String amountUsdAccountsInText = usdAccounts.getText();
        String amountUsdAccountsWithoutText = amountUsdAccountsInText.split(":")[1].split("\\$")[0];
        return (amountUsdAccountsWithoutText);
    }

    public BankCurrencyPage inputAmountInUsd() {
        String amountInUsd = getAmountFromUsdAccounts();
        fieldAmmountSale.sendKeys(amountInUsd);
        return PageFactory.initElements(Browser.getBrowser(), BankCurrencyPage.class);

    }

    public BankCurrencyPage moveDropdownMenuIncommingAccounts() {
        Actions builder = new Actions(Browser.getBrowser());
        builder.moveToElement(dropDownMenuIncommingAccounts).build().perform();
        return PageFactory.initElements(Browser.getBrowser(), BankCurrencyPage.class);
    }

    public BankCurrencyPage chooseRubAccounts() {
        rubAccounts.click();
        return PageFactory.initElements(Browser.getBrowser(), BankCurrencyPage.class);
    }

    public BankCurrencyPage inputPaymentDetails() {
        paymentDetails.sendKeys("Перевод на рублевый счет");
        return PageFactory.initElements(Browser.getBrowser(), BankCurrencyPage.class);
    }

    public BankVerifyCurrencyTransferPage clickButtomCalculate() {
        buttomCalculate.click();
        return PageFactory.initElements(Browser.getBrowser(), BankVerifyCurrencyTransferPage.class);
    }

}
