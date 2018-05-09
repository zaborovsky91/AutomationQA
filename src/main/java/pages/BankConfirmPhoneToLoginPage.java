package pages;

import framework.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankConfirmPhoneToLoginPage {

    @FindBy(id = "login-otp-button")
    public WebElement loginOtpButton;


    public BankUserProfilePage clickConfirmPhoneButtom() {
        loginOtpButton.click();
        return PageFactory.initElements(Browser.getBrowser(), BankUserProfilePage.class);
    }

}


