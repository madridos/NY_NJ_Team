package dz.qa.njTest.stepDefinitions;
import dz.qa.njPages.GetAQuotePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static dz.qa.njTest.testbase.SetUp.*;

public class GetAQuotePageSD extends GetAQuotePage {
    @Given("the user Lands in Stat farm home page")
    public void the_user_Lands_in_Stat_farm_home_page() {
        getAQuotePage.the_user_Lands_in_Stat_farm_home_page_Step();
    }
    @When("User click on GET A QUOTE link")
    public void user_click_on_GET_A_QUOTE_link() {
       getAQuotePage.user_click_on_GET_A_QUOTE_link_Step();
    }

    @Then("User should see a dropdown containing select-product, zip, Start a Quote")
    public void user_should_see_a_dropdown_containing_select_product_zip_Start_a_Quote() throws InterruptedException {
       getAQuotePage.user_should_see_a_dropdown_containing_select_product_zip_Start_a_Quote_Step();
    }

    @When("User enter the product {string} , enter a zip code {string}  and click on Start a Quote")
    public void user_enter_the_product_enter_a_zip_code_and_click_on_Start_a_Quote(String string, String string2) {
        getAQuotePage.user_enter_the_product_enter_a_zip_code_code_and_click_on_Start_a_Quote_Step( string,  string2);
    }

    @Then("User should see a message {string}")
    public void user_should_see_a_message(String string) {
       getAQuotePage.user_should_see_a_message_step(string);
    }

    @Given("User enter all Indicates required field")
    public void user_enter_all_Indicates_required_field(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        getAQuotePage.user_enter_all_Indicates_required_field_Step(dataTable);
    }

    @When("User click on next Vehicles button")
    public void user_click_on_next_Vehicles_button() throws InterruptedException {
        getAQuotePage.user_click_on_next_Vehicles_button_Step();
    }
//    @Then("User should see the next form {string}")
//    public void user_should_see_the_next_form(String string) throws InterruptedException {
//        getAQuotePage.user_should_see_the_next_form_Step(string);
//    }
}
