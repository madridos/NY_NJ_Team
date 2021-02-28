package dz.qa.njTest.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static dz.qa.njTest.testbase.SetUp.healthPage;

public class HealthPageSD {
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
