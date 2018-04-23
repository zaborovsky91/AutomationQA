import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankUserSettingsPage {

    @FindBy(name = "currentUsername")
    public WebElement UserLogin;

    public BankUserSettingsPage openLinkChangeLogin() {
        Browser.browser.navigate().to("https://idemo.bspb.ru/auth/settings/username");
        return PageFactory.initElements(Browser.browser, BankUserSettingsPage.class);
    }

    public String getUserLogin (){
    String textUserLogin = UserLogin.getText();
    System.out.println(textUserLogin);
    return (textUserLogin);

    }

}
