package dz.qa.njTest.stepDefinitions;
import dz.qa.njPages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static dz.qa.njTest.testbase.SetUp.*;
public class HomePageSD extends HomePage {
    @When("user enter the state farm url on the browser")
    public void user_enter_the_state_farm_url_on_the_browser() {
        homePage.user_enter_the_state_farm_url_on_the_browser_test();
    }
    @Then("user should see the state farm home page lunched")
    public void user_should_see_the_state_farm_home_page_lunched() throws InterruptedException {
        homePage.user_should_see_the_state_farm_home_page_lunched_test();
    }
}