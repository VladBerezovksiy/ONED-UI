package us;

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

    // TODO: начать писать основные локаторы
//    @FindBy(xpath = "//div[@class='dropdown-selected-option-container']//span")
//    public WebElement selectedLanguage;

}
