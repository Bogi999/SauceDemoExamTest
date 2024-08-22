package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage {

    private static final String removeButtonCSSLocator = "#remove-sauce-labs-backpack";

    @FindBy(css = removeButtonCSSLocator)
    private WebElement removeFromCartButton;

    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void removeFromCartButtonClick() {
        removeFromCartButton.click();
    }

}
