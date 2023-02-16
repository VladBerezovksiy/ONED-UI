package oneDelux.logic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import oneDelux.elements.PageElementsConfigurator;
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

        if (!elements.addImageButton.isDisplayed()) {
            driver.navigate().refresh();
            makePause(9000);
        }

        if (isElementPresent(elements.modalNotification)) {
            waitForVisible(elements.closeQuickStartNotificationButton);
            clickWhenReady(elements.closeQuickStartNotificationButton);
        }

        makePause(1000);
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
        addArtworkInProduct();
        deleteLogoInProduct();
        enterValidValuesToFollowCheckout();
    }

    public void checkClipartGeneral() {
        addClipartInProduct();
        addClipartInProduct();
        deleteLogoInProduct();
        enterValidValuesToFollowCheckout();
    }

    public void checkTextGeneral() {
        addTextInProduct();
        deleteLogoInProduct();
        addTextInProduct();
        enterValidValuesToFollowCheckout();
    }

    private void addArtworkInProduct() {
        clickWhenReady(elements.designTitle);
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
        clickWhenReady(elements.designTitle);
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
        if (elements.continueButton1.isDisplayed()) {
            clickWhenReady(elements.continueButton1);
        } else if (elements.continueButton2.isDisplayed()) {
            clickWhenReady(elements.continueButton2);
        }
        Assert.assertEquals("rgba(49, 116, 216, 1)", elements.designTitle.getCssValue("border-bottom-color"),
                "The Design title section is not open!");
        waitForVisible(elements.printingAreaSection);
        clickWhenReady(elements.printingAreaRadioButtons.get(0));
        if (elements.templateColorSection.isDisplayed()) {
            clickWhenReady(elements.templateColorItems.get(0));
        }
        waitForVisible(elements.nextSectionButton);
        clickWhenReady(elements.nextSectionButton);
        waitForJSToBeLoaded();

        Assert.assertEquals("rgba(49, 116, 216, 1)", elements.optinsTitle.getCssValue("border-bottom-color"),
                "The Options title section is not open!");
        waitForVisible(elements.paperSection);
        clickWhenReady(elements.paperRadioButtons.get(0));
        waitForVisible(elements.nextSectionButton);
        clickWhenReady(elements.nextSectionButton);
        waitForJSToBeLoaded();

        Assert.assertEquals("rgba(49, 116, 216, 1)", elements.reviewTitle.getCssValue("border-bottom-color"),
                "The Review title section is not open!");
        waitForVisible(elements.qtyButton);
        selectDropdownOption(elements.qtyButton, elements.qtyButtonDropDown,
                elements.qtyButtonOptions, 1);
        waitForVisible(elements.productionTimeSection);
        clickWhenReady(elements.productionTimeRadioButtons.get(0));
        waitForVisible(elements.reviewCheckbox).click();
        waitForVisible(elements.addToCardButton);
        clickWhenReady(elements.addToCardButton);
        makePause(9000);
        waitForJSToBeLoaded();
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
