import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestOne {

    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arafat Mamun\\Development\\SourceCode\\gitHub\\LearningSelenium\\web_drivers\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Arafat Mamun\\Development\\SourceCode\\gitHub\\LearningSelenium\\web_drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        driver.findElement(By.id("email")).sendKeys("testemail@test.com");
        waitFor(750);
        driver.findElement(By.id("u_0_b")).click();
        driver.findElement(By.xpath("//div[@class='signupBanner']/descendant::a")).click();

    }

    private static void waitFor(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
