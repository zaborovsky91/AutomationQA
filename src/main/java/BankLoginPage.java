import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;

public class BankLoginPage {

    @FindBy(id = "login-button")
    public WebElement loginButton;


    public BankConfirmPhoneToLoginPage clickLoginButtom() {
        loginButton.click();
        return PageFactory.initElements(Browser.browser, BankConfirmPhoneToLoginPage.class);
    }

}
