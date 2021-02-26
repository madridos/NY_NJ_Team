package dz.qa.njTest.stepDefinitions;

import dz.qa.njPages.RentersQuotePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static dz.qa.njTest.testbase.SetUp.rentersQuotePage;

public class RentersQuotePageSD extends RentersQuotePage {
    @Given("User enter all information required")
    public void User_enter_all_information_required(io.cucumber.datatable.DataTable dataTable) {
        rentersQuotePage.User_enter_all_information_required_Step(dataTable);
    }

    @When("User check the button My mailing address is the same and click continue.")
    public void user_check_the_button_My_mailing_address_is_the_same_and_click_continue() {
        rentersQuotePage.user_check_the_button_My_mailing_address_is_the_same_and_click_continue_Step();
    }

    @Then("User should land on the next step {string}")
    public void user_should_land_on_the_next_step(String string) {
        rentersQuotePage.user_should_land_on_the_next_Step( string);
    }

}
