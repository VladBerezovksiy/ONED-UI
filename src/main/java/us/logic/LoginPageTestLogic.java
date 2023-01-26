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

    // TODO: завтра начать писать локаторы на Логин страницу!
    public void incorrectCredentialsLogin(){
//        waitForVisible(elements.loginPane);
//        waitForVisible(elements.emailInput).sendKeys(Variables.NONEXISTENT_EMAIL);
//        waitForVisible(elements.passwordInput).sendKeys(Variables.INCORRECT_PASSWORD);
//        clickWhenReady(elements.loginButton);
    }
}
