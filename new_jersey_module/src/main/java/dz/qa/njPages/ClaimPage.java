package dz.qa.njPages;
import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.ArrayList;
import java.util.List;
public class ClaimPage extends WebAPI {
    final static String claimButton_click_XPath = "//span[contains(text(),'CLAIMS')]";
    @FindBy(how = How.XPATH, using = claimButton_click_XPath)
    public static WebElement claimButton_click;
    final static String claim_DropDown_Section_List_Css = "#oneX-submenu-claims div a";
    @FindBy(how = How.CSS, using = claim_DropDown_Section_List_Css)
    static List<WebElement> claim_DropDown_Section_List;
    final static String state_Farm_Claim_Button_XPath = "//a[contains(text(),'State Farm Claims')]";
    @FindBy(how = How.XPATH, using = state_Farm_Claim_Button_XPath)
    public static WebElement state_Farm_Claim_Button;
    final static String claim_Page_welcome_Message_Class = "//h1[@class='-oneX-acquisition-heading -oneX-heading--L -w_mb-50']";
    @FindBy(how = How.XPATH, using = claim_Page_welcome_Message_Class)
    public static WebElement claim_Page_welcome_Message;
    static List<String> strList = new ArrayList<>();
    public void user_landed_on_state_farm_home_page_test() {
        String actualClaimsPageTitle = driver.getTitle();
        String expectedClaimPageTitle = "Auto, Life Insurance, Banking, & More. Get a Free Quote - State Farm®";
        Assert.assertEquals(actualClaimsPageTitle, expectedClaimPageTitle);
        System.out.println("this is hard assert");
    }
    public void user_clicks_on_CLAIMS_on_the_page_header_bar_menu_test() throws InterruptedException {
        claimButton_click.click();
        Thread.sleep(2000);
    }
    public void drop_down_menu_section_containing_and_should_appear_test(String string, String string2, String string3) throws InterruptedException {
        for (WebElement ele : claim_DropDown_Section_List) {
            strList.add(ele.getText());
        }
        boolean result = false;
        if (strList.contains(string) && strList.contains(string2) && strList.contains(string3)) {
            System.out.println("true");
            result = true;
            Thread.sleep(2000);
        }
        Assert.assertTrue(result);
    }
    public void user_clicks_on_test(String string) throws InterruptedException {
        state_Farm_Claim_Button.click();
    }
    public void user_should_land_on(String string) {
        String actual_Claim_Welcome_Message = claim_Page_welcome_Message.getText();
        String expected_Claim_Welcome_Message = "Welcome to our easy claims center";
        Assert.assertEquals(actual_Claim_Welcome_Message, expected_Claim_Welcome_Message);
        System.out.println("hello");
    }
}
