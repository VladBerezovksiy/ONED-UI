package oneDelux.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageElementsDesign extends PageElementsProduct {

    public PageElementsDesign(WebDriver driver) {
        super(driver);
    }



    /****************************************ELEMENTS IN DESIGN PAGE***************************************/

    @FindBy(xpath = "//div[@id='bootboxBody']/ancestor::div[@class='modal-content']")
    public WebElement modalWindow;

    @FindBy(xpath = "//div[@id='bootboxBody']/ancestor::div[@class='modal-dialog modal-sm']//button[@*='confirm']")
    public WebElement modalConfirmButton;

    @FindBy(xpath = "//*[@id=\"ihd-canvas-wrapper\"]//canvas[2]")
    public WebElement logoInProduct;

    @FindBy(xpath = "//div[@class='row visible-lg']//button[contains(@title,'Add an Image')]")
    public WebElement addArtWorkButton;

    @FindBy(xpath = "//div[@class='row visible-lg']//button[contains(@title,'Add Clipart')]")
    public WebElement addClipartButton;

    @FindBy(xpath = "//div[@class='row visible-lg']//button[contains(@title,'Add Text')]")
    public WebElement addTextButton;

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



    /****************************************ELEMENTS IN ARTWORK SECTION***************************************/

    @FindBy(id = "formUpload")
    public WebElement uploadImageInAddArtworkSection;



    /****************************************ELEMENTS IN CLIPART SECTION***************************************/

    public By breadcrumbPathLocator = By.xpath("//*[@id=\"clipart_container\"]/ol[@class='breadcrumb']/li[2]");

    @FindBy(xpath = "//*[@id=\"clipart_container\"]/div[2]/div[2]/a")
    public WebElement officeSectionLink;

    @FindBy(xpath = "//*[@id=\"clipart_container\"]//img")
    public WebElement officeLogo;



    /****************************************ELEMENTS IN TEXT SECTION***************************************/

    @FindBy(id = "ihd-textarea_1")
    public WebElement textInputField;
}
