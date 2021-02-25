package dz.qa.njPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HealthPage {
    final static String home_page_logo = "//img[@id='oneX-sf-logo']";
    @FindBy(how=How.XPATH,using = home_page_logo)
    static WebElement home_page;
    final static String insurance_Link_xpath ="//span[text()='INSURANCE']";
    @FindBy(how= How.XPATH,using = insurance_Link_xpath)
    static WebElement insurance_Link;

    final static String dropdown_contains_xpath = "//*[@id=\"oneX-4-insurance\"]";
    @FindBy(how=How.XPATH,using = dropdown_contains_xpath)
    static WebElement dropdown_contains;

    final static String HEALTH_link_xpath = "//*[@id=\"oneX-4-insurance\"]";
    @FindBy(how=How.XPATH,using = HEALTH_link_xpath)
    static WebElement HEALTH_link;

    final static String HEALTH_page_xpath = "//*[@id=\"content\"]/section[2]/div/div/div[1]/div/div/h1";
    @FindBy(how=How.XPATH,using = HEALTH_page_xpath)
    static WebElement HEALTH_page;

    final static String enters_zip_code_xpath = "//input[@id='callout-agent-zip-code-input_1']";
    @FindBy(how=How.XPATH,using=enters_zip_code_xpath )
    static WebElement enters_zip_code;

    final static String clicks_on_find_agent_xpath = "//button[@class='-oneX-btn-primary find-agent_submit']";
    @FindBy(how=How.XPATH,using = clicks_on_find_agent_xpath)
    static WebElement clicks_on_find_agent;

    final static String find_agent_near_you_xpath = "//h1[contains(text(),'Find a State Farm Agent Near You')]";
    @FindBy(how=How.XPATH,using =find_agent_near_you_xpath )
    static WebElement find_agent_near_you;

    public void user_is_on_state_farm_home_page_Test() {
        home_page.isDisplayed();
    }

    public void user_clicks_on_insurance_link_Test() {

        insurance_Link.click();
    }

    public void user_should_see_a_dropdown_contains_Test(String string) {
        dropdown_contains.getText();

    }

    public void user_click_on_HEALTH_link_Test() {
        HEALTH_link.click();

    }

    public void user_should_land_on_HEALTH_page_Test() {

        HEALTH_page.isDisplayed();
    }


    public void user_enters_zip_code_Test() {
        enters_zip_code.sendKeys("07306");
    }


    public void user_clicks_on_find_agent_Test() {
        clicks_on_find_agent.click();
    }

    public void user_should_land_find_agent_near_you_Test() {
        find_agent_near_you.isDisplayed();
    }
}
