import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FacebookMainPage {

    @FindBy(css = "input#email.inputtext")
    public WebElement emailField;

    @FindBy(css = "input#pass.inputtext")
    public WebElement passwordField;

    @FindBy(xpath = ".//*[contains(@class, 'uiButtonConfirm')]")
    public WebElement loginButton;


    public FacebookLoginPage enterCreditinalsAndSubmit(String login, String pass) {
        emailField.sendKeys(login);
        passwordField.sendKeys(pass);
        loginButton.click();
        return PageFactory.initElements(Browser.browser, FacebookLoginPage.class);
    }


}
