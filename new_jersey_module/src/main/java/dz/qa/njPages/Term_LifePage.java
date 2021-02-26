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

    //Background:
    public void user_lands_on_State_farm_home_page_Test() {
        String expected_Page_Title="Auto, Life Insurance, Banking, & More. Get a Free Quote - State Farm®";
        String actual_page_Title=driver.getTitle();
        Assert.assertEquals(expected_Page_Title,actual_page_Title);
    }
    public void user_clicks_on_link_in_the_header_bar_menu_Test(String string) {
        INSURANCE_Link.click();
    }
    public void user_clicks_on_in_the_dropdown_menu_Test(String string) {
        Term_Life.click();
    }

    //K01:Navigating and landing on Term Life page
    public void user_should_land_on_Test(String string) {
        String actual_page_URL=driver.getCurrentUrl();
        Assert.assertEquals(string,actual_page_URL);
    }
    public void user_should_see_the_Test(String string) {
        String actual_page_Title1=driver.getTitle();
        Assert.assertEquals(string,actual_page_Title1);
    }

    //K02:Get an Online Select Term Life Quote
    public void the_user_scrolls_down_in_the_Term_Life_Insurance_page_Test() {
        Actions ac =new Actions(driver);
        ac.moveToElement(Get_A_Quote_Text).build().perform();
    }
    public void the_user_see_the_text_Test(String string) {
        boolean Get_an_Online_Text_Is_Visible=Get_A_Quote_Text.isDisplayed();
        Assert.assertTrue(Get_an_Online_Text_Is_Visible);
    }
    public void the_user_select_from_the_dropdown_menu_Test(String string) {

     Select select= new Select(dropDow_Menu);
     select.selectByVisibleText(string);
    }
    public void the_user_clicks_on_the_GO_button_Test() {
        Go_button.click();
    }
    public void the_user_should_land_on_Test(String Expected_Title) {
        String Actual_Title=driver.getTitle();
        Assert.assertEquals(Expected_Title,Actual_Title);
    }

    //K03:Comparing Term Life Choices
    public void the_user_scrolls_down_in_the_Term_Life_Insurance_page_to_Term_Life_Choices_table_Test() {
        Actions ac=new Actions(driver);
        ac.moveToElement(Comparing_erm_Table).build().perform();
    }
    public void the_user_gets_to_Comparing_Term_Life_Choices_table_Test() {
        boolean Comparing_erm_Table_Is_Displayed=Comparing_erm_Table.isDisplayed();
        Assert.assertTrue(Comparing_erm_Table_Is_Displayed);
    }
    public void the_user_should_see_Text_Test(String Expected_Text) {
        String Actual_Text=compare_Choices.getText().trim();
        boolean compare_Choices=Actual_Text.contains(Actual_Text);
        Assert.assertTrue(compare_Choices);
    }
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
    public void the_user_should_see_the_Term_Life_and_Permanent_Life_like_shown_in_the_below_table_Test(DataTable dataTable) {
//        Table_Elements
        List<String>dataTableList=dataTable.asList(String.class);
        List<String>Actual_valuesArrList= new ArrayList<>();
        String [] Actual_valuesArr  = new String[Table_Elements.size()];
        String [] Expected_valuesArr= new String[dataTableList.size()];
       for(int i=0;i<Table_Elements.size();i++) {
           Actual_valuesArrList.add(Table_Elements.get(i).getText());
           Actual_valuesArr[i]=Table_Elements.get(i).getText();
           Expected_valuesArr[i]=dataTableList.get(i);
//         Assert.assertEquals(Expected_valuesArr[i],Actual_valuesArr[i]);
       }
       Assert.assertArrayEquals(Actual_valuesArrList.toArray(),dataTableList.toArray());

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

    public void the_user_should_see_the_when_landing_in_the_new_page_Test(String string) {
        String Expected_Text_XP="//h1[contains(text(),'"+string.replaceAll("[']","")+"')]";
        String Expected_Text=driver.findElement(By.xpath(Expected_Text_XP)).getText();
        driver.navigate().back();
    }
}
