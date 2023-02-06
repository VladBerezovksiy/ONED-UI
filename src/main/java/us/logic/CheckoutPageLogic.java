package us.logic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import us.elements.PageElementsProduct;

public class CheckoutPageLogic extends ProductPageLogic {

    private PageElementsProduct elements;

    public CheckoutPageLogic(WebDriver driver, WebDriverWait wait, PageElementsProduct elements) {
        super(driver, wait, elements);
        this.elements = elements;
    }



}
