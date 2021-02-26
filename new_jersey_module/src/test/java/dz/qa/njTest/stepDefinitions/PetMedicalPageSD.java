package dz.qa.njTest.stepDefinitions;

import dz.qa.njPages.PetMedicalPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static dz.qa.njTest.testbase.SetUp.petMedicalPage;

public class PetMedicalPageSD extends PetMedicalPage {
        @When("user click on insurance button")
    public void user_click_on_insurance_button() {
        petMedicalPage.user_click_on_insurance_button_Test();
    }

    @Then("user should see drop down contains {string}")
    public void user_should_see_drop_down_contains(String string) {
        String actualResult = petMedicalPage.user_should_see_drop_down_contains_Test(string);
        String expectedResult = "PET MEDICAL";
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Then("user click on PET MEDICAL link")
    public void user_click_on_PET_MEDICAL_link() {
            petMedicalPage.user_click_on_PET_MEDICAL_link_Test();
    }

    @Then("user should land on PET MEDICAL Page")
    public void user_should_land_on_PET_MEDICAL_Page() {
       petMedicalPage. user_should_land_on_PET_MEDICAL_Page_Test();
    }

}
