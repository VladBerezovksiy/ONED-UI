package us.smokeTests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import us.elements.PageElementsConfigurator;
import us.logic.ConfiguratorPageLogic;
import utils.DriverInstances;
import utils.Retry;
import utils.Settings;
import utils.WebDriverWaitHelper;

public class ConfiguratorTests extends BaseTests {

    private ConfiguratorPageLogic logic;

    @BeforeClass
    private void beforeClass() {
        driver = DriverInstances.getInstance(Settings.DRIVER);
        WebDriverWait wait = WebDriverWaitHelper.generateWaits(driver, 5, 30, 3);
        PageElementsConfigurator elements = new PageElementsConfigurator(driver);
        logic = new ConfiguratorPageLogic(driver, wait, elements);
        logic.getRootPage();
    }

    @AfterClass
    private void tearDown() {
//        logic.clearCart();
        driver.quit();
    }


    @Test(retryAnalyzer = Retry.class)
    private void test_01_checkConfiguratorPage() {
        logic.verifyConfiguratorPage();
    }

    @Test(dependsOnMethods = {"test_01_checkConfiguratorPage"}, retryAnalyzer = Retry.class)
    private void test_02_checkProductWithoutMaterialFunctionality() {
        logic.checkEmptyGeneral();
    }

    @Test(dependsOnMethods = {"test_01_checkConfiguratorPage"}, retryAnalyzer = Retry.class)
    private void test_03_checkAddArtworkFunctionality() {
        logic.checkArtworkGeneral();
    }

    @Test(dependsOnMethods = {"test_01_checkConfiguratorPage"}, retryAnalyzer = Retry.class)
    private void test_04_checkAddClipartFunctionality() {
        logic.checkClipartGeneral();
    }

    @Test(dependsOnMethods = {"test_01_checkConfiguratorPage"}, retryAnalyzer = Retry.class)
    private void test_05_checkAddTextFunctionality() {
        logic.checkTextGeneral();
    }

}
