package dz.qa.njTest.testbase;
import common.WebAPI;
import dz.qa.njPages.GetPetInsuranceQuotePage;
import dz.qa.njPages.HomePage;
import dz.qa.njPages.LoginPage;
import dz.qa.njPages.PetMedicalPage;
import dz.qa.njPages.MedicareSupplementPage;
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
    public static PetMedicalPage petMedicalPage;
    public static GetPetInsuranceQuotePage getPetInsuranceQuotePage;
    public static MedicareSupplementPage medicareSupplementPage;
    public static void Init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        petMedicalPage = PageFactory.initElements(driver, PetMedicalPage.class);
        getPetInsuranceQuotePage = PageFactory.initElements(driver,GetPetInsuranceQuotePage.class);
        medicareSupplementPage=PageFactory.initElements(driver,MedicareSupplementPage.class);
    }
    @Before
    public void setUp_Init() throws IOException {
        Config config = new Config();
        config.loadProperties();
        Init();
    }
    @After
    public void tearDown(Scenario scenario) throws IOException {
        screenShot( scenario);
        SetUp.driver.quit();
    }
}

