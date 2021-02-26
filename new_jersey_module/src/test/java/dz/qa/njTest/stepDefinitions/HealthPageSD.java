package dz.qa.njTest.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static dz.qa.njTest.testbase.SetUp.healthPage;

public class HealthPageSD {
    @Given("user is on state farm home page")
    public void user_is_on_state_farm_home_page() {
        healthPage.user_is_on_state_farm_home_page_Test();
    }



        @When("user clicks on insurance link")
    public void user_clicks_on_insurance_link() {
        healthPage.user_clicks_on_insurance_link_Test();

    }

    @Then("user should see a dropdown contains {string}")
    public void user_should_see_a_dropdown_contains(String string) {
         healthPage.user_should_see_a_dropdown_contains_Test( string );
    }

    @Then("user click on HEALTH link")
    public void user_click_on_HEALTH_link() {
        healthPage.user_click_on_HEALTH_link_Test();
    }

    @Then("user should land on HEALTH page")
    public void user_should_land_on_HEALTH_page() {
        healthPage.user_should_land_on_HEALTH_page_Test();
    }

    @When("user enters zip code")
    public void user_enters_zip_code() {
        healthPage.user_enters_zip_code_Test();
    }

    @When("user clicks on find agent")
    public void user_clicks_on_find_agent() {
        healthPage.user_clicks_on_find_agent_Test();
    }

    @Then("user should land find agent near you")
    public void user_should_land_find_agent_near_you() {
        healthPage.user_should_land_find_agent_near_you_Test();

    }


}
