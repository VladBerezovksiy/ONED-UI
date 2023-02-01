package us.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import us.BaseElements;

public class PageElementsDesign extends BaseElements {

    public PageElementsDesign(WebDriver driver) {
        super(driver);
    }

    /***************************************PROMOTIONAL PRODUCTS MENU***************************************/

    @FindBy(xpath = "//ul[@id='menu']//li[@class='ui-menu-item']/a[contains(.,'Apparel')]")
    public WebElement apparelOptionInPromotionalSection;


    /***************************************APPAREL MENU***************************************/

    @FindBy(xpath = "//div[@class='leftNavScrollContainer']//a[contains(.,'T-Shirts')]")
    public WebElement tShirtOptionInApparelSection;


    /****************************************T-SHIRT PRODUCT LIST***************************************/

    @FindBy(xpath = "//a[contains(.,\"Next Level Men's CVC Crew Neck Tee\")]/ancestor::section//a")
    public WebElement productInTshirtSection;


    /****************************************ELEMENTS IN PRODUCT CARD***************************************/

    @FindBy(css = ".js-add-to-designer")
    public WebElement designButton;


    /****************************************ELEMENTS IN ARTWORK SECTION***************************************/

    @FindBy(id = "formUpload")
    public WebElement uploadImageInAddArtworkSection;



    /****************************************ELEMENTS IN CLIPART SECTION***************************************/

    public By breadcrumbPathLocator = By.xpath("//*[@id=\"clipart_container\"]/ol[@class='breadcrumb']/li[2]");

    @FindBy(xpath = "//*[@id=\"clipart_container\"]/div[2]/div[2]/a")
    public WebElement officeSectionLink;

    @FindBy(xpath = "//*[@id=\"clipart_container\"]//img")
    public WebElement officeLogo;



    /****************************************ELEMENTS IN DESIGN PAGE***************************************/

    @FindBy(xpath = "//div[@id='bootboxBody']/ancestor::div[@class='modal-content']")
    public WebElement modalWindow;

    @FindBy(xpath = "//div[@id='bootboxBody']/ancestor::div[@class='modal-dialog modal-sm']//button[@*='confirm']")
    public WebElement modalConfirmButton;

    @FindBy(xpath = "//*[@id=\"ihd-canvas-wrapper\"]//canvas[2]")
    public WebElement logoInProduct;

    @FindBy(xpath = "//*[@id=\"form-designer\"]//button[@type='submit']")
    public WebElement addToCartButton;


}
