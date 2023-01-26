package smokeTests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import us.BaseElements;
import us.MainLogic;
import utils.DriverInstances;
import utils.Retry;
import utils.Variables;
import utils.WebDriverWaitHelper;

public class LogoutLoginTests extends BaseTests {
    private MainLogic logic;

    @BeforeClass
    private void beforeClass() {
        driver = DriverInstances.getInstance(Variables.GOOGLE_CHROME);
        WebDriverWait wait = WebDriverWaitHelper.generateWaits(driver, 5, 30, 3);
        BaseElements elements = new BaseElements(driver);
        logic = new MainLogic(driver, wait, elements) {
            @Override
            public void getRootPage() {

            }

            @Override
            public void backToRootPage() {

            }
        };
    }

    @AfterClass
    private void tearDown() {
        driver.quit();
    }

    @Test(retryAnalyzer = Retry.class)
    private void logoutLogin() {
        for (int i = 0; i < 5; i++) {
            logic.login(Variables.MAIN_ACCOUNT, Variables.MAIN_PASSWORD);
            logic.logOut();
        }
    }
}
