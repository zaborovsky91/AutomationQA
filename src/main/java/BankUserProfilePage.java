import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BankUserProfilePage {

    @FindBy(xpath = "//*[@id=\"settings-button\"]")
    public WebElement linkUserSettings;

    @FindBy (xpath = "//*[@id=\"statements-statement\"]")
    public WebElement linkStatementsPage;

    @FindBy (xpath = "//*[@id=\"currency-exchange\"]")
    public WebElement linkCurrencyPage;

    @FindBy (xpath = "//*[@id=\"accounts-index\"]")
    public WebElement dropDownMenuStatements;

    @FindBy (xpath = "//*[@id=\"currency-rates\"]")
    public WebElement dropDownMenuCurrency;

    public BankUserProfilePage moveDropdownMenuStatements () {
        Actions builder = new Actions(Browser.browser);
        builder.moveToElement(dropDownMenuStatements).build().perform();
        return PageFactory.initElements(Browser.browser, BankUserProfilePage.class);
    }

    public BankUserProfilePage moveDropdownMenuCurrency () {
        Actions builder = new Actions(Browser.browser);
        builder.moveToElement(dropDownMenuCurrency).build().perform();
        return PageFactory.initElements(Browser.browser, BankUserProfilePage.class);
    }


    public BankUserSettingsPage clickLinkUserSettings() {
        linkUserSettings.click();
        return PageFactory.initElements(Browser.browser, BankUserSettingsPage.class);
    }

    public BankStatementsPage clickLinkStatementsPage() {
        linkStatementsPage.click();
        return PageFactory.initElements(Browser.browser, BankStatementsPage.class);
    }

    public BankCurrencyPage clickLinkCurrencyPage() {
        linkCurrencyPage.click();
        return PageFactory.initElements(Browser.browser, BankCurrencyPage.class);
    }
}
