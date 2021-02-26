package dz.qa.njPages;

import common.WebAPI;

    import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

    public class MedicareSupplementPage extends WebAPI {
        // Elements
        public static final String Insurance_click_XP="//span[contains(text(),'INSURANCE')]";
        @FindBy(how= How.XPATH, using=Insurance_click_XP)
        public static WebElement Insurance_click;
        public static final String medicareSupplementPageClick_link="Medicare Supplement";
        @FindBy(how=How.LINK_TEXT,using=medicareSupplementPageClick_link)
        public static WebElement medicareSupplementPageClick;
        public static final String scolToElement_Xpath="//h5[@class='card-title mb-3']";
        @FindBy(how=How.XPATH,using=scolToElement_Xpath)
        public static WebElement scolToElement;
        public static final String zipCodeField_Xpath ="//input[@id='0-17-3074893-3']";
        @FindBy(how=How.XPATH,using=zipCodeField_Xpath)
        public static WebElement zipCodeField;

        public static final String go_Click_Xpath  ="//form[@id='form-11188']/div/div[2]";
        @FindBy(how=How.XPATH,using=go_Click_Xpath)
        public static WebElement go_Click;

        public static final String medicareSupplement_select_Xpath  ="//select[@id='0-17-3112758-4']";
        @FindBy(how=How.XPATH,using=medicareSupplement_select_Xpath )
        public static WebElement medicareSupplement_select ;

        public static final String medicareSupplement_Go_Click_Xpath ="//select[@id='0-17-3112758-4']/following-sibling:: button";
        @FindBy(how=How.XPATH,using=medicareSupplement_Go_Click_Xpath )
        public static WebElement medicareSupplement_Go_Click ;

        public static final String changHealthPolicy_Click_LinkText ="How to request a change to a Health Policy";
        @FindBy(how=How.LINK_TEXT,using=changHealthPolicy_Click_LinkText )
        public static WebElement changHealthPolicy_Click ;

        public static final String contactYourAgent_Click_LinkText ="//a[text()='Contact your agent/insurance producer']";
        @FindBy(how=How.XPATH,using=contactYourAgent_Click_LinkText )
        public static WebElement contactYourAgent_Link;


        public static final String insuranceLink_Click_Xpath  ="//span[@class='breadcrumbs-chevron']/preceding-sibling::span";
        @FindBy(how=How.XPATH,using=insuranceLink_Click_Xpath )
        public static WebElement insuranceLink_Click;
        // methods
        public void enter_the_state_farm_into_a_web_browser_test(String url) {
            url="https://www.statefarm.com";
            driver.get(url);
        }
        public void state_farm_home_Page_appears_Test() {
            String expectedTitle= driver.getTitle() ;
            String actuelTitle="Auto, Life Insurance, Banking, & More. Get a Free Quote - State Farm®";
            Assert.assertEquals(expectedTitle,actuelTitle);
        }
        public void user_click_on_INSURANCE_link_on_hom_Page_Test() {
            Insurance_click.click();
        }
        public void he_clicks_on_Medicare_Supplement_Test() {
            medicareSupplementPageClick.click();
        }
        public void medicare_Supplement_page_appears() {
            String actuelTitle= driver.getTitle() ;
            String expectedTitle="Medicare Supplement Insurance - State Farm®";
            Assert.assertEquals(expectedTitle,actuelTitle);
        }

        public void user_on_Medicare_Supplement_scroll_To_Find_an_Agent_Element_Tes() {
            scrollToElementJScript( scolToElement);

        }

        public void enter_into_zip_code_field_test(String string) {
            zipCodeField.sendKeys("07306");
        }

        public void he_clicks_on_go_button_a_Find_a_State_Farm_Agent_Near_You_page_should_appaers_Test() {
            go_Click.click();
        }

        public void user_select_a_And_click_on_Go_button_Test(String statSelected) {
            medicareSupplement_select.sendKeys(statSelected);
            medicareSupplement_Go_Click.click();
        }
        public void user_on_Medicare_Supplement_scroll_To_Find_an_Agent_change_a_health_policy_link_verification_link_Test() {
            scrollToElementJScript( scolToElement);
        }
        public void he_clicks_on_that_link_Test() {
            changHealthPolicy_Click.click();
        }
        public void user_on_Medicare_Supplement_scroll_To_Find_Contact_your_agent_insurance_producer_link_Test() {
            scrollToElementJScript( contactYourAgent_Link);
        }
        public void he_clicks_on_that_Link_Test() {
            contactYourAgent_Link.click();
        }

        public void a_Find_a_State_Farm_Agent_Near_You_appaers_Test() {
        }

        public void user_on_Medicare_Supplement_click_on_insurance_link() {
            insuranceLink_Click.click();
        }
    }


