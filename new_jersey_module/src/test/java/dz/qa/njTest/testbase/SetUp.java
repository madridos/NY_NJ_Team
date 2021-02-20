package dz.qa.njTest.testbase;
import common.WebAPI;
import dz.qa.njPages.HomePage;
import dz.qa.njPages.LoginPage;
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
    public static void Init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }
    @Before
    public void setUp_Init() throws IOException {
        Config config = new Config();
        config.loadProperties();
        Init();
    }
    @After(order = 2)
    public void tearDown() throws IOException {
        SetUp.driver.quit();
    }
    //ScreenShot method
    @After(order = 1)
    public void screenShot(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            try {
                Object Timestamp = new SimpleDateFormat(" yy-MM-dd HH-mm-ss").format(new Date());
                TakesScreenshot shot = (TakesScreenshot) driver;
                File file = shot.getScreenshotAs(OutputType.FILE);
                File screensho_Destination = new File("./target/Screenshot/Screenshot" + scenario.getName() + Timestamp + ".png");
                FileUtils.copyFile(file, screensho_Destination);
            } catch (WebDriverException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                scenario.getName();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

