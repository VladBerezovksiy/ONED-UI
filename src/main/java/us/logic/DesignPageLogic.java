package us.logic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import us.MainLogic;
import us.elements.PageElementsDesign;
import utils.Variables;

public class DesignPageLogic extends MainLogic {

    private PageElementsDesign elements;

    public DesignPageLogic(WebDriver driver, WebDriverWait wait, PageElementsDesign elements) {
        super(driver, wait, elements);
        this.elements = elements;
    }

    @Override
    public void getRootPage() {
        browseLoginPage();
    }

    @Override
    public void backToRootPage() {
        browseLoginPage();
    }


    private void openProductPage() {
        clickWhenReady(elements.promotionalProductsNavBar);
        waitForJSToBeLoaded();
        waitForVisible(elements.apparelOptionInPromotionalSection);
        clickWhenReady(elements.apparelOptionInPromotionalSection);
        waitForJSToBeLoaded();
        waitForVisible(elements.tShirtOptionInApparelSection);
        clickWhenReady(elements.tShirtOptionInApparelSection);
        waitForJSToBeLoaded();

        // TODO: написать алгоритм, который будет нажимать на продукт карты до тех пор пока не найдет кнопку Design
        waitForVisible(elements.productInTshirtSection);
        clickWhenReady(elements.productInTshirtSection);
        waitForJSToBeLoaded();
    }

    private void openDesignSectionGeneral() {
        waitForVisible(elements.designButton);
        clickWhenReady(elements.designButton);
        waitForJSToBeLoaded();
    }

    public void checkArtworkGeneral() {
        clickWithSikuli(Variables.ADD_ARTWORK_BUTTON);
        waitForJSToBeLoaded();
        clickWhenReady(elements.uploadImageInAddArtworkSection);
        makePause(1000);
        uploadFile(Variables.PROJECT_UPLOAD_TEST_PATH + Variables.IMAGE_PATH);
        makePause(5000);
        waitForJSToBeLoaded();

        // TODO: дописать код на то что картинка действительно добавилась
    }

    private void checkClipartGeneral() {
        clickWithSikuli(Variables.ADD_CLIPART_BUTTON);
        waitForJSToBeLoaded();

        // TODO: завтра доделать
    }

    private void checkTextGeneral() {
        clickWithSikuli(Variables.ADD_TEXT_BUTTON);
        waitForJSToBeLoaded();

        // TODO: завтра доделать
    }

    public void verifyDesignPage() {
        login(Variables.MAIN_ACCOUNT, Variables.MAIN_PASSWORD);
        openProductPage();
        openDesignSectionGeneral();
    }

}
