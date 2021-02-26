package dz.qa.njPages;

import common.WebAPI;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

public class GetAQuotePage extends WebAPI {

public static final String GET_A_QUOTE_click_XP="//span[text()='GET A QUOTE']";
    @FindBy(how= How.XPATH, using=GET_A_QUOTE_click_XP)
    static WebElement GET_A_QUOTE_click;
    public static final String OptionList_XP="//*[contains(@for,'getaquote')]";
    @FindBy(how= How.XPATH, using=OptionList_XP)
    static List<WebElement> OptionList;
    public static final String dropDown_SelectProduct_ID="getaquote-select-product";
    @FindBy(how= How.ID, using=dropDown_SelectProduct_ID)
    static WebElement dropDown_SelectProduct;
    public static final String dropDown_stateSelect_ID="getaquote-zip";
    @FindBy(how= How.ID, using=dropDown_stateSelect_ID)
    static WebElement dropDown_stateSelect;
    public static final String QuoteButton_ID="getaQuoteButton";
    @FindBy(how= How.ID, using=QuoteButton_ID)
    static WebElement QuoteButton;

    public static final String message_Info_XP="//h1[@class='sfx-text ']";
    @FindBy(how= How.XPATH, using=message_Info_XP)
    static WebElement message_Info;
    public static final String first_name_CSS="#first_name";
    @FindBy(how= How.CSS, using=first_name_CSS)
    static WebElement first_name;
    public static final String last_name_CSS="#last_name";
    @FindBy(how= How.CSS, using=last_name_CSS)
    static WebElement last_name;
    public static final String street1Adress_XP="//input[@id='street1']";
    @FindBy(how= How.XPATH, using=street1Adress_XP)
    static WebElement street1Adress;
//    public static final String city_CSS="#city";
//    @FindBy(how= How.CSS, using=city_CSS)
//    static WebElement city;
//    public static final String stateProvince_XP="//input[@class='default  input-edit input-large disabled hasclienterror floatLabel']";
//    @FindBy(how= How.XPATH, using=stateProvince_XP)
//    static WebElement stateProvince;
    public static final String zipPostalCode_XP="//input[@id='zipPostalCode']";
    @FindBy(how= How.XPATH, using=zipPostalCode_XP)
    static WebElement zipPostalCode;
    public static final String date_of_birth_XP="#date_of_birth";
    @FindBy(how= How.CSS, using=date_of_birth_XP)
    static WebElement date_of_birth;
    public static final String effectiveDate_XP="//input[@id='effectiveDate']";
    @FindBy(how= How.XPATH, using=effectiveDate_XP)
    static WebElement effectiveDate;
//    public static final String nextVehicles_name="nextVehicles";
//    @FindBy(how= How.NAME, using=nextVehicles_name)
//    static WebElement nextVehicles;
public static final String nextVehicles_ID="btnContinue";
    @FindBy(how= How.ID, using=nextVehicles_ID)
    static WebElement nextVehicles;
    public static final String Vehicles_nextForm_XP="//div/h1[text()='Vehicles']";
    @FindBy(how= How.XPATH, using=Vehicles_nextForm_XP)
    static WebElement Vehicles_nextForm;
    public static final String pre_headingSteps_XP="//div[@class='pre-heading']";
    @FindBy(how= How.XPATH, using=pre_headingSteps_XP)
    static WebElement pre_headingSteps;
    public void the_user_Lands_in_Stat_farm_home_page_Step() {
    }

    public void user_click_on_GET_A_QUOTE_link_Step() {
        GET_A_QUOTE_click.click();
    }

    public void user_should_see_a_dropdown_containing_select_product_zip_Start_a_Quote_Step() throws InterruptedException {
List<String>listOptoin= new ArrayList<>();
        for (WebElement elem:OptionList) {
            //Thread.sleep(200);
            String item = elem.getText();
             listOptoin.add(item);
        }
        listOptoin.add( QuoteButton.getText());
    }

    public void user_enter_the_product_enter_a_zip_code_code_and_click_on_Start_a_Quote_Step(String string, String string2) {
        dropDown_SelectProduct.sendKeys(string);
        dropDown_stateSelect.sendKeys(string2);
        QuoteButton.click();
    }

    public void user_should_see_a_message_step(String string) {
       String actulText = message_Info.getText();
        Assert.assertEquals(string,actulText);
    }

    public void user_enter_all_Indicates_required_field_Step(DataTable dataTable) throws InterruptedException {
       List<Object>required_FieldList = dataTable.asList(Object.class);
        //System.out.println(required_FieldList);
        first_name.sendKeys((CharSequence) required_FieldList.get(0));
        last_name.sendKeys((CharSequence) required_FieldList.get(1));
        street1Adress.sendKeys((CharSequence) required_FieldList.get(2));
        //stateProvince.click();
        //stateProvince.sendKeys(required_FieldList.get(4));
        //Thread.sleep(2000);
        zipPostalCode.clear();
        zipPostalCode.sendKeys((CharSequence) required_FieldList.get(5));
        date_of_birth.sendKeys((CharSequence) required_FieldList.get(6));
        effectiveDate.sendKeys((CharSequence) required_FieldList.get(7));
//Thread.sleep(2000);
    }

    public void user_click_on_next_Vehicles_button_Step() throws InterruptedException {
        //Thread.sleep(50000);
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", nextVehicles);
       // Thread.sleep(50000);
        //nextVehicles.click();
//        driver.manage().window().maximize();
//       driver.manage().deleteAllCookies();
//        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }



    public void user_should_see_the_next_form_Step(String string) throws InterruptedException {
//       document.getElementById("myBtn").textContent;
//        System.out.println(pre_headingSteps.getText());
        //Thread.sleep(3000);
//        JavascriptExecutor js1 = ((JavascriptExecutor) driver);
//        String title = js1.executeScript("return document.textContent;",pre_headingSteps.getText()).toString();
//        System.out.println(title);
//        String next_Form = Vehicles_nextForm.getText();
//        Assert.assertEquals(string,next_Form);
//        String contentText = pre_headingSteps.getText();
//        Assert.assertEquals(string,contentText);
    }


}
