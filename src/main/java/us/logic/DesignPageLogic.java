package us.logic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import us.MainLogic;
import us.elements.PageElementsDesign;

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
        getRootPage();
        hoverOverElement(elements.promotionalProductsNavBar);
        //TODO: завтра доделать
    }

    private void openDesignSectionGeneration() {
        openProductPage();
        // TODO: завтра доделать
    }
}
