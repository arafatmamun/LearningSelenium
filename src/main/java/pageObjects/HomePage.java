package pageObjects;

import commons.CommonActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonActions {
    public Header header;

    @FindBy(xpath = "//div[@id='content']/h1[@class='entry-title']")
    WebElement homeHeaderText;

    public void verifyHomePageHeaderText(){
        verify("Home", homeHeaderText.getText());
    }


    public HomePage(){
        initElement();
        header = new Header();
    }
}
