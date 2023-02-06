package us.logic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import us.MainLogic;
import us.elements.PageElementsProduct;

public class ProductPageLogic extends MainLogic {

    private PageElementsProduct elements;

    public ProductPageLogic(WebDriver driver, WebDriverWait wait, PageElementsProduct elements) {
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


    public void openProductPageForDesignSection() {
        clickWhenReady(elements.promotionalProductsNavBar);
        waitForJSToBeLoaded();
        waitForVisible(elements.apparelOptionInPromotionalSection);
        clickWhenReady(elements.apparelOptionInPromotionalSection);
        waitForJSToBeLoaded();
        waitForVisible(elements.tShirtOptionInApparelSection);
        clickWhenReady(elements.tShirtOptionInApparelSection);
        waitForJSToBeLoaded();

        for (int i = 0; i < elements.productCart.size(); i++) {
            waitForVisible(elements.productCart.get(i));
            clickWhenReady(elements.productCart.get(i));
            makePause(1500);
            waitForJSToBeLoaded();
            if (!isElementPresent(elements.designButtonLocator)) {
                driver.navigate().back();
            }
        }
        waitForJSToBeLoaded();
    }

    public void openProductPageForCustomizeSection() {
        clickWhenReady(elements.promotionalProductsNavBar);
        waitForJSToBeLoaded();
        waitForVisible(elements.bagsOptionInPromotionalSection);
        clickWhenReady(elements.bagsOptionInPromotionalSection);
        waitForJSToBeLoaded();
        waitForVisible(elements.toteOptionInBagsSection);
        clickWhenReady(elements.toteOptionInBagsSection);
        waitForJSToBeLoaded();

        for (int i = 0; i < elements.productCart.size(); i++) {
            waitForVisible(elements.productCart.get(i));
            clickWhenReady(elements.productCart.get(i));
            makePause(1500);
            waitForJSToBeLoaded();
            if (!isElementPresent(elements.customizeButtonLocator)) {
                driver.navigate().back();
            }
        }
        waitForJSToBeLoaded();
    }
}
