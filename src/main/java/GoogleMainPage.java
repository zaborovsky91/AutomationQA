import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by asirota on 4/3/2018.
 */
public class GoogleMainPage {

    @FindBy(id = "lst-ib")
    WebElement searchInput;

    public GoogleMainPage searchForText(String text) {
        searchInput.sendKeys(text, Keys.ENTER);
        return PageFactory.initElements(Browser.getBrowser(), GoogleMainPage.class);
    }


}
