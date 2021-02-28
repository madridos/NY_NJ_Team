package dz.qa.njPages;

import common.WebAPI;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class RentersQuotePage extends WebAPI {
    public static final String startWithTheAddressXP="//div[contains(text(),' Let’s start with the address ')]";
    @FindBy(how= How.XPATH, using=startWithTheAddressXP)
    static WebElement startWithTheAddress;

    public static final String riskAddressstreet1XP="//input[contains(@name,'riskAddressstreet1')]";
    @FindBy(how= How.XPATH, using=riskAddressstreet1XP)
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
    public static final String addressClick_XP="//div[contains(@id,'riskAddress')]";
    @FindBy(how= How.XPATH, using=addressClick_XP)
    static WebElement addressClick;

    public static final String date_XP="//input[@data-formatter='date']";
    @FindBy(how= How.XPATH, using=date_XP)
    static WebElement date_;

    public static final String mailingAddressToggleXP="//label[@for='mailingAddressToggle']";
    @FindBy(how= How.XPATH, using=mailingAddressToggleXP)
    static WebElement mailingAddressToggle1;
    public static final String submitButtonXP="//button[contains(@id,'submit')]";
    @FindBy(how= How.XPATH, using=submitButtonXP)
    static WebElement submitButton;
    public static final String tellUsaLittleXP="//button[contains(@id,'submit')]";
    @FindBy(how= How.XPATH, using=tellUsaLittleXP)
    static WebElement tellUsaLittle;
    public static final String chevronDownXP="//div[@class='-oneX-icon--chevron--down']";
    @FindBy(how= How.XPATH, using=chevronDownXP)
    static WebElement chevronDown;



    public String user_should_see_a_welcome_message_Step() {
        String textToStart = startWithTheAddress.getText();
     return textToStart;
    }
    public void User_enter_all_information_required_Step(DataTable dataTable) throws InterruptedException {
        List<Object>information_required = dataTable.asList(Object.class);
        System.out.println(information_required);
        addressClick.click();
        Thread.sleep(300);
        riskAddressstreet1.sendKeys((CharSequence) information_required.get(0));
        riskAddresscity.sendKeys((CharSequence) information_required.get(1));
        riskAddressstateProvince.sendKeys((CharSequence) information_required.get(2));
        riskAddresspostalCode.sendKeys((CharSequence) information_required.get(3));
        date_.sendKeys((CharSequence) information_required.get(4));
    }
    public void user_check_the_button_My_mailing_address_is_the_same_and_click_continue_Step() throws InterruptedException {
        Thread.sleep(200);
        //mailingAddressToggle1.click();
        submitButton.click();
        Thread.sleep(1000);

    }
//    public static String getText(WebDriver driver, WebElement locator, int timeout) {
//
//        new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.invisibilityOf(locator));
//
//
//        return locator.getText();
//    }

    public String user_should_land_on_the_next_Step() throws InterruptedException {
        chevronDown.click();
        Thread.sleep(1000);
        return tellUsaLittle.getText();
    }

}
