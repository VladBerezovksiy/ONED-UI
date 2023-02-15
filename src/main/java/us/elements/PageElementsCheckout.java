package us.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PageElementsCheckout extends PageElementsProduct {

    public PageElementsCheckout(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//div[@id='cart_hasitemstop']//a[contains(@href,'checkout')]")
    public WebElement checkoutButton;



    /************************************CHECKOUT PAGE ELEMENTS*********************************/

    @FindBy(xpath = "//h1[contains(.,'Checkout')]")
    public WebElement checkoutTitle;

    @FindBy(xpath = "//h3[contains(.,'Your Buying Reason')]/../..")
    public WebElement yourBuyingReasonSection;

    @FindBy(id = "sel_buying_reason")
    public WebElement yourBuyingReasonDropdown;

    @FindBy(css = "#sel_buying_reason option")
    public List<WebElement> yourBuyingReasonOption;

    @FindBy(xpath = "//h3[contains(.,'Discount Code')]/../..")
    public WebElement discountCodeSection;

    @FindBy(id = "txt_couponcode")
    public WebElement discountCodeInputField;

    @FindBy(id = "btn_coupon")
    public WebElement discountCodeConfirmButton;

    @FindBy(id = "cc_container")
    public WebElement creditCardButton;

    @FindBy(id = "paypal_container")
    public WebElement payPalButton;

    @FindBy(id = "google-pay-container")
    public WebElement googlePayButton;



    /************************************CREDIT CARD MODAL WINDOW ELEMENTS*********************************/

    @FindBy(id = "form_payments_cc")
    public WebElement creditCardModalWindow;

    @FindBy(id = "cardholder_name")
    public WebElement cardHolderNameInputField;

    @FindBy(id = "braintree-hosted-field-number")
    public WebElement frameCreditCardNumberInputField;

    @FindBy(id = "credit-card-number")
    public WebElement creditCardNumberInputField;

    @FindBy(id = "braintree-hosted-field-expirationMonth")
    public WebElement frameExpirationMonthInputField;

    @FindBy(css = "input#expiration-month")
    public WebElement expirationMonthInputField;

    @FindBy(id = "braintree-hosted-field-expirationYear")
    public WebElement frameExpirationYearInputField;

    @FindBy(css = "input#expiration-year")
    public WebElement expirationYearInputField;

    @FindBy(id = "braintree-hosted-field-cvv")
    public WebElement frameCvvInputField;

    @FindBy(css = "input#cvv")
    public WebElement cvvInputField;

    @FindBy(id = "braintree-hosted-field-postalCode")
    public WebElement framePostalCodeInputField;

    @FindBy(css = "input#postal-code")
    public WebElement postalCodeInputField;

    @FindBy(id = "button_cc")
    public WebElement submitOrderButton;

}
