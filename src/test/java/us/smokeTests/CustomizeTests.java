package us.smokeTests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import us.elements.PageElementsCustomize;
import us.logic.CustomizePageLogic;
import utils.DriverInstances;
import utils.Retry;
import utils.Settings;
import utils.WebDriverWaitHelper;

public class CustomizeTests extends BaseTests{

    private CustomizePageLogic logic;

    @BeforeClass
    private void beforeClass(){
        driver = DriverInstances.getInstance(Settings.DRIVER);
        WebDriverWait wait = WebDriverWaitHelper.generateWaits(driver, 5, 30, 3);
        PageElementsCustomize elements = new PageElementsCustomize(driver);
        logic = new CustomizePageLogic(driver, wait, elements);
        logic.getRootPage();
    }

    @AfterClass
    private void tearDown() {
        driver.quit();
    }


    @Test(retryAnalyzer = Retry.class)
    private void test_01_checkCustomizePage() {
//        logic.checkLoginPage();
    }
}
