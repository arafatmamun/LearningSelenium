package pageObjects;

import commons.CommonActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends CommonActions {

    @FindBy(xpath = "//ul[@id='menu-top']/li[1]/a")
    WebElement link_home;

    @FindBy(xpath = "//ul[@id='menu-top']/li[3]/a")
    WebElement link_widgets;

    public Header(){
        initElement();
    }

    public void clickOnWidgets(){
        link_widgets.click();
    }

    public void clickOnHome(){
        link_home.click();
    }
}
