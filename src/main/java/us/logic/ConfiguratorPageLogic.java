package us.logic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import us.elements.PageElementsConfigurator;
import utils.Variables;

public class ConfiguratorPageLogic extends ProductPageLogic {

    private PageElementsConfigurator elements;

    public ConfiguratorPageLogic(WebDriver driver, WebDriverWait wait, PageElementsConfigurator elements) {
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


    private void openConfiguratorSectionGeneral() {
        waitForVisible(elements.configuratorButton);
        clickWhenReady(elements.configuratorButton);
        makePause(9000);
        waitForJSToBeLoaded();

        if (isElementPresent(elements.modalNotification)) {
            waitForVisible(elements.startDesigningButton);
            clickWhenReady(elements.startDesigningButton);
        }
        waitForJSToBeLoaded();
    }

    public void verifyConfiguratorPage() {
        login(Variables.MAIN_ACCOUNT, Variables.MAIN_PASSWORD);
        openProductPageForConfiguratorSection();
        openConfiguratorSectionGeneral();
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
        waitForVisible(elements.addImageButton);
        clickWhenReady(elements.addImageButton);
        makePause(1500);
        waitForJSToBeLoaded();
        waitForVisible(elements.addArtWorkButton);
        clickWhenReady(elements.addArtWorkButton);
        makePause(1500);
        waitForJSToBeLoaded();
        waitForVisible(elements.uploadFileButton);
        clickWhenReady(elements.uploadFileButton);
        makePause(1000);
        uploadFile(Variables.PROJECT_UPLOAD_TEST_PATH + Variables.IMAGE_PATH);
        makePause(1500);
        waitForJSToBeLoaded();
        waitForVisible(elements.chooseImageButton1);
        clickWhenReady(elements.chooseImageButton1);
        makePause(1000);
        waitForJSToBeLoaded();
    }

    private void addClipartInProduct() {
        waitForVisible(elements.addImageButton);
        clickWhenReady(elements.addImageButton);
        makePause(1500);
        waitForJSToBeLoaded();
        waitForVisible(elements.addClipartButton);
        clickWhenReady(elements.addClipartButton);
        makePause(1500);
        waitForJSToBeLoaded();
        if (elements.breadcrumbPathLocator.getText().isEmpty()) {
            waitForVisible(elements.officeSectionLink);
            clickWhenReady(elements.officeSectionLink);
            makePause(1000);
            waitForVisible(elements.officeLogo);
            clickWhenReady(elements.officeLogo);
        } else {
            waitForVisible(elements.officeLogo);
            clickWhenReady(elements.officeLogo);
        }
        waitForVisible(elements.chooseImageButton2);
        clickWhenReady(elements.chooseImageButton2);
        makePause(1500);
        waitForJSToBeLoaded();
    }

    private void addTextInProduct() {
        waitForVisible(elements.addTextButton);
        clickWhenReady(elements.addTextButton);
        makePause(1000);
        waitForJSToBeLoaded();
    }

    private void enterValidValuesToFollowCheckout() {
        // TODO: завтра доделать
//        waitForVisible(elements.itemColor);
//        clickWhenReady(elements.itemColor);
//        waitForVisible(elements.imprintColor);
//        clickWhenReady(elements.imprintColor);
//        waitForVisible(elements.addToCartButton);
//        clickWhenReady(elements.addToCartButton);
//        makePause(3000);
//        waitForJSToBeLoaded();
//        waitForVisible(elements.cartTitle);
    }

    private void deleteLogoInProduct() {
        if (elements.deleteImageLink.isDisplayed()) {
            waitForVisible(elements.deleteImageLink);
            clickWhenReady(elements.deleteImageLink);
        } else {
            waitForVisible(elements.deleteTextLink);
            clickWhenReady(elements.deleteTextLink);
        }
        makePause(1500);
        waitForVisible(elements.removeButtonInPanel);
        clickWhenReady(elements.removeButtonInPanel);
        makePause(3000);
        waitForJSToBeLoaded();
    }

}
