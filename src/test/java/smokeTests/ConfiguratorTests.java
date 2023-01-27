package smokeTests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import us.elements.PageElementsConfigurator;
import us.elements.PageElementsLogin;
import us.logic.ConfiguratorPageLogic;
import utils.DriverInstances;
import utils.Retry;
import utils.Settings;
import utils.WebDriverWaitHelper;

public class ConfiguratorTests extends BaseTests {

    private ConfiguratorPageLogic logic;

    @BeforeClass
    private void beforeClass(){
        driver = DriverInstances.getInstance(Settings.DRIVER);
        WebDriverWait wait = WebDriverWaitHelper.generateWaits(driver, 5, 30, 3);
        PageElementsConfigurator elements = new PageElementsConfigurator(driver);
        logic = new ConfiguratorPageLogic(driver, wait, elements);
        logic.getRootPage();
    }

    @AfterClass
    private void tearDown() {
        driver.quit();
    }


    @Test(retryAnalyzer = Retry.class)
    private void test_01_checkConfiguratorPage() {
//        logic.checkLoginPage();
    }
}
