package pages;

import framework.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BankUserProfilePage extends BankHeaderPage {

   public BankUserProfilePage moveDropdownMenuStatements() {
        Actions builder = new Actions(Browser.getBrowser());
        builder.moveToElement(dropDownMenuStatements).build().perform();
        return PageFactory.initElements(Browser.getBrowser(), BankUserProfilePage.class);
    }

    public BankUserProfilePage moveDropdownMenuCurrency() {
        Actions builder = new Actions(Browser.getBrowser());
        builder.moveToElement(dropDownMenuCurrency).build().perform();
        return PageFactory.initElements(Browser.getBrowser(), BankUserProfilePage.class);
    }

    public BankUserSettingsPage clickLinkUserSettings() {
        linkUserSettings.click();
        return PageFactory.initElements(Browser.getBrowser(), BankUserSettingsPage.class);
    }

    public BankStatementsPage clickLinkStatementsPage() {
        linkStatementsPage.click();
        return PageFactory.initElements(Browser.getBrowser(), BankStatementsPage.class);
    }

    public BankCurrencyPage clickLinkCurrencyPage() {
        linkCurrencyPage.click();
        return PageFactory.initElements(Browser.getBrowser(), BankCurrencyPage.class);
    }

    public BankCorrespondencePage clickMessagesButtom() {
        buttomMessages.click();
        return PageFactory.initElements(Browser.getBrowser(), BankCorrespondencePage.class);
    }
}
