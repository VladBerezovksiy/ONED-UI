package us.logic;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import us.MainLogic;
import us.elements.PageElementsLogin;
import utils.Variables;

import java.util.*;

public class LoginPageTestLogic extends MainLogic {

    private PageElementsLogin elements;

    public LoginPageTestLogic(WebDriver driver, WebDriverWait wait, PageElementsLogin elements) {
        super(driver, wait, elements);
        this.elements = elements;
    }

    /************** MAKE IT TO BE CONSTRUCTOR (problems with waits) ***********************/

    public void setElements(PageElementsLogin elements) {
        this.elements = elements;
    }

    /*************************************************************************************/

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

    public void verificationOnTheMainPage() {
        login(Variables.MAIN_ACCOUNT, Variables.MAIN_PASSWORD);
        logOut();
    }

    public void verificationOnTheMainPageThroughFacebook() {
        getRootPage();
        waitForVisible(elements.signInFacebookButton);
        clickWhenReady(elements.signInFacebookButton);
        makePause(Variables.SHORT_SLEEP);
        switchToNewWindow();
        waitForVisible(elements.allowConditionsButtonFacebook);
        clickWhenReady(elements.allowConditionsButtonFacebook);
        waitForVisible(elements.emailInputFacebook).clear();
        waitForVisible(elements.emailInputFacebook).sendKeys(Variables.FACEBOOK_EMAIL);
        waitForVisible(elements.passwordInputFacebook).clear();
        waitForVisible(elements.passwordInputFacebook).sendKeys(Variables.FACEBOOK_PASSWORD);
        clickWhenReady(elements.logInButtonFacebook);
        makePause(Variables.LONG_SLEEP);
        switchToDefaultWindow();
        makePause(Variables.NORMAL_SLEEP);
        hoverOverElement(elements.userTab);
        waitForVisible(elements.logoutLink);
    }

    public void verificationOnTheMainPageThroughGoogle() {
        getRootPage();
        waitForVisible(elements.signInGoogleButton);
        clickWhenReady(elements.signInGoogleButton);
        makePause(Variables.SHORT_SLEEP);
        switchToNewWindow();
        waitForVisible(elements.emailInputGoogle).clear();
        waitForVisible(elements.emailInputGoogle).sendKeys(Variables.GMAIL_EMAIL);
        waitForVisible(elements.emailInputGoogle).sendKeys(Keys.ENTER);
        waitForJSToBeLoaded();
        waitForVisible(elements.passwordInputGoogle).clear();
        waitForVisible(elements.passwordInputGoogle).sendKeys(Variables.GMAIL_PASSWORD);
        waitForVisible(elements.passwordInputGoogle).sendKeys(Keys.ENTER);
        makePause(Variables.LONG_SLEEP);
        switchToDefaultWindow();
        makePause(Variables.NORMAL_SLEEP);
        hoverOverElement(elements.userTab);
        waitForVisible(elements.logoutLink);
    }

    private void switchToNewWindow() {
        Set<String> set = driver.getWindowHandles();
        String[] array = set.toArray(new String[0]);
        driver.switchTo().window(array[1]);
    }

    private void switchToDefaultWindow() {
        Set<String> set = driver.getWindowHandles();
        String[] array = set.toArray(new String[0]);
        driver.switchTo().window(array[0]);
    }
}
