package productsTests;

import org.example.pages.CartPage;
import org.example.pages.LoginPage;
import org.example.pages.ProductPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductsTests extends BaseTest{


    @Test
    public void successfulAddToCartTest() {

        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        loginPage.enterUsernameAndPasswordAndClick("standard_user", "secret_sauce");
        productPage.clickAddToCart();
        productPage.clickMyCart();
        Assertions.assertTrue(driver.getPageSource().contains("Sauce Labs Backpack"));
    }


    @Test
    public void successfulRemoveFromCartTest() {

        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        loginPage.enterUsernameAndPasswordAndClick("standard_user", "secret_sauce");
        productPage.clickAddToCart();
        productPage.clickMyCart();
        cartPage.removeFromCartButtonClick();
        Assertions.assertFalse(driver.getPageSource().contains("Sauce Labs Backpack"));
    }

}
