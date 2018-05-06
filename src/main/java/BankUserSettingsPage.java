import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankUserSettingsPage {

    @FindBy(xpath = "//*[@id=\"change-username-form\"]/div[1]/div/input")
    public WebElement userLogin;

    @FindBy(xpath = "//*[@id=\"settings-container\"]/div[1]/ul/li[4]/a")
    public WebElement linkChangeUsername;

    @FindBy(xpath = "//*[@id=\"contentbar\"]/iframe")
    public WebElement getIframeFullPage;

    public BankUserSettingsPage openLinkChangeLogin() {
        Browser.getBrowser().switchTo().frame(getIframeFullPage);
        linkChangeUsername.click();
        Browser.getBrowser().switchTo().defaultContent();
        return PageFactory.initElements(Browser.getBrowser(), BankUserSettingsPage.class);
    }

    public String getUserLogin() {
        Browser.getBrowser().switchTo().frame(getIframeFullPage);
        String textUserLogin = userLogin.getAttribute("value");
        Browser.getBrowser().switchTo().defaultContent();
        return (textUserLogin);

    }

}
