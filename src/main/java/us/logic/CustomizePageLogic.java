package us.logic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import us.elements.PageElementsCustomize;
import utils.Variables;

public class CustomizePageLogic extends ProductPageLogic {

    private PageElementsCustomize elements;

    public CustomizePageLogic(WebDriver driver, WebDriverWait wait, PageElementsCustomize elements) {
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


    private void openCustomizeSectionGeneral() {
        waitForVisible(elements.customizeButton);
        clickWhenReady(elements.customizeButton);
        waitForJSToBeLoaded();
    }

    public void verifyCustomizePage() {
        login(Variables.MAIN_ACCOUNT, Variables.MAIN_PASSWORD);
        openProductPageForCustomizeSection();
        openCustomizeSectionGeneral();
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
        waitForVisible(elements.addArtWorkButton);
        clickWhenReady(elements.addArtWorkButton);
        makePause(1500);
        waitForJSToBeLoaded();
        clickWhenReady(elements.uploadImageInAddArtworkSection);
        makePause(1000);
        uploadFile(Variables.PROJECT_UPLOAD_TEST_PATH + Variables.IMAGE_PATH);
        makePause(1500);
        waitForJSToBeLoaded();
        waitForVisible(elements.uploadFileButton);
        clickWhenReady(elements.uploadFileButton);
        makePause(5000);
        waitForVisible(elements.confirmUploadFile);
        clickWhenReady(elements.confirmUploadFile);
        makePause(1000);
        waitForJSToBeLoaded();
    }

    private void addClipartInProduct() {
        waitForVisible(elements.addClipartButton);
        clickWhenReady(elements.addClipartButton);
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
        makePause(3000);
        waitForJSToBeLoaded();
    }

    private void addTextInProduct() {
        waitForVisible(elements.addTextButton);
        clickWhenReady(elements.addTextButton);
        makePause(1000);
        waitForJSToBeLoaded();
        waitForVisible(elements.textInputField).clear();
        clickWhenReady(elements.textInputField).sendKeys("QA_TEST");
    }

    private void enterValidValuesToFollowCheckout() {
        waitForVisible(elements.itemColor);
        clickWhenReady(elements.itemColor);
        waitForVisible(elements.imprintColor);
        clickWhenReady(elements.imprintColor);
        waitForVisible(elements.addToCartButton);
        clickWhenReady(elements.addToCartButton);
        makePause(3000);
        waitForJSToBeLoaded();
        waitForVisible(elements.cartTitle);
    }

    private void deleteLogoInProduct() {
        if (elements.removeButtonInPanel.size() > 0) {
            for (int i = 0; i < elements.removeButtonInPanel.size(); i++) {
                waitForVisible(elements.removeButtonInPanel.get(i));
                clickWhenReady(elements.removeButtonInPanel.get(i));
                makePause(1500);
            }
        }
        if (!elements.textInputField.getText().isEmpty()) {
            waitForVisible(elements.textInputField).clear();
        }
        makePause(2000);
    }
}
