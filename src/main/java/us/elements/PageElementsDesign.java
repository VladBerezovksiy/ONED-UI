package us.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import us.BaseElements;

import java.util.List;

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

    @FindBy(xpath = "//section//h2/a")
    public List<WebElement> productCartInTshirtSection;


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

    @FindBy(id = "quantity")
    public WebElement qtyInDesignPage;

    @FindBy(xpath = "//strong[text()='Sizes']/ancestor::li//div[2]//input[2]")
    public WebElement sizeInputField;

    @FindBy(xpath = "//strong[text()='Imprint Color']/ancestor::li/textarea")
    public WebElement imprintColorInputField;

    @FindBy(xpath = "//button[@title='Trash']")
    public WebElement removeButtonInPanel;


}
