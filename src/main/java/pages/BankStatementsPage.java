package pages;

import framework.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankStatementsPage {
    @FindBy(linkText = "Сегодня")
    public WebElement linkPeriod;

    @FindBy(xpath = "//*[@id='closing-balance-row']/th[2]")
    public WebElement ammountOutgoingBalance;

    public BankStatementsPage clickPeriodLink() {
        linkPeriod.click();
        return PageFactory.initElements(Browser.getBrowser(), BankStatementsPage.class);
    }

    public double getAmmountOutgoingBalance() {
        String ammountOutgoinBalanceInText = ammountOutgoingBalance.getText();
        String ammountOutgoinBalanceTextWithoutSpaces = ammountOutgoinBalanceInText.replaceAll(" ", "");
        return Double.parseDouble(ammountOutgoinBalanceTextWithoutSpaces);
    }


}
