package dz.qa.njPages;

import common.WebAPI;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Term_LifePage extends WebAPI {
    //Term Life page WebElements
    static final  String  INSURANCE_Link_XP="//span[contains(text(),'INSURANCE')]";
    @FindBy(how= How.XPATH,using=INSURANCE_Link_XP)
    static WebElement INSURANCE_Link;
    static final String Term_Life_LinkedText="Term Life";
    @FindBy(how=How.LINK_TEXT,using =Term_Life_LinkedText)
    static WebElement Term_Life;
    static final String Welcome_Text_XP="//h1[starts-with(@class,'-oneX-acquisition-heading -oneX-heading--XL')]";
    @FindBy(how = How.XPATH,using=Welcome_Text_XP)
    static WebElement Welcome_Text;
    static final String Get_A_Quote_Text_XP="//h2[contains(text(),'Get a quote for term life insurance')]";
    @FindBy(how=How.XPATH,using=Get_A_Quote_Text_XP)
    static WebElement Get_A_Quote_Text;
    static final String dropDow_Menu_XP="//body[1]/div[8]/section[7]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]/select[1]";
    @FindBy(how=How.XPATH,using=dropDow_Menu_XP)
    static WebElement dropDow_Menu;
    static final String Go_button_XP ="//button[contains(text(),'Go')]";
    @FindBy(how=How.XPATH ,using=Go_button_XP)
    static WebElement Go_button;
    static final String Comparing_erm_Table_XP="//div[starts-with(@class,'-oneX-col-12 -oneX-col-md-10')]";
    @FindBy(how=How.XPATH,using=Comparing_erm_Table_XP)
    static WebElement Comparing_erm_Table;

    static final String compare_Choices_XP="//h3[contains(@class,'-oneX-acquisition-heading -oneX-heading--M override-table-h3')]";
    @FindBy(how=How.XPATH,using=compare_Choices_XP)
    static WebElement compare_Choices;
    //h2[@id='compare-accounts']
    static final String compare_accounts_XP="//table[starts-with(@class,'table-borderBottom basic-table')]/tbody/tr[3]/td[2]";
    @FindBy(how=How.XPATH,using=compare_accounts_XP)
    static WebElement compare_accounts;

    static final String Table_Elements_XP="//table[starts-with(@class,'table-borderBottom basic-table')]/tbody/tr/td";
    @FindBy(how=How.XPATH,using=Table_Elements_XP)
    static List<WebElement> Table_Elements;

    static final String State_Initials_XP="//body[1]/div[8]/section[4]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]/select[1]";
    @FindBy(how=How.XPATH,using=State_Initials_XP)
    static WebElement State_Initials;

    //K02:Get an Online Select Term Life Quote
    public void the_user_scrolls_down_in_the_Term_Life_Insurance_page_Test() {
        Actions ac =new Actions(driver);
        ac.moveToElement(Get_A_Quote_Text).build().perform();
    }
    public boolean the_user_see_the_text_Test(String string) {
        boolean Get_an_Online_Text_Is_Visible=driver.findElement(By.xpath("//*[contains(text(),'"+string+"')]")).isDisplayed();
        return Get_an_Online_Text_Is_Visible;
    }
    public void the_user_select_from_the_dropdown_menu_Test(String string) {
     Select select= new Select(dropDow_Menu);
     select.selectByVisibleText(string);
    }
    public void the_user_clicks_on_the_GO_button_Test() {
        Go_button.click();
    }
    public String the_user_should_land_on_Test() {
        String actual_Title=driver.getTitle();
        return actual_Title;
    }

    //K03:Comparing Term Life Choices
    public void the_user_scrolls_down_in_the_Term_Life_Insurance_page_to_Term_Life_Choices_table_Test() {
        Actions ac=new Actions(driver);
        ac.moveToElement(Comparing_erm_Table).build().perform();
    }
    public boolean the_user_gets_to_Comparing_Term_Life_Choices_table_Test() {
        boolean Comparing_erm_Table_Is_Displayed=Comparing_erm_Table.isDisplayed();
       return Comparing_erm_Table_Is_Displayed;
    }

    public String the_user_should_see_Text_Test() {
        String Actual_Text=compare_Choices.getText().trim();
        return Actual_Text;
    }
    //K04:Comparing Term to Permanent Insurance
    public void the_user_scrolls_down_in_the_Term_Life_Insurance_page_to_Comparing_Term_to_Permanent_Insurance_Test() throws InterruptedException {
        Actions ac =new Actions(driver);
        Thread.sleep(2000);
        ac.moveToElement(compare_accounts).build().perform();
        Thread.sleep(3000);
    }
    public void the_user_gets_to_the_table_Test() {
        String table_tag=compare_accounts.getTagName();
        System.out.println(table_tag);
    }
    public List<WebElement> the_user_should_see_the_Term_Life_and_Permanent_Life_like_shown_in_the_below_table_Test() {
//        Table_Elements
       return Table_Elements;
    }

    public  void the_user_scrolled_down_to_text_Test(String string) {
        ////*[contains(text(),'Get an Online Select')]
        String Get_an_Online_Select_XP= "//*[contains(text(),'"+string+"')]";
        WebElement Get_an_Online_Select=driver.findElement(By.xpath(Get_an_Online_Select_XP));
        Actions ac =new Actions(driver);
        ac.moveToElement(Get_an_Online_Select).build().perform();
    }
    public  void the_user_enters_in_the_in_the_State_text_field_Test(String string) {
     Select state= new Select(State_Initials);
     state.selectByVisibleText(string);
    }

    public  void the_user_clicks_on_the_button_Test(String string) {
        String Start_Quote_Button_XP="//button[contains(text(),'"+string+"')]";
        WebElement Start_Quote_Button=driver.findElement(By.xpath(Start_Quote_Button_XP));
        Start_Quote_Button.click();
    }

    public String the_user_should_see_the_when_landing_in_the_new_page_Test(String string) {
        String actual_Text_XP="//h1";
        String actual_Text=driver.findElement(By.xpath(actual_Text_XP)).getText();
        return actual_Text;
    }
}
