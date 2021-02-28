package dz.qa.njTest.stepDefinitions;
import dz.qa.njPages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

import static dz.qa.njTest.testbase.SetUp.*;
public class HomePageSD extends HomePage {
    @Given("user is on state farm home page and should see their title displayed {string}")
    public void user_is_on_state_farm_home_page_and_should_see_their_title_displayed(String actualResult) {
        actualResult= homePage.user_is_on_state_farm_home_page_and_should_see_their_title_displayed_Step(actualResult);
        String expectedResulthomePageTitle="Auto, Life Insurance, Banking, & More. Get a Free Quote - State Farm®";
        Assert.assertEquals(actualResult,expectedResulthomePageTitle);
    }
    @When("user clicks on {string} on the page header bar menu")
    public void user_clicks_on_on_the_page_header_bar_menu(String string) throws InterruptedException {
        homePage.user_clicks_on_CLAIMS_on_the_page_header_bar_menu_test(string);
    }

    @Then("drop down menu section containing {string},{string} and {string} should appear")
    public void drop_down_menu_section_containing_and_should_appear(String expectedResut1, String expectedResut2, String expectedResut3) throws InterruptedException {
        List<String> actualResult=homePage.drop_down_menu_section_containing_and_should_appear_test();
        Assert.assertTrue(actualResult.contains(expectedResut1));
        Assert.assertTrue(actualResult.contains(expectedResut2));
        Assert.assertTrue(actualResult.contains(expectedResut3));

    }
    @When("user clicks on {string} link")
    public void user_clicks_on_link(String string) throws InterruptedException {
        homePage.user_clicks_on_link_test(string);
    }
    @Then("user should land on {string} page")
    public void user_should_land_on_page(String string) {
        String actualTitle = homePage.user_should_land_on_page_test();
        String expectedTitle = string;
        Assert.assertEquals(expectedTitle,actualTitle);

    }
}