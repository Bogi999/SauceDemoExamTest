package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage{

    private static final String addToCartButtonCSSLocator = "#add-to-cart-sauce-labs-backpack";
    private static final String removeFromCartButtonCSSLocator = "#remove-sauce-labs-backpack";
    private static final String myCartCSSLocator = "#shopping_cart_container > a";
    private static final String twitterIconCSSLocator = "#page_wrapper > footer > ul > li.social_twitter > a";
    private static final String facebookIconCssLocator ="#page_wrapper > footer > ul > li.social_facebook > a";
    private static final String linkedinIconCssLocator = "#page_wrapper > footer > ul > li.social_linkedin > a";


    @FindBy(css = addToCartButtonCSSLocator)
    private WebElement addToCartButton;

    @FindBy(css = removeFromCartButtonCSSLocator)
    private WebElement removeFromCartButton;

    @FindBy(css = myCartCSSLocator)
    private WebElement myCart;

    @FindBy(css = twitterIconCSSLocator)
    private WebElement twitterIcon;

    @FindBy(css = facebookIconCssLocator)
    private WebElement facebookIcon;

    @FindBy (css = linkedinIconCssLocator )
     private WebElement linkedinIcon;

    public ProductPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void clickAddToCart() {
        addToCartButton.click();
    }

    public void clickTwitterIcon() {
        twitterIcon.click();
    }

    public void clickMyCart() {
        myCart.click();
    }

    public void clickFacebookIcon() {
        facebookIcon.click();
    }

    public void clickLinkedinIcon(){
        linkedinIcon.click();
    }
}
