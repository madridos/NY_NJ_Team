
package dz.qa.njPages;

import common.WebAPI;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class GetPetInsuranceQuotePage extends WebAPI {
    final static String zipCodeXP="//input[@id='quote-main-zip-code-input']";
    @FindBy(how= How.XPATH,using=zipCodeXP)
    static WebElement zipCode;
    final static String startQuoteButtonID="quote-main-zip-code-button-1";
    @FindBy(how = How.ID,using = startQuoteButtonID)
    static WebElement startQuoteButton;
    final static String getQuotetxtXP="//div[@class='span8']";
    @FindBy(how = How.XPATH,using = getQuotetxtXP)
    static WebElement getQuotetxt;
//    public static final String OptionListID="mainForm";
//    @FindBy(how= How.ID, using=OptionListID)
//    static List<WebElement> OptionList;
    final static String firstNameID="//input[@name='firstName']";
    @FindBy(how = How.XPATH,using = firstNameID)
    static WebElement firstName;
    public static final String lastNameXP="//input[@name='lastName']";
    @FindBy(how= How.XPATH, using=lastNameXP)
    static WebElement lastName;
    final static String streetAdressXP="//input[@id='sfx_userAddress.streetAddress_input']";
    @FindBy(how = How.XPATH,using = streetAdressXP)
    static WebElement streetAdress;
    final static String apartmentXP="//input[@id='sfx_userAddress.apartmentOrUnitNumber_input']";
    @FindBy(how = How.XPATH,using = apartmentXP)
    static WebElement apartment;
    final static String continueButtonID="welcome.continue]";
    @FindBy(how = How.ID,using =continueButtonID )
    static WebElement continueButton;

    public void user_enter_zip_code_Test(String string) {
        zipCode.sendKeys(string);
    }
    public void user_click_on_the_start_quote_button_Test() {
        startQuoteButton.click();
    }
    public String user_should_see_text_Test(String string) {
        string=getQuotetxt.getText();
        return string;
    }

    public void user_enter_required_feild_information_Test(DataTable dataTable) {
        List<Object>required_FieldList = dataTable.asList(Object.class);
        firstName.sendKeys((CharSequence) required_FieldList.get(0));
        lastName.sendKeys((CharSequence) required_FieldList.get(1));
        streetAdress.sendKeys((CharSequence) required_FieldList.get(2));
        apartment.sendKeys((CharSequence) required_FieldList.get(3));
    }

    public void user_click_on_continue_Test() {
        continueButton.click();
    }
}