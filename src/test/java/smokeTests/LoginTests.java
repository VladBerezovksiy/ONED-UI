package smokeTests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.DriverInstances;
import utils.Retry;
import utils.Settings;
import utils.WebDriverWaitHelper;

public class LoginTests extends BaseTests {

    @BeforeClass
    private void beforeClass(){
        driver = DriverInstances.getInstance(Settings.DRIVER);
        WebDriverWait wait = WebDriverWaitHelper.generateWaits(driver, 5, 30, 3);



    }

    @AfterClass
    private void tearDown() {
        driver.quit();
    }

    @Test(retryAnalyzer = Retry.class)
    private void test_01_checkLoginPage() {

    }

}
