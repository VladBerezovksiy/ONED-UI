package us.logic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import us.elements.PageElementsDesign;
import utils.Variables;

public class DesignPageLogic extends ProductPageLogic {

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


    private void openDesignSectionGeneral() {
        waitForVisible(elements.designButton);
        clickWhenReady(elements.designButton);
        waitForJSToBeLoaded();
    }

    public void verifyDesignPage() {
        login(Variables.MAIN_ACCOUNT, Variables.MAIN_PASSWORD);
        openProductPageForDesignSection();
        openDesignSectionGeneral();
    }

    public void checkEmptyGeneral() {
        enterValidValuesToFollowCheckout();
    }

    public void checkArtworkGeneral() {
        addArtworkInProduct();
        deleteLogoInProduct();
        addArtworkInProduct();
        enterValidValuesToFollowCheckout();
    }

    public void checkClipartGeneral() {
        addClipartInProduct();
        deleteLogoInProduct();
        addClipartInProduct();
        enterValidValuesToFollowCheckout();
    }

    public void checkTextGeneral() {
        addTextInProduct();
        deleteLogoInProduct();
        addTextInProduct();
        enterValidValuesToFollowCheckout();
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
        waitForVisible(elements.textInputField).clear();
        clickWhenReady(elements.textInputField).sendKeys("QA_TEST");
    }

    private void enterValidValuesToFollowCheckout() {
        String qty = elements.qtyInDesignPage.getAttribute("value").trim();
        waitForVisible(elements.sizeInputField).clear();
        clickWhenReady(elements.sizeInputField).sendKeys(qty);
        waitForVisible(elements.imprintColorInputField).clear();
        clickWhenReady(elements.imprintColorInputField).sendKeys("Black");
        waitForVisible(elements.addToCartButton);
        clickWhenReady(elements.addToCartButton);
        makePause(3000);
        waitForJSToBeLoaded();
        waitForVisible(elements.cartTitle);
    }

    private void deleteLogoInProduct() {
        waitForVisible(elements.removeButtonInPanel);
        clickWhenReady(elements.removeButtonInPanel);
        makePause(1500);
        waitForVisible(elements.modalWindow);
        waitForInvisible(elements.addToCartButton);
        clickWhenReady(elements.modalConfirmButton);
        makePause(1500);
        waitForVisible(elements.addToCartButton);
    }

}
