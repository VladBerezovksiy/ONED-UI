package us;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BaseElements {

    /**
     * The elements declared in scope of the class are used project wide.
     * Examples: elements of the main menu, user dropdown etc., i.e: elements that don't depend on a page.
     * Please follow declaring such kind of elements in here gathering into logical bunches with comments.
     */

    public BaseElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    /********************************************LOGIN PAGE*********************************************/

    public By loginTitleLocator = By.cssSelector(".pageName");

    @FindBy(css = ".pageName")
    public WebElement loginTitle;

    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//form/input[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//form/a[contains(.,'Forgot password')]")
    public WebElement forgotPasswordLink;

    @FindBy(xpath = "//a[contains(.,'Sign in using Facebook')]")
    public WebElement signInFacebookButton;

    @FindBy(xpath = "//a[contains(.,'Sign in using Google')]")
    public WebElement signInGoogleButton;

    @FindBy(xpath = "//a[contains(.,'Create an account')]")
    public WebElement createAccountButton;

    @FindBy(xpath = "//h1[text()='Signed Out']")
    public WebElement logoutTitle;

    @FindBy(xpath = "//a[text()='Sign in']")
    public WebElement signInLink;

    @FindBy(xpath = "//button[@type='submit'][2]")
    public WebElement allowConditionsButtonFacebook;

    @FindBy(id = "email")
    public WebElement emailInputFacebook;

    @FindBy(id = "pass")
    public WebElement passwordInputFacebook;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement logInButtonFacebook;

    @FindBy(id = "identifierId")
    public WebElement emailInputGoogle;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInputGoogle;


    /********************************************TOP NAVIGATION TAB*********************************************/

    @FindBy(xpath = "//ul/li[@class='dropdown account-menu-item']")
    public WebElement userTab;

    @FindBy(css = "a.cart")
    public WebElement cartTab;

    @FindBy(css = "#top-nav-total-items-count")
    public WebElement cartIndexTab;

    @FindBy(id = "top-nav-sign-out")
    public WebElement logoutLink;

    public By logoutLinkLocator = By.id("top-nav-sign-out");


    /********************************************NAVIGATION MENU************************************************/

    @FindBy(xpath = "//a[contains(.,'All Products')]/ancestor::li[@class='dropdown']")
    public WebElement allProductsNavBar;

    @FindBy(xpath = "//*[@id=\"wrapper\"]/header/div[1]/div[4]/nav[2]/div/ul/li[2]/div[1]/a")
    public WebElement promotionalProductsNavBar;

    @FindBy(xpath = "//*[@id=\"wrapper\"]/header/div[1]/div[4]/nav[2]/div/ul/li[3]/div[1]/a")
    public WebElement printMarketingNavBar;

    @FindBy(xpath = "//a[contains(.,'Events')]/ancestor::li[@class='dropdown']")
    public WebElement eventsNavBar;

    @FindBy(xpath = "//a[contains(.,'Industry')]/ancestor::li[@class='dropdown']")
    public WebElement industryNavBar;


    /********************************************NOTIFICATION************************************************/

    @FindBy(id = "onetrust-banner-sdk")
    public List<WebElement> notifications;

    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement notificationsAccept;


    /********************************************ELEMENTS IN CART PAGE****************************************/

    @FindBy(xpath = "//h1[contains(.,'Your Shopping Cart')]")
    public WebElement cartTitle;

    @FindBy(css = ".removeDetailBtn")
    public List<WebElement> removeButtonInCart;

    @FindBy(xpath = "//div[@id='bootboxBody']/ancestor::div[@class='modal-content']")
    public WebElement modalWindow;

    @FindBy(xpath = "//div[@id='bootboxBody']/ancestor::div[@class='modal-dialog modal-sm']//button[@*='confirm']")
    public WebElement modalConfirmButton;

    public By checkoutButtonInCartLocator = By.xpath("//*[@id=\"cart_hasitemstop\"]//a");

    @FindBy(xpath = "//*[@id=\"cart_hasitemstop\"]//a")
    public WebElement checkoutButtonInCart;

    @FindBy(css = ".thumbnail-container img")
    public List<WebElement> imageContainer;



    /****************************************ELEMENTS IN PRODUCT CARD***************************************/

    public By designButtonLocator = By.cssSelector(".js-add-to-designer");

    @FindBy(css = ".js-add-to-designer")
    public WebElement designButton;

    @FindBy(xpath = "//h1")
    public WebElement productTitle;


}
