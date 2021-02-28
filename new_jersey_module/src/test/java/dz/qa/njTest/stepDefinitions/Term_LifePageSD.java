package dz.qa.njTest.stepDefinitions;

import dz.qa.njPages.Term_LifePage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static dz.qa.njTest.testbase.SetUp.term_LifePage;

public class Term_LifePageSD extends Term_LifePage {
    //K02
   @Given("the user scrolls down in the Term Life Insurance page")
   public void the_user_scrolls_down_in_the_Term_Life_Insurance_page() {
       term_LifePage.the_user_scrolls_down_in_the_Term_Life_Insurance_page_Test();
   }
    @When("the user see the {string} text")
    public void the_user_see_the_text(String string) {
       boolean  isItDisplyed = term_LifePage.the_user_see_the_text_Test(string);
        Assert.assertTrue(isItDisplyed);
    }
    @Then("the user select {string} from the dropdown menu")
    public void the_user_select_from_the_dropdown_menu(String string) {
        term_LifePage.the_user_select_from_the_dropdown_menu_Test(string);
    }
    @When("the user clicks on the GO button")
    public void the_user_clicks_on_the_GO_button() {
        term_LifePage.the_user_clicks_on_the_GO_button_Test();
    }
    @Then("the user should land on {string}")
    public void the_user_should_land_on(String expectedTitle) {
        String actulTitle = term_LifePage.the_user_should_land_on_Test();
        Assert.assertEquals(actulTitle,expectedTitle);
    }

    //K03
    @Given("the user scrolls down in the Term Life Insurance page to Term Life Choices table")
    public void the_user_scrolls_down_in_the_Term_Life_Insurance_page_to_Term_Life_Choices_table() {
        term_LifePage.the_user_scrolls_down_in_the_Term_Life_Insurance_page_to_Term_Life_Choices_table_Test();
    }

    @When("the user gets to Comparing Term Life Choices table")
    public void the_user_gets_to_Comparing_Term_Life_Choices_table() {
      boolean displyedTable =  term_LifePage.the_user_gets_to_Comparing_Term_Life_Choices_table_Test();
      Assert.assertTrue(displyedTable);
    }
    @Then("the user should see {string}")
    public void the_user_should_see(String string) {
        boolean compare_Choices=term_LifePage.the_user_should_see_Text_Test().contains(string);
        Assert.assertTrue(compare_Choices);
    }
   //K04
   @Given("the user scrolls down in the Term Life Insurance page to Comparing Term to Permanent Insurance")
   public void the_user_scrolls_down_in_the_Term_Life_Insurance_page_to_Comparing_Term_to_Permanent_Insurance() throws InterruptedException {
       term_LifePage.the_user_scrolls_down_in_the_Term_Life_Insurance_page_to_Comparing_Term_to_Permanent_Insurance_Test();
   }

    @When("the user gets to the table")
    public void the_user_gets_to_the_table() {
        term_LifePage.the_user_gets_to_the_table_Test();
    }

    @Then("the user should see the Term Life and Permanent Life like shown in the below table")
    public void the_user_should_see_the_Term_Life_and_Permanent_Life_like_shown_in_the_below_table(io.cucumber.datatable.DataTable dataTable) {
        List<WebElement> WebElementList = term_LifePage.the_user_should_see_the_Term_Life_and_Permanent_Life_like_shown_in_the_below_table_Test();
        List<String>dataTableList=dataTable.asList(String.class);
        List<String>Actual_valuesArrList= new ArrayList<>();
        String [] Actual_valuesArr = new String[WebElementList.size()];
        String [] Expected_valuesArr= new String[dataTableList.size()];
        for(int i=0;i<WebElementList.size();i++) {
            Actual_valuesArrList.add(WebElementList.get(i).getText());
            Actual_valuesArr[i]=WebElementList.get(i).getText();
            Expected_valuesArr[i]=dataTableList.get(i);
        }
        Assert.assertArrayEquals(Actual_valuesArrList.toArray(),dataTableList.toArray());
    }
    //K05
    @Given("the user scrolled down to {string} text")
    public void the_user_scrolled_down_to_text(String string) {
        term_LifePage.the_user_scrolled_down_to_text_Test(string);
    }
    @When("the user enters {string} in the in the State text_field")
    public void the_user_enters_in_the_in_the_State_text_field(String string) {
       term_LifePage.the_user_enters_in_the_in_the_State_text_field_Test(string);
   }
   @When("the user clicks on the {string} button")
   public void the_user_clicks_on_the_button(String string) {
        term_LifePage.the_user_clicks_on_the_button_Test(string);
    }
    @Then("the user should see the {string} when landing in the new page")
    public void the_user_should_see_the_when_landing_in_the_new_page(String string) {
       String actual = term_LifePage.the_user_should_see_the_when_landing_in_the_new_page_Test(string);
       String expectedText = string;
       Assert.assertEquals(expectedText,actual);
    }

}
