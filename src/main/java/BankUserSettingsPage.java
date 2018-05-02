import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankUserSettingsPage {

    @FindBy(name = "currentUsername")
    public WebElement UserLogin;

    @FindBy(xpath = "//*[@id=\"settings-container\"]/div[1]/ul/li[4]/a")
    public WebElement linkChangeUsername;

    public BankUserSettingsPage openLinkChangeLogin() throws InterruptedException {
        Thread.sleep(1000);
        linkChangeUsername.click();

        return PageFactory.initElements(Browser.browser, BankUserSettingsPage.class);
    }

    public String getUserLogin (){
        String textUserLogin = UserLogin.getText();
        System.out.println(textUserLogin);
        return (textUserLogin);

    }

}
