package us.smokeTests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import us.elements.PageElementsDesign;
import us.logic.DesignPageLogic;
import utils.*;

public class DesignTests extends BaseTests {

    private DesignPageLogic logic;

    @BeforeClass
    private void beforeClass() {
        driver = DriverInstances.getInstance(Settings.DRIVER);
        WebDriverWait wait = WebDriverWaitHelper.generateWaits(driver, 5, 30, 3);
        PageElementsDesign elements = new PageElementsDesign(driver);
        logic = new DesignPageLogic(driver, wait, elements);
        logic.getRootPage();
    }

    @AfterClass
    private void tearDown() {
        // TODO подумать по поводу перемещения метода чистки корзины
//        logic.clearCart();
        driver.quit();
    }


    @Test(retryAnalyzer = Retry.class)
    private void test_01_checkDesignPage() {
        logic.verifyDesignPage();
    }

    @Test(dependsOnMethods = {"test_01_checkDesignPage"}, retryAnalyzer = Retry.class)
    private void test_02_checkAddArtworkFunctionality() {
        logic.checkArtworkGeneral();
    }

    @Test(dependsOnMethods = {"test_01_checkDesignPage"}, retryAnalyzer = Retry.class)
    private void test_03_checkAddClipartFunctionality() {
        logic.checkClipartGeneral();
    }

    @Test(dependsOnMethods = {"test_01_checkDesignPage"}, retryAnalyzer = Retry.class)
    private void test_04_checkAddTextFunctionality() {
        logic.checkTextGeneral();
    }




    @Test(dependsOnMethods = {"test_01_checkDesignPage"}, retryAnalyzer = Retry.class)
    private void test_05_checkoutProductWithArtwork() {
//        logic.checkTextGeneral();
    }

    @Test(dependsOnMethods = {"test_01_checkDesignPage"}, retryAnalyzer = Retry.class)
    private void test_06_checkoutProductWithClipart() {
//        logic.checkTextGeneral();
    }

    @Test(dependsOnMethods = {"test_01_checkDesignPage"}, retryAnalyzer = Retry.class)
    private void test_07_checkoutProductWithText() {
//        logic.checkTextGeneral();
    }
}
