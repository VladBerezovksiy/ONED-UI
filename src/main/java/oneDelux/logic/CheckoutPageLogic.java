package oneDelux.logic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import oneDelux.elements.PageElementsCheckout;
import org.testng.Assert;
import utils.Variables;

public class CheckoutPageLogic extends ProductPageLogic {

    private PageElementsCheckout elements;

    public CheckoutPageLogic(WebDriver driver, WebDriverWait wait, PageElementsCheckout elements) {
        super(driver, wait, elements);
        this.elements = elements;
    }

    @Override
    public void getRootPage() {
        browseLoginPage();
    }

    @Override
    public void backToRootPage() {
        browseLoginPage();
    }


    public void verifyCheckoutPage() {
        login(Variables.MAIN_ACCOUNT, Variables.MAIN_PASSWORD);
        openCartPage();
        openCheckoutGeneralSection();
    }

    public void verifyCheckoutProductWithCreditCard() {
        enterValidValuesToFinishedCheckout();
        jsScroll(elements.creditCardButton);
        waitForVisible(elements.creditCardButton);
        clickWhenReady(elements.creditCardButton);
        makePause(1000);

        waitForVisible(elements.creditCardModalWindow);
        waitForVisible(elements.cardHolderNameInputField);
        clickWhenReady(elements.cardHolderNameInputField).sendKeys("AQA Test");

        switchToFrame(elements.frameCreditCardNumberInputField);
        waitForVisible(elements.creditCardNumberInputField);
        clickWhenReady(elements.creditCardNumberInputField).sendKeys(Variables.CARD_NUMBER);
        driver.switchTo().defaultContent();

        switchToFrame(elements.frameExpirationMonthInputField);
        waitForVisible(elements.expirationMonthInputField);
        clickWhenReady(elements.expirationMonthInputField).sendKeys(Variables.EXPIRATION_MONTH);
        driver.switchTo().defaultContent();

        switchToFrame(elements.frameExpirationYearInputField);
        waitForVisible(elements.expirationYearInputField);
        clickWhenReady(elements.expirationYearInputField).sendKeys(Variables.EXPIRATION_YEAR);
        driver.switchTo().defaultContent();

        switchToFrame(elements.frameCvvInputField);
        waitForVisible(elements.cvvInputField);
        clickWhenReady(elements.cvvInputField).sendKeys(Variables.CVV_CODE);
        driver.switchTo().defaultContent();

        switchToFrame(elements.framePostalCodeInputField);
        waitForVisible(elements.postalCodeInputField);
        clickWhenReady(elements.postalCodeInputField).sendKeys(Variables.ZIP_CODE);
        driver.switchTo().defaultContent();

        waitForVisible(elements.submitOrderButton);
        clickWhenReady(elements.submitOrderButton);
        makePause(3000);
        waitForJSToBeLoaded();
    }

    public void verifyCheckoutProductWithPayPal() {
        enterValidValuesToFinishedCheckout();
        waitForVisible(elements.payPalButton);
        clickWhenReady(elements.payPalButton);

    }

    public void verifyCheckoutProductWithGooglePay() {
        enterValidValuesToFinishedCheckout();
        waitForVisible(elements.googlePayButton);
        clickWhenReady(elements.googlePayButton);

    }

    private void openCheckoutGeneralSection() {
        waitForVisible(elements.checkoutButton);
        clickWhenReady(elements.checkoutButton);
        makePause(1000);
        waitForJSToBeLoaded();
        waitForVisible(elements.checkoutTitle);
    }

    private void openCartPage() {
        waitForVisible(elements.cartTab);
        if (!elements.cartIndexTab.getText().trim().equals("")) {
            if (!driver.getCurrentUrl().contains("/cart/")) {
                clickWhenReady(elements.cartTab);
                makePause(1500);
                waitForJSToBeLoaded();
            }
        } else {
            Assert.assertFalse(elements.cartIndexTab.getText().trim().equals(""), "You need add Product in cart!!!");
        }
    }

    private void enterValidValuesToFinishedCheckout() {
        waitForVisible(elements.yourBuyingReasonSection);
        jsScroll(elements.yourBuyingReasonDropdown);
        selectDropdownOption(elements.yourBuyingReasonDropdown, elements.yourBuyingReasonDropdown,
                elements.yourBuyingReasonOption, 15);
        waitForVisible(elements.discountCodeSection);
        waitForVisible(elements.discountCodeInputField).sendKeys(Variables.DISCOUNT_CODE);
        clickWhenReady(elements.discountCodeConfirmButton);
    }

}
