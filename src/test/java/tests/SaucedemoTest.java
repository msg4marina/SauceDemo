package tests;

import io.qameta.allure.Step;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SaucedemoTest extends BaseTest {
    @Step ("Open Saucedemo site")
    public void testSauceDemoSite() {
        loginPage.open();
        loginPage.Login(USER, PASSWORD);
    }
    @Step ("Open Login page")
    public void login() {
        loginPage.open();
        loginPage.Login(USER, PASSWORD);
    }
    @Step ("Insert the data into the Login page fields")
    @DataProvider(name = "Login Data")
    public Object[][] getLoginData( ) {
        return new Object[][]{
                {"", PASSWORD, "Epic sadface: Username is required"},
                {USER, "", "Epic sadface: Password is required"},
                {"fdfdfsfsf4334324&@", PASSWORD, "Epic sadface: " +
                        "Username and password do not match any user in this service"},
                {USER, "fdfdfsfsf4334324&@", "Epic sadface: Username and password do not match any user in this service"},
        };
    }
    @Step ("Check that user name  and password should be required in Login")
    @Test(description = "user name  and password should be required", dataProvider = "Login Data")
    public void userNameShouldBeRequired(String user, String password, String errorMessage) {
        loginPage.open();
        loginPage.Login(user, password);
        String error = loginPage.getError();
        assertEquals(error, errorMessage);
    }
}