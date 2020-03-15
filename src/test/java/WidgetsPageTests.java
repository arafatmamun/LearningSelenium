import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObjects.HomePage;
import pageObjects.WidgetsPage;

public class WidgetsPageTests {

    WidgetsPage widgetsPage = new WidgetsPage();

    @BeforeClass
    public static void openBrowser(){
        WidgetsPage widgetsPage = new WidgetsPage();
        widgetsPage.setChromeDriver();
    }

    @Before
    public void setUpTest(){
        widgetsPage.openUrl("https://demoqa.com/category/widgets/");
        widgetsPage.waitTime(2000);
    }

    @Test
    public void widgetsPageHeaderTest(){
        widgetsPage.verifyWidgetsHeaderText();
    }

    @Test
    public void clickOnHomeFromWidgetsPage(){
        widgetsPage.header.clickOnHome();
        HomePage homePage = new HomePage();
        homePage.verifyHomePageHeaderText();
    }
}
