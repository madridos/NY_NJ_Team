package dz.qa.njTest.testbase;
import common.WebAPI;
import dz.qa.njPages.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

public class SetUp extends WebAPI {
    public static HomePage homePage;
    public static LoginPage loginPage;
    public static ClaimPage claimPage;
    public static Non_Costumers_ClaimPage non_Costumers_ClaimPage;
    public static File_A_Claim_For_Costumers file_a_claim_for_costumers;
    public static GetAQuotePage getAQuotePage;
    public static HealthPage healthPage;
    public static RentersQuotePage rentersQuotePage;
    public static Term_LifePage term_LifePage;
    public static GetPetInsuranceQuotePage getPetInsuranceQuotePage;
    public static PetMedicalPage petMedicalPage;
    public static void Init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        healthPage = PageFactory.initElements(driver, HealthPage.class);
        claimPage=PageFactory.initElements(driver,ClaimPage.class);
        non_Costumers_ClaimPage=PageFactory.initElements(driver,Non_Costumers_ClaimPage.class);
        file_a_claim_for_costumers=PageFactory.initElements(driver,File_A_Claim_For_Costumers.class);
        getAQuotePage=PageFactory.initElements(driver,GetAQuotePage.class);
        rentersQuotePage = PageFactory.initElements(driver,RentersQuotePage.class);
        term_LifePage = PageFactory.initElements(driver,Term_LifePage.class);
        getPetInsuranceQuotePage=PageFactory.initElements(driver,GetPetInsuranceQuotePage.class);
        petMedicalPage=PageFactory.initElements(driver,PetMedicalPage.class);
    }
    @Before
    public void setUp_Init() throws IOException {
        Config config = new Config();
        config.loadProperties();
        Init();
    }
    //ScreenShot method
    @After
    public void tearDown(Scenario scenario) throws IOException {
        screenShot(scenario);
        SetUp.driver.quit();
    }
}

