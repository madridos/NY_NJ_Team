
package dz.qa.njPages;

import common.WebAPI;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class PetMedicalPage extends WebAPI {
    static final String Term_Life_LinkedText="Term Life";
    @FindBy(how=How.LINK_TEXT,using =Term_Life_LinkedText)
    static WebElement Term_Life;
    final static String pet_medical_link_LTEXT="PET MEDICAL";
    @FindBy(how=How.LINK_TEXT,using=pet_medical_link_LTEXT)
    static WebElement pet_medical_link;
    final static String pet_insurance_text_XP="//h1[text()='Pet Insurance From State Farm']";
    @FindBy(how=How.XPATH,using =pet_insurance_text_XP )
    static WebElement pet_insurance_text;
    static final String INSURANCE_Link_XP="//span[contains(text(),'INSURANCE')]";
    @FindBy(how= How.XPATH,using=INSURANCE_Link_XP)
    static WebElement INSURANCE_Link;


    public void user_scrolls_down_to_the_footer_page_test() {
        scrollToElementJScript(Term_Life);
    }

    public String user_click_on_the_link_test() {
        Term_Life.click();
      String actualTitle =  driver.getTitle();
      return   actualTitle;
    }
}