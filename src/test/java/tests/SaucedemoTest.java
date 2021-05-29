package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SaucedemoTest extends BaseTest {
    @Test
    public void testSauceDemoSite( ) {
        loginPage.open();
        loginPage.Login(USER, PASSWORD);
    }

    @Test(description = "user name should be required")
    public void userNameShouldBeRequired( ) {
        loginPage.open();
        loginPage.Login("", PASSWORD);
        String error = loginPage.getError();
        assertEquals(error, "Epic sadface: Username is required", "Error message is not correct");
    }

    @Test(description = "password should be required")
    public void passwordShouldBeRequired( ) {
        loginPage.open();
        loginPage.Login(USER, "");
        String error = loginPage.getError();
        assertEquals(error, "Epic sadface: Password is required", "Password should be written");
    }

    @Test(description = "username should be written as specified")
    public void usernameShouldWrittenAsSpecified( ) {
        loginPage.open();
        loginPage.Login("fdfdfsfsf4334324&@", PASSWORD);
        String error = loginPage.getError();
        assertEquals(error, "Epic sadface: Username and password do not match any user in this service",
                "Username should be according to specified");
    }

    @Test(description = "password should written as specified")
    public void passwordShouldWrittenAsSpecified( ) {
        loginPage.open();
        loginPage.Login(USER, "fdfdfsfsf4334324&@");
        String error = loginPage.getError();
        assertEquals(error, "Epic sadface: Username and password do not match any user in this service",
                "Password should be according to specified");
    }
}