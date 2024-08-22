package org.example.pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    public static final String usernameInputCSSLocator = "[data-test='username']";
    private static final String passwordInputCSSLocator = "#password";
    private static final String loginButtonCSSLocator = "#login-button";
    private static final String errorMessageCSSLocator = "[data-test='error']";

    @FindBy(css = usernameInputCSSLocator)
    private WebElement usernameInput;

    @FindBy(css = passwordInputCSSLocator)
    private WebElement passwordInput;

    @FindBy(css = loginButtonCSSLocator)
    private WebElement loginButton;

    @FindBy(css = errorMessageCSSLocator)
    private WebElement errorMessageLabel;


    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

//    private By usernameInputByLocator = By.cssSelector("[data-test='username']");
//    private By passwordInputByLocator = By.cssSelector("#password");
//    private By loginButtonByLocator = By.cssSelector("#login-button");
//    private By errorMessageLabelByLocator = By.cssSelector("[data-test='error']");


    public void enterUsernameAndPasswordAndClick(String username, String password) {
        super.enterText(usernameInput, username);
        super.enterText(passwordInput, password);
        super.click(loginButton);
//        usernameInput.sendKeys(username);
//        passwordInput.sendKeys(password);
//        loginButton.click();
    }

    public void enterUsername(String username) {
        enterText(usernameInput, username);
    }

    public void enterPassword(String password) {
        enterText(passwordInput, password);
    }

    public void clickOnLoginButton() {
        click(loginButton);
    }

    public void waitForErrorMessageToContain(String errorMessage) {
        wait.until(ExpectedConditions.textToBePresentInElement(errorMessageLabel, errorMessage));
    }

    public String getErrorMessage() {
        return errorMessageLabel.getText();
    }

}
