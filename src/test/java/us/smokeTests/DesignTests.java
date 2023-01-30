package us.smokeTests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import us.elements.PageElementsDesign;
import us.logic.DesignPageLogic;
import utils.DriverInstances;
import utils.Retry;
import utils.Settings;
import utils.WebDriverWaitHelper;

public class DesignTests extends BaseTests {

    private DesignPageLogic logic;

    @BeforeClass
    private void beforeClass(){
        driver = DriverInstances.getInstance(Settings.DRIVER);
        WebDriverWait wait = WebDriverWaitHelper.generateWaits(driver, 5, 30, 3);
        PageElementsDesign elements = new PageElementsDesign(driver);
        logic = new DesignPageLogic(driver, wait, elements);
        logic.getRootPage();
    }

    @AfterClass
    private void tearDown() {
        driver.quit();
    }


    @Test/*(retryAnalyzer = Retry.class)*/
    private void test_01_checkDesignPage() {
        logic.verifyDesignPage();
    }
}
