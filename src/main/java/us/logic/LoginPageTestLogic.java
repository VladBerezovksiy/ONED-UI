package us.logic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import us.MainLogic;
import us.elements.PageElementsLogin;
import utils.Variables;

public class LoginPageTestLogic extends MainLogic {

    private PageElementsLogin elements;

    public LoginPageTestLogic(WebDriver driver, WebDriverWait wait, PageElementsLogin elements) {
        super(driver, wait, elements);
        this.elements = elements;
    }

    // ************** MAKE IT TO BE CONSTRUCTOR (problems with waits) *******//

    public void setElements(PageElementsLogin elements) {
        this.elements = elements;
    }

    /***********************************************************************/

    @Override
    public void getRootPage() {
        browseLoginPage();
    }

    @Override
    public void backToRootPage() {
        browseLoginPage();
    }

    public void incorrectCredentialsLogin() {
        waitForVisible(elements.loginTitle);
        waitForVisible(elements.emailInput).sendKeys(Variables.NONEXISTENT_EMAIL);
        waitForVisible(elements.passwordInput).sendKeys(Variables.INCORRECT_PASSWORD);
        clickWhenReady(elements.loginButton);
    }

    public void checkLoginPage() {
        getRootPage();
        incorrectCredentialsLogin();
        login(Variables.MAIN_ACCOUNT, Variables.MAIN_PASSWORD);
        logOut();
        waitForVisible(elements.forgotPasswordLink);
    }

    // TODO: доделать функционал если капча позволяет
    public void checkForgotPasswordRestorationFunctionality() {
        if (checkForExistence(elements.dForgotPasswordLink)) {
            clickWhenReady(elements.forgotPasswordLink);
            waitForVisible(elements.forgotResetButton);
        }
    }

    public void verificationOnTheMainPage() {
        login(Variables.MAIN_ACCOUNT, Variables.MAIN_PASSWORD);
        logOut();
    }
}
