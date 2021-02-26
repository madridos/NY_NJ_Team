package dz.qa.njPages;
import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class File_A_Claim_For_Costumers extends WebAPI {
    public static final String file_A_Claim_Button_XPath = "//a[contains(text(),'File a claim')]";
    @FindBy(how = How.XPATH, using = file_A_Claim_Button_XPath)
    public static WebElement file_A_Claim_Button;
    public static final String select_Auto_Motorcycle_XPath = "//label[contains(text(),'Auto & Motorcycle')]";
    @FindBy(how = How.XPATH, using = select_Auto_Motorcycle_XPath)
    public static WebElement select_Auto_Motorcycle;
    public static final String start_button_Id = "[id='accident']";
    @FindBy(how = How.CSS, using = start_button_Id)
    public static WebElement start_button;
    public static final String select_State_Farm_Costumer_Css = "body.formal.-oneX.-oneX-resize-bound:nth-child(2) section.west.claims.panels.-w_pt-80.-w_mt-100.-w_pb-100:nth-child(3) div.-oneX-container div.-oneX-row div.-oneX-col-12.-oneX-col-md-7:nth-child(2) div.-oneX-row div.-oneX-col-12 div.-oneX-col-11.-oneX-col-sm-10.-w_pl-25:nth-child(2) div.-oneX-panel--expansion:nth-child(2) > div.-oneX-panel-control";
    @FindBy(how = How.CSS, using = select_State_Farm_Costumer_Css)
    public static WebElement select_State_Farm_Costumer;
    public static final String continue_Button_Id = "ph-start";
    @FindBy(how = How.ID, using = continue_Button_Id)
    public static WebElement continue_Button;
    public static final String user_Id_Css="#userId";
    @FindBy(how=How.CSS,using=user_Id_Css )
    public static WebElement user_Id;
    public static final String password_Css="#password";
    @FindBy(how=How.CSS,using=password_Css )
    public static WebElement password;
    public static final String login_Css="#submitButton";
    @FindBy(how=How.CSS,using=login_Css )
    public static WebElement login;
    public static final String invalidUserMassage_Css="block-link2";
    @FindBy(how=How.ID,using=invalidUserMassage_Css )
    public static WebElement invalidUserMassage;
    public void costumers_click_on_Step(String string) {
        file_A_Claim_Button.click();
    }
    public void select_Auto_Motorcycle_Step() throws InterruptedException {
    }
    public void a_start_option_should_be_displayed_and_click_to_start_Step() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        System.out.println("start button is displayed");
        Thread.sleep(2000);
        start_button.click();
    }
    public void you_select_a_state_farm_costumer_Step() {
        select_State_Farm_Costumer.click();
    }
    public void press_continue_button_Step() {
        continue_Button.click();
    }
    public void a_login_field_should_appear_Step() {
    }
    public void costumers_enter_user_id_Step() {
        user_Id.sendKeys("mahmudul");
    }
    public void costumers_enter_password_Step() {
        password.sendKeys("3663783hrjkf");
    }
    public void click_on_log_in_Step() throws InterruptedException {
        login.click();
        Thread.sleep(2000);
    }
}
