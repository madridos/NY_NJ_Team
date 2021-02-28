package dz.qa.njPages;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Non_Costumers_ClaimPage extends WebAPI {
    public static final String claim_Non_Costumer_LinkedText = "Claims for non-customers";
    @FindBy(how = How.LINK_TEXT, using = claim_Non_Costumer_LinkedText)
    public static WebElement claim_Non_Costumer;
    public static final String click_On_Individual_Id = "ember544";
    @FindBy(how = How.ID, using = click_On_Individual_Id)
    public static WebElement click_On_Individual;
    public static final String date_Field_Displayed_Id = "#dateOfLoss-label";
    @FindBy(how = How.CSS, using = date_Field_Displayed_Id)
    public static WebElement date_Field_Displayed;
    public static final String calender_display_XPath = "#dateOfLoss";
    @FindBy(how = How.CSS, using = calender_display_XPath)
    public static WebElement calender_display;
    public static final String hour_drop_down_Css = "#dateOfLoss-hour";
    @FindBy(how = How.CSS, using = hour_drop_down_Css)
    public static WebElement hour_drop_down;
    public static final String minute_drop_down_Css = "#dateOfLoss-minute";
    @FindBy(how = How.CSS, using = minute_drop_down_Css)
    public static WebElement minute_drop_down;
    public static final String period_drop_down_Css = "#dateOfLoss-ampm";
    @FindBy(how = How.CSS, using = period_drop_down_Css)
    public static WebElement period_drop_down;
    public static final String continue_button_is_Displayed_Css = "dateOfLoss-continue-link";
    @FindBy(how = How.ID, using = continue_button_is_Displayed_Css)
    public static WebElement continue_button_is_Displayed;
    public static final String lastName_field_is_Visible_XP = "//div[contains(text(),'Enter last name')]";
    @FindBy(how = How.XPATH, using = lastName_field_is_Visible_XP)
    public static WebElement lastName_field_is_Visible;
    public static final String lastName_field_SendKeysCSS = "#insuredLastName";
    @FindBy(how = How.CSS, using = lastName_field_SendKeysCSS)
    public static WebElement lastName_field_SendKeys;
    public static final String continue_button_for_LastName_Search_Id = "insuredLastName-continue-link";
    @FindBy(how = How.ID, using = continue_button_for_LastName_Search_Id)
    public static WebElement continue_button_for_LastName_Search;
    public static final String policy_field_Css = "#policyNumber";
    @FindBy(how = How.CSS, using = policy_field_Css)
    public static WebElement policy_field;
    public static final String continue_button_for_total_Search_Id = "policyNumber-continue-link";
    @FindBy(how = How.ID, using = continue_button_for_total_Search_Id)
    public static WebElement continue_button_for_total_Search;

    public void user_clicks_on_Claims_for_non_customers_link_text_test() {
        claim_Non_Costumer.click();
    }

    public void user_should_see_page_test(String string) {

    }

    public void user_clicks_on_individual_function_Test() throws InterruptedException {
        click_On_Individual.click();
        Thread.sleep(2000);
    }

    public String a_calendar_and_drop_down_fields_appear_Test() throws InterruptedException {
        String text = date_Field_Displayed.getText();
        String actual_Result_Date_Field = text;

        return text;
    }

    public void user_enters_a_date_Test() throws InterruptedException {
        calender_display.sendKeys("02/14/2020");

//        List<WebElement> dates = (List<WebElement>) select_day;
//        int count = ((List<WebElement>) select_day).size();
//        for (int i=0;i<count;i++){
//          String text =  ((List<WebElement>) select_day).get(i).getText();
//          if(text.equals("14")){
//              ((List<WebElement>) select_day).get(i).click();
//         }
//         }
//        calender_display_Back_Button.click();
//        while (calender_display_Back_Button.getText().contains("Feb")) {
//            calender_display_Back_Button.click();
//        }
        Thread.sleep(2000);
    }

    public void hours_and_minutes_and_period_of_day_test() throws InterruptedException {
        Select select = new Select(hour_drop_down);
        select.selectByIndex(2);
        Thread.sleep(1000);
        Select select1 = new Select(minute_drop_down);
        select1.selectByVisibleText("15");
        Thread.sleep(1000);
        Select select2 = new Select(period_drop_down);
        select2.selectByValue("PM");
        Thread.sleep(1000);
    }

    public void user_should_see_a_continue_button_and_click_on_it_Test() throws InterruptedException {
        boolean isdisplayed = continue_button_is_Displayed.isDisplayed();
        Assert.assertTrue(isdisplayed);
        System.out.println("contine button is displayed");
        continue_button_is_Displayed.click();
        Thread.sleep(2000);
    }

    public String a_filed_with_last_name_request_should_be_displayed_Test() {
        String actual_last_Name_is_displayed=lastName_field_is_Visible.getText() ;
        return actual_last_Name_is_displayed;
    }

    public void user_enters_a_last_name_and_clicks_on_enter_Test() {
        lastName_field_SendKeys.sendKeys("mahmudul");
        continue_button_for_LastName_Search.click();
    }

    public void another_field_of_policy_number_should_be_displayed_Test() {
        policy_field.sendKeys("4563789238ruff748");
    }

    public void user_should_enter_his_state_farm_policy_number_and_clicks_on_enter_Test() {
        continue_button_for_total_Search.click();
    }
}
