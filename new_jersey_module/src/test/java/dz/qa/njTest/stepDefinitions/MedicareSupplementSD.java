package dz.qa.njTest.stepDefinitions;

import dz.qa.njPages.MedicareSupplementPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import static dz.qa.njTest.testbase.SetUp.*;

public class MedicareSupplementSD extends MedicareSupplementPage {
    @Given("the user launch the browser")
    public void the_user_launch_the_browser() {

    }

    @Given("enter the state farm {string} into a web browser.")
    public void enter_the_state_farm_into_a_web_browser(String url) {
        medicareSupplementPage.enter_the_state_farm_into_a_web_browser_test(url);
    }

    @Then("state farm home Page appears")
    public void state_farm_home_Page_appears() {
medicareSupplementPage.state_farm_home_Page_appears_Test();
    }

    @When("user click on INSURANCE link on hom Page")
    public void user_click_on_INSURANCE_link_on_hom_Page() {
medicareSupplementPage.user_click_on_INSURANCE_link_on_hom_Page_Test();
    }

    @When("he clicks on Medicare Supplement")
    public void he_clicks_on_Medicare_Supplement() {
medicareSupplementPage.he_clicks_on_Medicare_Supplement_Test();
    }

    @Then("Medicare Supplement page appears")
    public void medicare_Supplement_page_appears() {
        medicareSupplementPage.medicare_Supplement_page_appears();
    }
// Scenario:Sen-01 scroll To Element to element
@Given("user on Medicare Supplement scroll To Find an Agent Element")
public void user_on_Medicare_Supplement_scroll_To_Find_an_Agent_Element() {
   medicareSupplementPage.user_on_Medicare_Supplement_scroll_To_Find_an_Agent_Element_Tes();
}
    @Then("enter {string} into zip code field")
    public void enter_into_zip_code_field(String string) {
    medicareSupplementPage.enter_into_zip_code_field_test(string);
    }
    @When("he clicks on go button a Find a State Farm Agent Near You page should appaers")
    public void he_clicks_on_go_button_a_Find_a_State_Farm_Agent_Near_You_page_should_appaers() {
        medicareSupplementPage.he_clicks_on_go_button_a_Find_a_State_Farm_Agent_Near_You_page_should_appaers_Test();
    }
    //Sen-02 Learn about Medicare Supplement Insurance by stats
    @Given("user select a {string} And click on Go button")
    public void user_select_a_And_click_on_Go_button(String statSelected) {
 medicareSupplementPage.user_select_a_And_click_on_Go_button_Test(statSelected);
    }

    @Then("Medicare Supplement Insurance — {string} page should appears")
    public void medicare_Supplement_Insurance_page_should_appears(String string) {
    }
// Sen-03 change-a-health-policy link verification
@Given("user on Medicare Supplement scroll To Find an Agent change-a-health-policy link verification link")
public void user_on_Medicare_Supplement_scroll_To_Find_an_Agent_change_a_health_policy_link_verification_link() {
medicareSupplementPage.user_on_Medicare_Supplement_scroll_To_Find_an_Agent_change_a_health_policy_link_verification_link_Test();
}
    @When("he clicks on that link")
    public void he_clicks_on_that_link() {
        medicareSupplementPage.he_clicks_on_that_link_Test();

    }
    @Then("a Health Policy page appaers")
    public void a_Health_Policy_page_appaers() {

    }
// Scenario:Sen-04 scolDown and click on Contact your agent/insurance producer link

    @Given("user on Medicare Supplement scroll To Find Contact your agent_insurance producer link")
    public void user_on_Medicare_Supplement_scroll_To_Find_Contact_your_agent_insurance_producer_link() {
    medicareSupplementPage.user_on_Medicare_Supplement_scroll_To_Find_Contact_your_agent_insurance_producer_link_Test();
    }

    @When("he clicks on that Link.")
    public void he_clicks_on_that_Link() {
  medicareSupplementPage.he_clicks_on_that_Link_Test();
    }

    @Then("a Find a State Farm Agent Near You appaers")
    public void a_Find_a_State_Farm_Agent_Near_You_appaers() {
      medicareSupplementPage.a_Find_a_State_Farm_Agent_Near_You_appaers_Test();
    }
// Scenario:Sen-05 verify insurance link
@Given("user on Medicare Supplement click on insurance link")
public void user_on_Medicare_Supplement_click_on_insurance_link() {
medicareSupplementPage.user_on_Medicare_Supplement_click_on_insurance_link();

}

    @Then("a Get great insurance and a great value appaers")
    public void a_Get_great_insurance_and_a_great_value_appaers() {

    }

}
