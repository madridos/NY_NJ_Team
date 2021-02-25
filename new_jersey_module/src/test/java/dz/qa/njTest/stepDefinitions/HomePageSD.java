package dz.qa.njTest.stepDefinitions;
import dz.qa.njPages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

import static dz.qa.njTest.testbase.SetUp.*;
public class HomePageSD extends HomePage {
//    @When("user enter the state farm url on the browser")
//    public void user_enter_the_state_farm_url_on_the_browser() {
//        homePage.user_enter_the_state_farm_url_on_the_browser_test();
//    }
//    @Then("user should see the state farm home page lunched")
//    public void user_should_see_the_state_farm_home_page_lunched() {
//        homePage.user_should_see_the_state_farm_home_page_lunched_test();
//    }
@Given("user launch browser {string}")
public void user_launch_browser(String string) throws IOException {
   homePage.user_launch_browser_step(string);
}

    @When("user enter the state farm url {string}")
    public void user_enter_the_state_farm_url(String string) throws IOException {
       homePage.user_enter_the_state_farm_url_step(string);
    }

    @Then("user should land on the state farm home page")
    public void user_should_land_on_the_state_farm_home_page() {
      homePage.user_should_land_on_the_state_farm_home_page_step();
    }

    @Given("user click on insurance button")
    public void user_click_on_insurance_button() {
       homePage.user_click_on_insurance_button_step();
    }

    @Then("user should see drop down contains {string}")
    public void user_should_see_drop_down_contains(String string) {
        homePage.user_should_see_drop_down_contains_step(string);
    }

}