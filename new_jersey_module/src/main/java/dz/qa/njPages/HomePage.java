package dz.qa.njPages;
import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.io.IOException;
public class HomePage extends WebAPI {
    final static String  insurance_Link_Button_XP ="//span[text()='INSURANCE']" ;
    @FindBy(how= How.XPATH,using=insurance_Link_Button_XP)
    static WebElement insurance_Link_Button;
    final static String pet_medical_link_LTEXT="PET MEDICAL";
    @FindBy(how=How.LINK_TEXT,using=pet_medical_link_LTEXT)
    static WebElement pet_medical_link;
    public void user_launch_browser_step(String string) throws IOException {
     setBrowserProperties(string);
    }
    public void user_enter_the_state_farm_url_step(String string) throws IOException {
     setUrlProperties(string);
    }
    public void user_should_land_on_the_state_farm_home_page_step() {
     String actualTitleSF =  driver.getTitle();
     String expectedTitleSF= "Auto, Life Insurance, Banking, & More. Get a Free Quote - State Farm®";
     Assert.assertEquals(actualTitleSF, expectedTitleSF);
    }
    public void user_click_on_insurance_button_step() {
     insurance_Link_Button.click();
    }
    public void user_should_see_drop_down_contains_step(String string) {
        String actual_pet_medical_text = pet_medical_link.getText();
        System.out.println(actual_pet_medical_text);
        String expected_pet_medical_text = "PET MEDICAL";
        Assert.assertEquals(expected_pet_medical_text,actual_pet_medical_text);
    }
}
