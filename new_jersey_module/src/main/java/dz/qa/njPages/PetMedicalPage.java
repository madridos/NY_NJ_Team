
package dz.qa.njPages;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class PetMedicalPage extends WebAPI {

    final static String pet_medical_link_LTEXT="PET MEDICAL";
    @FindBy(how=How.LINK_TEXT,using=pet_medical_link_LTEXT)
    static WebElement pet_medical_link;
    final static String pet_insurance_text_XP="//h1[text()='Pet Insurance From State Farm']";
    @FindBy(how=How.XPATH,using =pet_insurance_text_XP )
    static WebElement pet_insurance_text;
    static final String INSURANCE_Link_XP="//span[contains(text(),'INSURANCE')]";
    @FindBy(how= How.XPATH,using=INSURANCE_Link_XP)
    static WebElement INSURANCE_Link;

    public void user_click_on_insurance_button_Test() {
    INSURANCE_Link.click();
    }

    public String user_should_see_drop_down_contains_Test(String string) {
        string=pet_medical_link.getText();
        return string;
    }
    public void user_click_on_PET_MEDICAL_link_Test() {
        pet_medical_link.click();
    }
    public void user_should_land_on_PET_MEDICAL_Page_Test() {
        String actual_pet_insurance_text =pet_insurance_text.getText();
        System.out.println(actual_pet_insurance_text);
        String expected_pet_insurance_text = "Pet Insurance From State Farm® and Trupanion®";
        Assert.assertEquals(expected_pet_insurance_text,actual_pet_insurance_text);
    }
}