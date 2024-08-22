package productsTests;

import org.example.pages.LoginPage;
import org.example.pages.ProductPage;
import org.junit.jupiter.api.Test;

public class FTITests extends BaseTest {

    @Test
    public void successfulClickOnTwitterIcon() {
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        loginPage.enterUsernameAndPasswordAndClick("standard_user", "secret_sauce");
        productPage.clickTwitterIcon();
    }
    @Test
    public void successfulClickOnFacebookIcon() {
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        loginPage.enterUsernameAndPasswordAndClick("standard_user","secret_sauce");
        productPage.clickFacebookIcon();
    }
    @Test
    public void succesfulClickOnLinkedinIcon() {
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        loginPage.enterUsernameAndPasswordAndClick("standard_user","secret_sauce");
        productPage.clickLinkedinIcon();


    }
}
