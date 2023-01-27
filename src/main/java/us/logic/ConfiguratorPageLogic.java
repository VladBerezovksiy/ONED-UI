package us.logic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import us.MainLogic;
import us.elements.PageElementsConfigurator;

public class ConfiguratorPageLogic extends MainLogic {

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


}
