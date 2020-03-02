import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Actions {
    static WebDriver webDriver;
    public static void setGeckoDriver(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Arafat Mamun\\Development\\SourceCode\\gitHub\\LearningSelenium\\web_drivers\\geckodriver.exe");
        webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    public static void setChromeDriver(){
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arafat Mamun\\Development\\SourceCode\\gitHub\\LearningSelenium\\web_drivers\\chromedriver.exe");
       webDriver = new ChromeDriver();
       webDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public static void openUrl(String url){
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

    public static void clickOn(String elementLocator, String locatorValue){
        getElement(elementLocator, locatorValue).click();
    }
}
