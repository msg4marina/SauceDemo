package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public static final By USERNAME_INPUT = By.id("user-name");
    public static final By PASSWORD_INPUT = By.name("password");
    public static final By LOGIN_BUTTON = By.id("login-button");
    public static final By ERROR_MESSAGE = By.cssSelector("[data-test=error]");

    public LoginPage(WebDriver driver) {

        super(driver);
    }

    @Step("Open Login page")
    public void open() {
        driver.get("https://www.saucedemo.com/");
    }

    @Step("Login by user: {user}")
    public void Login(String user, String pass) {
        driver.findElement(USERNAME_INPUT).sendKeys(user);
        driver.findElement(PASSWORD_INPUT).sendKeys(pass);
        driver.findElement(LOGIN_BUTTON).click();
    }
    public String getError() {
        return driver.findElement(ERROR_MESSAGE).getText();
    }
}