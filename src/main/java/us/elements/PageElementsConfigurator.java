package us.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageElementsConfigurator extends PageElementsProduct {

    public PageElementsConfigurator(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "myBtn2")
    public WebElement startDesigningButton;

    public By modalNotification = By.cssSelector("#myCarousel .modelCustom");

    @FindBy(id = "delete-confirm")
    public WebElement removeButtonInPanel;


    /*********************************ADD ARTWORK AND CLIPART SECTION*******************************************/

    @FindBy(id = "add_images")
    public WebElement addImageButton;

    @FindBy(id = "left_my_computer")
    public WebElement addArtWorkButton;

    @FindBy(id = "dtFileUploadSelector")
    public WebElement uploadFileButton;

    @FindBy(id = "left_my_clipart")
    public WebElement addClipartButton;

    @FindBy(id = "breadcrumb-link")
    public WebElement breadcrumbPathLocator;

    @FindBy(id = "Office")
    public WebElement officeSectionLink;

    @FindBy(xpath = "//*[@id=\"clipart_container\"]//img")
    public WebElement officeLogo;

    @FindBy(id = "dtUploadDone")
    public WebElement chooseImageButton1;

    @FindBy(id = "choose_image")
    public WebElement chooseImageButton2;

    @FindBy(xpath = "//button[contains(.,'Delete Image') and @id]")
    public WebElement deleteImageLink;



    /*********************************ADD TEXT SECTION*******************************************/

    @FindBy(css = "#dt_text_left_menu_add button")
    public WebElement addTextButton;

    @FindBy(xpath = "//button[contains(.,'Delete Text') and @id]")
    public WebElement deleteTextLink;

}
