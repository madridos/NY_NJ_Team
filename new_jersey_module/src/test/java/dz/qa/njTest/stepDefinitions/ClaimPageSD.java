package dz.qa.njTest.stepDefinitions;
import dz.qa.njPages.ClaimPage;
import io.cucumber.java.en.*;
import static dz.qa.njTest.testbase.SetUp.claimPage;
public class ClaimPageSD extends ClaimPage {
    @Given("user landed on state farm home page")
    public void user_landed_on_state_farm_home_page() {
        claimPage.user_landed_on_state_farm_home_page_test();
    }
    @When("user clicks on CLAIMS on the page header bar menu")
    public void user_clicks_on_CLAIMS_on_the_page_header_bar_menu() throws InterruptedException {
        claimPage.user_clicks_on_CLAIMS_on_the_page_header_bar_menu_test();
    }
    @Then("drop down menu section containing {string},{string} and {string} should appear")
    public void drop_down_menu_section_containing_and_should_appear(String string, String string2, String string3) throws InterruptedException {
        claimPage.drop_down_menu_section_containing_and_should_appear_test(string,string2,string3);
    }
    @When("user clicks on {string}")
    public void user_clicks_on(String string) throws InterruptedException {
        claimPage.user_clicks_on_test(string);
    }
    @Then("user should land on {string}")
    public void user_should_land_on(String string) {
        claimPage.user_should_land_on( string);
    }

}
