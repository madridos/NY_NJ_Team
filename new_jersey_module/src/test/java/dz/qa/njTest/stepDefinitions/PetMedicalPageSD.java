package dz.qa.njTest.stepDefinitions;
import dz.qa.njPages.PetMedicalPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static dz.qa.njTest.testbase.SetUp.petMedicalPage;
public class PetMedicalPageSD extends PetMedicalPage {
    @When("user scrolls down to the footer page")
    public void user_scrolls_down_to_the_footer_page() {
        petMedicalPage.user_scrolls_down_to_the_footer_page_test();
    }
    @When("user click on the link {string}")
    public void user_click_on_the_link(String string) {
      String actualTitle =  petMedicalPage.user_click_on_the_link_test();
      Assert.assertEquals(string,actualTitle);
    }
}