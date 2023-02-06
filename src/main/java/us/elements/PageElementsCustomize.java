package us.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PageElementsCustomize extends PageElementsProduct {

    public PageElementsCustomize(WebDriver driver) {
        super(driver);
    }



    @FindBy(xpath = "//*[@id=\"summary\"]/div[@class='panel panel-default']//button[@onclick]")
    public WebElement addToCartButton;


    /*********************************ITEM COLOR SECTION*******************************************/

    @FindBy(xpath = "//*[text()='Item Color']/parent::div//div[@class='rectangle-content']")
    public WebElement itemColor;


    /*********************************ARTWORK AND TEXT SECTION*******************************************/

    @FindBy(xpath = "//button[contains(.,'Add Artwork')]")
    public WebElement addArtWorkButton;

    @FindBy(id = "formUpload")
    public WebElement uploadImageInAddArtworkSection;

    @FindBy(id = "btn-upload-art")
    public WebElement uploadFileButton;

    @FindBy(xpath = "//button[contains(.,'Done')]")
    public WebElement confirmUploadFile;

    @FindBy(xpath = "//button[contains(.,'Add Clipart')]")
    public WebElement addClipartButton;

    public By breadcrumbPathLocator = By.xpath("//*[@id=\"clipart_container\"]/ol[@class='breadcrumb']/li[2]");

    @FindBy(xpath = "//*[@id=\"clipart_container\"]/div[2]/div[2]/a")
    public WebElement officeSectionLink;

    @FindBy(xpath = "//*[@id=\"clipart_container\"]//img")
    public WebElement officeLogo;

    @FindBy(xpath = "//a[contains(.,'Add Text')]")
    public WebElement addTextButton;

    @FindBy(css = ".note-editable")
    public WebElement textInputField;

    @FindBy(xpath = "//div[@id='images_attached']//button[@title='Remove']")
    public List<WebElement> removeButtonInPanel;


    /*********************************IMPRINT COLOR SECTION*******************************************/

    @FindBy(xpath = "//*[text()='Imprint Color']/parent::div//div[@class='rectangle-content']")
    public WebElement imprintColor;


}
