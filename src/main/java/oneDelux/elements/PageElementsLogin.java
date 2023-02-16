package oneDelux.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import oneDelux.BaseElements;

public class PageElementsLogin extends BaseElements {

    public PageElementsLogin(WebDriver driver) {
        super(driver);
    }

    public By dForgotPasswordLink = By.xpath("//form/a[contains(.,'Forgot password')]");

    @FindBy(xpath = "//form/input[@value='Reset Password']")
    public WebElement forgotResetButton;


}
