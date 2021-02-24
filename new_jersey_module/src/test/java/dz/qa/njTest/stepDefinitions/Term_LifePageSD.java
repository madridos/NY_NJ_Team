package dz.qa.njTest.stepDefinitions;

import dz.qa.njPages.Term_LifePage;
import io.cucumber.java.en.*;

import static dz.qa.njTest.testbase.SetUp.term_LifePage;

public class Term_LifePageSD extends Term_LifePage {
    //Background:
    @Given("user lands on State farm home page")
    public void user_lands_on_State_farm_home_page() {
       term_LifePage.user_lands_on_State_farm_home_page_Test();
    }
    @When("user clicks on {string} link in the header bar menu")
    public void user_clicks_on_link_in_the_header_bar_menu(String string) {
        term_LifePage.user_clicks_on_link_in_the_header_bar_menu_Test(string);
    }
    @When("user clicks on {string} in the dropdown menu")
    public void user_clicks_on_in_the_dropdown_menu(String string) {
        term_LifePage.user_clicks_on_in_the_dropdown_menu_Test(string);
    }

    //K01
    @Then("user should land on {string}")
    public void user_should_land_on(String string) {
        term_LifePage.user_should_land_on_Test(string);
    }
    @Then("user should see the {string}")
    public void user_should_see_the(String string) {
        term_LifePage.user_should_see_the_Test(string);
    }
    //K02
   @Given("the user scrolls down in the Term Life Insurance page")
   public void the_user_scrolls_down_in_the_Term_Life_Insurance_page() {
       term_LifePage.the_user_scrolls_down_in_the_Term_Life_Insurance_page_Test();
   }
    @When("the user see the {string} text")
    public void the_user_see_the_text(String string) {
        term_LifePage.the_user_see_the_text_Test(string);
    }
    @Then("the user select {string} from the dropdown menu")
    public void the_user_select_from_the_dropdown_menu(String string) {
        term_LifePage.the_user_select_from_the_dropdown_menu_Test(string);
    }
    @When("the user clicks on the GO button")
    public void the_user_clicks_on_the_GO_button() {
        term_LifePage.the_user_clicks_on_the_GO_button_Test();
    }
    @Then("the user should land on {string}")
    public void the_user_should_land_on(String string) {
        term_LifePage.the_user_should_land_on_Test(string);
    }

    //K03
    @Given("the user scrolls down in the Term Life Insurance page to Term Life Choices table")
    public void the_user_scrolls_down_in_the_Term_Life_Insurance_page_to_Term_Life_Choices_table() {
        term_LifePage.the_user_scrolls_down_in_the_Term_Life_Insurance_page_to_Term_Life_Choices_table_Test();
    }

    @When("the user gets to Comparing Term Life Choices table")
    public void the_user_gets_to_Comparing_Term_Life_Choices_table() {
        term_LifePage.the_user_gets_to_Comparing_Term_Life_Choices_table_Test();
    }
    @Then("the user should see {string}")
    public void the_user_should_see(String string) {
       term_LifePage.the_user_should_see_Text_Test(string);
    }
   //K04
   @Given("the user scrolls down in the Term Life Insurance page to Comparing Term to Permanent Insurance")
   public void the_user_scrolls_down_in_the_Term_Life_Insurance_page_to_Comparing_Term_to_Permanent_Insurance() throws InterruptedException {
       term_LifePage.the_user_scrolls_down_in_the_Term_Life_Insurance_page_to_Comparing_Term_to_Permanent_Insurance_Test();
   }

    @When("the user gets to the table")
    public void the_user_gets_to_the_table() {
        term_LifePage.the_user_gets_to_the_table_Test();
    }

    @Then("the user should see the Term Life and Permanent Life like shown in the below table")
    public void the_user_should_see_the_Term_Life_and_Permanent_Life_like_shown_in_the_below_table(io.cucumber.datatable.DataTable dataTable) {
        term_LifePage.the_user_should_see_the_Term_Life_and_Permanent_Life_like_shown_in_the_below_table_Test(dataTable);
    }
    //K05
    @Given("the user scrolled down to {string} text")
    public void the_user_scrolled_down_to_text(String string) {
        term_LifePage.the_user_scrolled_down_to_text_Test(string);
    }
    @When("the user enters {string} in the in the State text_field")
    public void the_user_enters_in_the_in_the_State_text_field(String string) {
       term_LifePage.the_user_enters_in_the_in_the_State_text_field_Test(string);
   }
   @When("the user clicks on the {string} button")
   public void the_user_clicks_on_the_button(String string) {
        term_LifePage.the_user_clicks_on_the_button_Test(string);
    }
    @Then("the user should see the {string} when landing in the new page")
    public void the_user_should_see_the_when_landing_in_the_new_page(String string) {
        term_LifePage.the_user_should_see_the_when_landing_in_the_new_page_Test(string);
    }

}
