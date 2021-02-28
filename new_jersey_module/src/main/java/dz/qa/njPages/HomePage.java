package dz.qa.njPages;
import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends WebAPI {
    //WebElement for methods scenario 01
    final static String logo_Css = "#oneX-sf-logo";
    @FindBy(how = How.CSS, using = logo_Css)
    static WebElement logo;
    //WebElement for methods scenario 02
    final static String claimButtonClickXPath = "//span[contains(text(),'CLAIMS')]";
    @FindBy(how = How.XPATH, using = claimButtonClickXPath)
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

    public String user_is_on_state_farm_home_page_and_should_see_their_title_displayed_Step(String actualResult) {
        actualResult = driver.getTitle();
        return actualResult;
    }

    //Methods for Scenario 02
    public void user_clicks_on_CLAIMS_on_the_page_header_bar_menu_test(String string) throws InterruptedException {
// claimButton_click.click();
        driver.findElement(By.xpath("//*[contains(text(),'"+string+"')]")).click();
        Thread.sleep(2000);
    }

    public List<String> drop_down_menu_section_containing_and_should_appear_test() throws InterruptedException {
        for (WebElement ele : claim_DropDown_Section_List) {
            strList.add(ele.getText());
        }
        return strList;
    }

    public void user_clicks_on_link_test(String string) throws InterruptedException {
// state_Farm_Claim_Button.click();
        driver.findElement(By.xpath("//*[contains(text(),'"+string+"')]")).click();
    }
    public String user_should_land_on_page_test() {

      return    driver.getTitle();
    }

}
