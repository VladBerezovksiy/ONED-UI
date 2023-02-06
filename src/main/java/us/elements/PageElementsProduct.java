package us.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import us.BaseElements;

import java.util.List;

public class PageElementsProduct extends BaseElements {

    public PageElementsProduct(WebDriver driver) {
        super(driver);
    }


    /****************************************ELEMENTS IN PRODUCT CARD***************************************/

    public By designButtonLocator = By.cssSelector(".js-add-to-designer");

    @FindBy(css = ".js-add-to-designer")
    public WebElement designButton;

    public By customizeButtonLocator = By.cssSelector(".js-add-to-customizer");

    @FindBy(css = ".js-add-to-customizer")
    public WebElement customizeButton;

    @FindBy(xpath = "//h1")
    public WebElement productTitle;


    /***************************************PROMOTIONAL PRODUCTS MENU***************************************/

    @FindBy(xpath = "//ul[@id='menu']//li[@class='ui-menu-item']/a[contains(.,'Apparel')]")
    public WebElement apparelOptionInPromotionalSection;

    @FindBy(xpath = "//ul[@id='menu']//li[@class='ui-menu-item']/a[contains(.,'Bags')]")
    public WebElement bagsOptionInPromotionalSection;


    /***************************************APPAREL MENU***************************************/

    @FindBy(xpath = "//div[@class='leftNavScrollContainer']//a[contains(.,'T-Shirts')]")
    public WebElement tShirtOptionInApparelSection;


    /***************************************BAGS MENU***************************************/

    @FindBy(xpath = "//div[@class='leftNavScrollContainer']//a[contains(.,'Tote Bags')]")
    public WebElement toteOptionInBagsSection;


    /****************************************PRODUCT LIST***************************************/

    @FindBy(xpath = "//section//h2/a")
    public List<WebElement> productCart;


}
