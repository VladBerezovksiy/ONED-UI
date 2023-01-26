package us;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    /********************************************TOP NAVIGATION BAR*********************************************/

    @FindBy(xpath = "//ul/li[@class='dropdown account-menu-item']")
    public WebElement userNavBar;

    @FindBy(id = "top-nav-sign-out")
    public WebElement logoutLink;
}
