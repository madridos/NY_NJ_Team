package dz.qa.njPages;
import common.WebAPI;
import org.junit.Assert;
public class HomePage extends WebAPI {
    public void user_enter_the_state_farm_url_on_the_browser_test() {
        //driver.get("https://www.statefarm.com");
    }
    public void user_should_see_the_state_farm_home_page_lunched_test() {
       String actualTitleSF =  driver.getTitle();
       String expectedTitleSF= "Auto, Life Insurance, Banking, & More. Get a Free Quote - State Farm®";
       Assert.assertEquals(actualTitleSF, expectedTitleSF);
    }
}
