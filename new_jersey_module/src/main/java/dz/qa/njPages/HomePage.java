package dz.qa.njPages;
import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class HomePage extends WebAPI {
    public static final String Insurance_click_XP="//span[contains(text(),'INSURANCE')]";
    @FindBy(how= How.XPATH, using=Insurance_click_XP)
    public static WebElement Insurance_click;
    public void user_enter_the_state_farm_url_on_the_browser_test() {
        //driver.get("https://www.statefarm.com");
    }
    public void user_should_see_the_state_farm_home_page_lunched_test() throws InterruptedException {
        Insurance_click.click();
        sleepFor(5);
       String actualTitleSF =  driver.getTitle();
       String expectedTitleSF= "Auto, Life Insurance, Banking, & More. Get a Free Quote - State Farm®";
       Assert.assertEquals(actualTitleSF, expectedTitleSF);
    }
}
