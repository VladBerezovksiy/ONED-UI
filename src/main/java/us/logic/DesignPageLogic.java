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

    public void verifyDesignPage() {
        login(Variables.MAIN_ACCOUNT, Variables.MAIN_PASSWORD);
        openProductPage();
        openDesignSectionGeneral();
    }

    public void checkArtworkGeneral() {
        addArtworkInProduct();
        deleteLogoInProduct();
        addArtworkInProduct();
    }

    public void checkClipartGeneral() {
        addClipartInProduct();
        deleteLogoInProduct();
        addClipartInProduct();
    }

    public void checkTextGeneral() {
        addTextInProduct();
        deleteLogoInProduct();
        addTextInProduct();
    }

    private void addArtworkInProduct() {
        clickWithSikuli(Variables.ADD_ARTWORK_BUTTON);
        waitForJSToBeLoaded();
        clickWhenReady(elements.uploadImageInAddArtworkSection);
        makePause(1000);
        uploadFile(Variables.PROJECT_UPLOAD_TEST_PATH + Variables.IMAGE_PATH);
        makePause(5000);
        waitForJSToBeLoaded();
        waitForVisible(elements.logoInProduct);
        clickWhenReady(elements.logoInProduct);
        makePause(1500);
    }

    private void addClipartInProduct() {
        clickWithSikuli(Variables.ADD_CLIPART_BUTTON);
        makePause(1500);
        waitForJSToBeLoaded();
        if (isElementPresent(elements.breadcrumbPathLocator)) {
            waitForVisible(elements.officeLogo);
            clickWhenReady(elements.officeLogo);
        } else {
            waitForVisible(elements.officeSectionLink);
            clickWhenReady(elements.officeSectionLink);
            waitForVisible(elements.officeLogo);
            clickWhenReady(elements.officeLogo);
        }
        makePause(1000);
        waitForJSToBeLoaded();
        waitForVisible(elements.logoInProduct);
        clickWhenReady(elements.logoInProduct);
        makePause(1500);
    }

    private void addTextInProduct() {
        clickWithSikuli(Variables.ADD_TEXT_BUTTON);
        makePause(1000);
        waitForJSToBeLoaded();
    }

    private void deleteLogoInProduct() {
//        waitForVisible(elements.logoInProduct);
//        clickWhenReady(elements.logoInProduct);
//        makePause(1500);
        clickWithSikuli(Variables.DELETE_ICON);
        makePause(1500);
        waitForVisible(elements.modalWindow);
        waitForInvisible(elements.addToCartButton);
        clickWhenReady(elements.modalConfirmButton);
        makePause(1500);
        waitForVisible(elements.addToCartButton);
    }

}
