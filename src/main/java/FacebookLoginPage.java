import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {

    @FindBy(xpath = ".//*[@id='userNavigationLabel']")
    public WebElement navigationLabelMenu;

    @FindBy(xpath = ".//div/ul[@class='_54nf']")
    public WebElement labelLogout;


    public FacebookLoginPage clickOnNavigationLabelMenu() {
        navigationLabelMenu.click();
        return PageFactory.initElements(Browser.getBrowser(), FacebookLoginPage.class);
    }


    public String getLabelLogout() {
        String textLabelLogout = labelLogout.getText();
        return (textLabelLogout);
    }

}
