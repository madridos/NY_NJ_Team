package dz.qa.njTest.stepDefinitions;
import dz.qa.njPages.File_A_Claim_For_Costumers;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import static dz.qa.njTest.testbase.SetUp.file_a_claim_for_costumers;
public class File_A_Claim_for_CustomersSD extends File_A_Claim_For_Costumers {
    @When("costumers click on {string}")
    public void costumers_click_on(String string) {
        file_a_claim_for_costumers.costumers_click_on_Step(string);
    }
    @When("select \"Auto & Motorcycle")
    public void select_Auto_Motorcycle() throws InterruptedException {
        file_a_claim_for_costumers.select_Auto_Motorcycle_Step();
        boolean isItSelected = select_Auto_Motorcycle.isSelected();
        Assert.assertFalse(isItSelected);
        select_Auto_Motorcycle.click();
        Thread.sleep(2000);
        System.out.println("this checkbox is not selected");
    }
    @Then("a start option should be displayed and click to start")
    public void a_start_option_should_be_displayed_and_click_to_start() throws InterruptedException {
        file_a_claim_for_costumers.a_start_option_should_be_displayed_and_click_to_start_Step();
        boolean isItDisplayed = start_button.isDisplayed();
        Assert.assertTrue(isItDisplayed);
    }
    @When("you select a state farm costumer")
    public void you_select_a_state_farm_costumer() {
        file_a_claim_for_costumers.you_select_a_state_farm_costumer_Step();
    }
    @When("press continue button")
    public void press_continue_button() {
        file_a_claim_for_costumers.press_continue_button_Step();
    }
    @Then("a login field should appear")
    public void a_login_field_should_appear() {
        file_a_claim_for_costumers.a_login_field_should_appear_Step();
        String actual_State_farm_login_title = driver.getTitle();
        String expected_State_farm_login_title = "State Farm® | Login";
        Assert.assertEquals(actual_State_farm_login_title, expected_State_farm_login_title);
        System.out.println("this is the right login title");
    }
    @When("costumers enter user id")
    public void costumers_enter_user_id() {
        file_a_claim_for_costumers.costumers_enter_user_id_Step();
    }
    @When("costumers enter password")
    public void costumers_enter_password() {
        file_a_claim_for_costumers.costumers_enter_password_Step();
    }
    @When("click on log in")
    public void click_on_log_in() throws InterruptedException {
        file_a_claim_for_costumers.click_on_log_in_Step();
    }
    @Then("a welcome home page for costumers should appear")
    public void a_welcome_home_page_for_costumers_should_appear() {
      //  file_a_claim_for_costumers.a_welcome_home_page_for_costumers_should_appear_Step();
        boolean errorLogin =invalidUserMassage.isDisplayed();
        Assert.assertTrue(errorLogin);
        System.out.println("your username and password are invalid");
    }
}
