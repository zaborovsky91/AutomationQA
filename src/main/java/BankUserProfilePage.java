import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankUserProfilePage {

    @FindBy(xpath = "//*[@id=\"settings-button\"]")
    public WebElement linkUserSettings;


    public BankUserSettingsPage clickLinkUserSettings() {
        linkUserSettings.click();
        return PageFactory.initElements(Browser.browser, BankUserSettingsPage.class);
    }

}
