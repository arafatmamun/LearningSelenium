package pageObjects;

import commons.CommonActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WidgetsPage extends CommonActions {
    public  Header header;

    @FindBy(xpath = "//div[@id='content']/h1[@class='entry-title']")
    WebElement widgetsHeaderText;

    public void verifyWidgetsHeaderText(){
        verify("Widgets", widgetsHeaderText.getText());
    }

    public WidgetsPage(){
        initElement();
        header = new Header();
    }
}
