package commons;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CommonActions {
    static WebDriver webDriver;

    public void initElement(){
        PageFactory.initElements(webDriver, this);
    }

    public void setGeckoDriver(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Arafat Mamun\\Development\\SourceCode\\gitHub\\LearningSelenium\\web_drivers\\geckodriver.exe");
        webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    public void setChromeDriver(){
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arafat Mamun\\Development\\SourceCode\\gitHub\\LearningSelenium\\web_drivers\\chromedriver.exe");
       webDriver = new ChromeDriver();
       webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public void openUrl(String url){
        webDriver.get(url);
    }

    //TODO: add 3 more conditions for name, className and css
    public static WebElement getElement(String elementLocator, String locatorValue){
        WebElement element=null;
        if(elementLocator.equals("id")){
            element = webDriver.findElement(By.id(locatorValue));
        } else if(elementLocator.equals("xpath")){
            element = webDriver.findElement(By.xpath(locatorValue));
        }
        return element;
    }

    public  void clickOn(String elementLocator, String locatorValue){
        getElement(elementLocator, locatorValue).click();
    }

    public  void typeText(String elementLocator, String locatorValue, String textToType){
        getElement(elementLocator, locatorValue).sendKeys(textToType);
    }

    public  String getText(String elementLocator, String locatorValue){
        return getElement(elementLocator,locatorValue).getText();
    }

    public  void closeDriver(){
        webDriver.close();
        webDriver.quit();
    }

    public  void waitTime(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public  void verify(String expected, String actual){
        Assert.assertEquals(expected, actual);
    }
}
