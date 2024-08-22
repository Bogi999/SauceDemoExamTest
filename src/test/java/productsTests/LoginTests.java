package productsTests;

import org.example.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;




public class LoginTests extends BaseTest {

    @Test
    public void successfulLoginTest() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("img.inventory_item_img")));
        Assertions.assertTrue(driver.getPageSource().contains("Swag Labs"));

    }

    @Test
    public void userCannotLoginWithInvalidCredentialsTest() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsernameAndPasswordAndClick("standard_user", "blabla");

        String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
        loginPage.waitForErrorMessageToContain(expectedErrorMessage);
    }
    @Test
    public void userCannotLoginWithEmptyFieldCredentialsTest() {
        LoginPage loginPage = new LoginPage(this.driver);
        loginPage.enterUsernameAndPasswordAndClick("", "");
        String expectedErrorMessage = "Epic sadface: Username is required";
        loginPage.waitForErrorMessageToContain(expectedErrorMessage);
    }


}
