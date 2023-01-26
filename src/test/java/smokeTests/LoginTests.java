package smokeTests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import us.elements.PageElementsLogin;
import us.logic.LoginPageTestLogic;
import utils.DriverInstances;
import utils.Retry;
import utils.Settings;
import utils.WebDriverWaitHelper;

public class LoginTests extends BaseTests {

    private LoginPageTestLogic logic;

    @BeforeClass
    private void beforeClass(){
        driver = DriverInstances.getInstance(Settings.DRIVER);
        WebDriverWait wait = WebDriverWaitHelper.generateWaits(driver, 5, 30, 3);
        PageElementsLogin elements = new PageElementsLogin(driver);
        logic = new LoginPageTestLogic(driver, wait, elements);
        logic.getRootPage();
    }

    @AfterClass
    private void tearDown() {
        driver.quit();
    }

    @Test(retryAnalyzer = Retry.class)
    private void test_01_checkLoginPage() {
        logic.checkLoginPage();
    }

    @Test(retryAnalyzer = Retry.class)
    private void test_02_checkForgotPasswordRestorationFunctionality() {
        logic.checkForgotPasswordRestorationFunctionality();
    }

    @Test(retryAnalyzer = Retry.class)
    private void test_03_verificationOnTheMainPage() {
        logic.verificationOnTheMainPage();
    }

    // TODO: завтра доделать
    @Test(retryAnalyzer = Retry.class)
    private void test_04_verificationOnTheMainPageThroughGoogle() {
//        logic.verificationOnTheMainPage();
    }

    // TODO: завтра доделать
    @Test(retryAnalyzer = Retry.class)
    private void test_05_verificationOnTheMainPageThroughFacebook() {
//        logic.verificationOnTheMainPage();
    }

}
