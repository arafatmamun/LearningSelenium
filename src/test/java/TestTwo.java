public class TestTwo extends Actions{

    public static void main(String[] args) {
        setGeckoDriver();
        openUrl("https://www.facebook.com");
        clickOn("id", "u_0_b");
        clickOn("xpath", "//div[@class='signupBanner']/descendant::a");
    }
}
