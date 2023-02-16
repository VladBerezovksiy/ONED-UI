package oneDelux.smokeTests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import oneDelux.elements.PageElementsCheckout;
import oneDelux.logic.CheckoutPageLogic;
import utils.DriverInstances;
import utils.Retry;
import utils.Settings;
import utils.WebDriverWaitHelper;

public class CheckoutTests extends BaseTests {

    private CheckoutPageLogic logic;

    @BeforeClass
    private void beforeClass() {
        driver = DriverInstances.getInstance(Settings.DRIVER);
        WebDriverWait wait = WebDriverWaitHelper.generateWaits(driver, 5, 30, 3);
        PageElementsCheckout elements = new PageElementsCheckout(driver);
        logic = new CheckoutPageLogic(driver, wait, elements);
        logic.getRootPage();
    }

    @AfterClass
    private void tearDown() {
//        logic.clearCart();
        driver.quit();
    }

    /**
     * To run tests, you need to add the product to the cart!
     **/
    @Test(retryAnalyzer = Retry.class)
    private void test_01_checkCheckoutPage() {
        logic.verifyCheckoutPage();
    }

    @Test(dependsOnMethods = {"test_01_checkCheckoutPage"}, retryAnalyzer = Retry.class)
    private void test_02_checkCheckoutProductWithCreditCard() {
        logic.verifyCheckoutProductWithCreditCard();
    }

    /**
    *   Unfinished tests: test_03_checkCheckoutProductWithPayPal, test_04_checkCheckoutProductWithGooglePay
    **/
    @Test(dependsOnMethods = {"test_01_checkCheckoutPage"}, retryAnalyzer = Retry.class)
    private void test_03_checkCheckoutProductWithPayPal() {
        logic.verifyCheckoutProductWithPayPal();
    }

    @Test(dependsOnMethods = {"test_01_checkCheckoutPage"}, retryAnalyzer = Retry.class)
    private void test_04_checkCheckoutProductWithGooglePay() {
        logic.verifyCheckoutProductWithGooglePay();
    }

}
