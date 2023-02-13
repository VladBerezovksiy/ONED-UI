package us.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PageElementsConfigurator extends PageElementsProduct {

    public PageElementsConfigurator(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "addImageModalClose")
    public WebElement closeModalWindowButton;

    @FindBy(css = "#dtFileUploadPreview a")
    public WebElement defaultDeleteImageLink;

    public By defaultDeleteImageLinkLocator = By.cssSelector("#dtFileUploadPreview a");


    /*********************************DESIGN SECTION*******************************************/

    @FindBy(xpath = "//a[@id='card_panel']/parent::li")
    public WebElement designTitle;

    @FindBy(id = "imprint-container")
    public WebElement printingAreaSection;

    @FindBy(css = "#imprint-container .imprint-radio-wrap")
    public List<WebElement> printingAreaRadioButtons;

    @FindBy(id = "option_78")
    public WebElement templateColorSection;

    @FindBy(css = ".templateColorIH div")
    public List<WebElement> templateColorItems;

    @FindBy(id = "quickModelClose")
    public WebElement closeQuickStartNotificationButton;

    public By modalNotification = By.cssSelector("#myCarousel .modelCustom");

    @FindBy(id = "delete-confirm")
    public WebElement removeButtonInPanel;

    @FindBy(xpath = "//div[contains(@class,'button_nxt_step') and not(contains(@style, 'none'))]")
    public WebElement nextSectionButton;


    /*********************************OPTIONS SECTION*******************************************/

    @FindBy(xpath = "//a[@id='options_panel']/parent::li")
    public WebElement optinsTitle;

    @FindBy(id = "option_207")
    public WebElement paperSection;

    @FindBy(css = "#option_207 .imprint-radio-wrap input")
    public List<WebElement> paperRadioButtons;


    /*********************************REVIEW SECTION*******************************************/

    @FindBy(xpath = "//a[@id='review_panel']/parent::li")
    public WebElement reviewTitle;

    @FindBy(css = "#quantity-list button")
    public WebElement qtyButton;

    @FindBy(css = "#quantity-list ul")
    public WebElement qtyButtonDropDown;

    @FindBy(css = "#quantity-list ul li")
    public List<WebElement> qtyButtonOptions;

    @FindBy(id = "option_130")
    public WebElement productionTimeSection;

    @FindBy(css = "#option_130 input")
    public List<WebElement> productionTimeRadioButtons;

    @FindBy(css = ".checkbox .checkmark")
    public WebElement reviewCheckbox;

    @FindBy(id = "ft_addtocart")
    public WebElement addToCardButton;


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

    @FindBy(css = "#super-wrapper1 button.close_text_editor")
    public WebElement continueButton1;

    @FindBy(css = ".holidaycardclass button.close_text_editor")
    public WebElement continueButton2;


    /*********************************ADD TEXT SECTION*******************************************/

    @FindBy(css = "#dt_text_left_menu_add button")
    public WebElement addTextButton;

    @FindBy(xpath = "//button[contains(.,'Delete Text') and @id]")
    public WebElement deleteTextLink;

}
