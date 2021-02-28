package dz.qa.njTest.stepDefinitions;
import dz.qa.njPages.GetAQuotePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static dz.qa.njTest.testbase.SetUp.*;

public class GetAQuotePageSD extends GetAQuotePage {


    @Then("User should see a dropdown containing select-product, zip, Start a Quote")
    public void user_should_see_a_dropdown_containing_select_product_zip_Start_a_Quote() throws InterruptedException {
       List<String> actualList = getAQuotePage.user_should_see_a_dropdown_containing_select_product_zip_Start_a_Quote_Step();
       List<String>expectedList =new ArrayList<String>();
       expectedList.add("Product");
        expectedList.add("ZIP Code");
        expectedList.add("Enter 5 digits");
        expectedList.add(" ");
        expectedList.add("Start a quote");
        Assert.assertEquals(expectedList,actualList);
    }

    @When("User enter the product {string} , enter a zip code {string}  and click on Start a Quote")
    public void user_enter_the_product_enter_a_zip_code_and_click_on_Start_a_Quote(String string, String string2) {
        getAQuotePage.user_enter_the_product_enter_a_zip_code_code_and_click_on_Start_a_Quote_Step( string,  string2);
    }

    @Then("User should see a message {string}")
    public void user_should_see_a_message(String string) {
       String actualText = getAQuotePage.user_should_see_a_message_step();
        Assert.assertEquals(string,actualText);
    }

    @Given("User enter all Indicates required field")
    public void user_enter_all_Indicates_required_field(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        getAQuotePage.user_enter_all_Indicates_required_field_Step(dataTable);
    }

    @When("User click on next Vehicles button")
    public void user_click_on_next_Vehicles_button() throws InterruptedException {
        getAQuotePage.user_click_on_next_Vehicles_button_Step();
    }

    @Then("User should see the next form {string}")
    public void user_should_see_the_next_form(String string) throws InterruptedException {
        getAQuotePage.user_should_see_the_next_form_Step(string);
    }
}
