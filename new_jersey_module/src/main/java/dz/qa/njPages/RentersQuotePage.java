package dz.qa.njPages;

import common.WebAPI;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

public class RentersQuotePage extends WebAPI {
    public static final String informationList_XP="-oneX-col";
    @FindBy(how= How.XPATH, using=informationList_XP)
    static List<WebElement> informationList;
    public static final String riskAddressstreet1_name="riskAddressstreet1";
    @FindBy(how= How.NAME, using=riskAddressstreet1_name)
    static WebElement riskAddressstreet1;
    public static final String riskAddresscity_name="riskAddresscity";
    @FindBy(how= How.NAME, using=riskAddresscity_name)
    static WebElement riskAddresscity;
    public static final String riskAddressstateProvince_name="riskAddressstateProvince";
    @FindBy(how= How.NAME, using=riskAddressstateProvince_name)
    static WebElement riskAddressstateProvince;//
    public static final String riskAddresspostalCode_nmae="riskAddresspostalCode";
    @FindBy(how= How.NAME, using=riskAddresspostalCode_nmae)
    static WebElement riskAddresspostalCode;
    public static final String mailingAddressToggle_XP="//input[@id='mailingAddressToggle']";
    @FindBy(how= How.XPATH, using=mailingAddressToggle_XP)
    static WebElement mailingAddressToggle;

    public static final String date_XP="//input[@data-formatter='date']";
    @FindBy(how= How.XPATH, using=date_XP)
    static WebElement date_;//input[@id='mailingAddressToggle']
    public void User_enter_all_information_required_Step(DataTable dataTable) {
        List<String> listInformation= new ArrayList<>();
        for (WebElement elem:informationList) {
            String item = elem.getText();
            listInformation.add(item);
            List<Object>information_required = dataTable.asList(Object.class);
            System.out.println(information_required);
            riskAddressstreet1.click();
            riskAddressstreet1.sendKeys((CharSequence) information_required.get(0));
            riskAddresscity.sendKeys((CharSequence) information_required.get(1));
            riskAddressstateProvince.sendKeys((CharSequence) information_required.get(2));
            mailingAddressToggle.click();
            riskAddresspostalCode.sendKeys((CharSequence) information_required.get(3));
            date_.sendKeys((CharSequence) information_required.get(4));
        }
    }
    public void user_check_the_button_My_mailing_address_is_the_same_and_click_continue_Step() {
    }
    public void user_should_land_on_the_next_Step(String string) {
    }


}
