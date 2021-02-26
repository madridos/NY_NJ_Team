package dz.qa.njTest.stepDefinitions;

import dz.qa.njPages.Non_Costumers_ClaimPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import static dz.qa.njTest.testbase.SetUp.non_Costumers_ClaimPage;
public class Non_Costumers_ClaimSD extends Non_Costumers_ClaimPage {
    @When("user clicks on Claims for non-customers link text")
    public void user_clicks_on_Claims_for_non_customers_link_text() {
        non_Costumers_ClaimPage.user_clicks_on_Claims_for_non_customers_link_text_test();
        String actual_File_A_Loss_Title = driver.getTitle();
        String expected_File_A_Loss_Title = "File A Loss";
        Assert.assertEquals(actual_File_A_Loss_Title, expected_File_A_Loss_Title);
        System.out.println("this is the tue result");
    }
    @Then("user should see {string} page")
    public void user_should_see_page(String string) {
        non_Costumers_ClaimPage.user_should_see_page_test(string);
    }
    @Then("user clicks on individual function")
    public void user_clicks_on_individual_function() throws InterruptedException {
        non_Costumers_ClaimPage.user_clicks_on_individual_function_Test();
    }
    @Then("a calendar and drop down fields appear")
    public void a_calendar_and_drop_down_fields_appear() throws InterruptedException {
        non_Costumers_ClaimPage.a_calendar_and_drop_down_fields_appear_Test();
    }
    @When("user enters a date")
    public void user_enters_a_date() throws InterruptedException {
        non_Costumers_ClaimPage.user_enters_a_date_Test();
    }
    @When("hours and minutes and period of day")
    public void hours_and_minutes_and_period_of_day() throws InterruptedException {
        non_Costumers_ClaimPage.hours_and_minutes_and_period_of_day_test();
    }
    @Then("user should see a continue button and click on it")
    public void user_should_see_a_continue_button_and_click_on_it() throws InterruptedException {
        non_Costumers_ClaimPage.user_should_see_a_continue_button_and_click_on_it_Test();
    }
    @Then("a filed with last name request should be displayed")
    public void a_filed_with_last_name_request_should_be_displayed() {
        non_Costumers_ClaimPage.a_filed_with_last_name_request_should_be_displayed_Test();
    }
    @When("user enters a last name and clicks on enter")
    public void user_enters_a_last_name_and_clicks_on_enter() {
        non_Costumers_ClaimPage.user_enters_a_last_name_and_clicks_on_enter_Test();
    }
    @Then("another field of policy number should be displayed")
    public void another_field_of_policy_number_should_be_displayed() {
        non_Costumers_ClaimPage.another_field_of_policy_number_should_be_displayed_Test();
    }
    @Then("user should enter his state farm policy number and clicks on enter")
    public void user_should_enter_his_state_farm_policy_number_and_clicks_on_enter() {
        non_Costumers_ClaimPage.user_should_enter_his_state_farm_policy_number_and_clicks_on_enter_Test();
    }
}
