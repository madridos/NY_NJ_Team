package dz.qa.njTest.testbase;
import common.WebAPI;
import dz.qa.njPages.GetAQuotePage;
import dz.qa.njPages.HomePage;
import dz.qa.njPages.LoginPage;
import dz.qa.njPages.Term_LifePage;
import dz.qa.njPages.RentersQuotePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class SetUp extends WebAPI {
    public static HomePage homePage;
    public static LoginPage loginPage;
    public static Term_LifePage term_LifePage;
    public static GetAQuotePage getAQuotePage;
    public static RentersQuotePage rentersQuotePage;
    public static void Init() {
        term_LifePage = PageFactory.initElements(driver, Term_LifePage.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        getAQuotePage = PageFactory.initElements(driver,GetAQuotePage.class);
        rentersQuotePage = PageFactory.initElements(driver,RentersQuotePage.class);
    }
    @Before
    public void setUp_Init() throws IOException {
        Config config = new Config();
        config.loadProperties();
        Init();
    }
    @After
    public void tearDown(Scenario scenario) throws IOException {
        screenShot(scenario);
        SetUp.driver.quit();
    }
}

