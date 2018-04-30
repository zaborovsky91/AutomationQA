import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankCurrencyPage {

    @FindBy(xpath = "//*[@id=\"acc1\"]/option[4]")
    public WebElement dollarAccounts;

    @FindBy (xpath = "//*[@id=\"acc1\"]")
    public WebElement dropDownMenuAccounts;

    @FindBy (xpath = "//*[@id=\"from-amount\"]")
    public WebElement fieldAmmountSale;

    public BankCurrencyPage moveDropDownMenuAccounts () {
        Actions builder = new Actions(Browser.browser);
        builder.moveToElement(dropDownMenuAccounts).build().perform();
        return PageFactory.initElements(Browser.browser, BankCurrencyPage.class);
    }


    public BankCurrencyPage chooseDollarsAccounts() {
        dollarAccounts.click();
        return PageFactory.initElements(Browser.browser, BankCurrencyPage.class);
    }

    public double getAmmountFromDollarsAccounts () {
        String amountDollarsAccountsInText = dollarAccounts.getText();
        String amountDollarsAccountsWithoutText = amountDollarsAccountsInText.split(":")[1].split("\\$")[0];
        //System.out.println(amountDollarsAccountsWithoutText);
        //return PageFactory.initElements(Browser.browser, BankCurrencyPage.class);
       return Double.parseDouble(amountDollarsAccountsWithoutText);
    }

    public BankCurrencyPage inputAmmountInDollars () {
        //ammountDollars = getAmmountFromDollarsAccounts();

       // fieldAmmountSale.sendKeys()
        //String amountDollarsAccountsInText = dollarAccounts.getText();
       // String numbersAsText = amountDollarsAccountsInText.split(":")[1].split("\\$")[0];
        //System.out.println(numbersAsText);
        return PageFactory.initElements(Browser.browser, BankCurrencyPage.class);
    }

}
