package dz.qa.njTest.stepDefinitions;

import dz.qa.njPages.GetPetInsuranceQuotePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static dz.qa.njTest.testbase.SetUp.getPetInsuranceQuotePage;

public class GetPetInsuranceQuotePageSD extends GetPetInsuranceQuotePage {
    @Given("user enter zip code {string}")
    public void user_enter_zip_code(String string) {
        getPetInsuranceQuotePage.user_enter_zip_code_Test(string);
    }


    @When("user click on the start quote button")
    public void user_click_on_the_start_quote_button() {
        getPetInsuranceQuotePage.user_click_on_the_start_quote_button_Test();
    }
    @Then("user should see text {string}")
    public void user_should_see_text(String string) {
        String actualResultGetPetQuote = getPetInsuranceQuotePage.user_should_see_text_Test(string);
       String expectedResultGetPetQuote="Get A Pet Insurance Quote";
        Assert.assertEquals(expectedResultGetPetQuote,actualResultGetPetQuote);
    }

    @Then("user enter required feild information")
    public void user_enter_required_feild_information(io.cucumber.datatable.DataTable dataTable) {
       getPetInsuranceQuotePage.user_enter_required_feild_information_Test(dataTable);
    }

    @Then("user click on continue")
    public void user_click_on_continue() {
       getPetInsuranceQuotePage.user_click_on_continue_Test();
   }

}
