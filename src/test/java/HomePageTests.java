import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObjects.HomePage;
import pageObjects.WidgetsPage;

public class HomePageTests {

    HomePage homePage = new HomePage();

    @BeforeClass
    public static void openBrowser(){
        HomePage homePage = new HomePage();
        homePage.setChromeDriver();
    }

    @Before
    public void setUpTest(){
        homePage.openUrl("https://demoqa.com/");
        homePage.waitTime(2000);
    }

    @Test
    public void homePageHeaderTest(){
        homePage.verifyHomePageHeaderText();
    }

    @Test
    public void clickWidgetsFromHomePage(){
        homePage.header.clickOnWidgets();
        WidgetsPage widgetsPage = new WidgetsPage();
        widgetsPage.verifyWidgetsHeaderText();
    }
}
