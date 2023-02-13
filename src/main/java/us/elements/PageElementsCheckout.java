package us.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageElementsCheckout extends PageElementsProduct{

    public PageElementsCheckout(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//div[@id='cart_hasitemstop']//a[contains(@href,'checkout')]")
    public WebElement checkoutButton;

    @FindBy(xpath = "//h1[contains(.,'Checkout')]")
    public WebElement checkoutTitle;

    @FindBy(xpath = "//h3[contains(.,'Your Buying Reason')]/../..")
    public WebElement yourBuyingReasonSection;

    // TODO скорее всего надо будет добавить к нему локаторы!
    @FindBy(id = "sel_buying_reason")
    public WebElement yourBuyingReasonInputField;

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


}
