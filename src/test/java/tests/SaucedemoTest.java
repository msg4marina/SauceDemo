package tests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SaucedemoTest extends BaseTest {
    @Test
    public void testSauceDemoSite( ) {
        loginPage.open();
        loginPage.Login(USER, PASSWORD);
    }
    @Test(description = "login should be correct", dataProvider = "Login Data")
    public void loginShouldBeCorrect(String user, String passsword, String errorMessage) {
        loginPage.open();
        loginPage.Login(USER, PASSWORD);
        boolean isError = loginPage.isErrorDisplayed();
        assertFalse(isError, "gbggdgdfg");
        boolean opened = productsPage.isPageOpened();
        assertTrue(opened, "dlnsdjksjkdbsdjwbjbq2t");
    }
    @Test(retryAnalyzer = Retry.class, description = "username should be required")
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
    @Test(description = "usernamed should be written as specified")
    public void usernamedShouldBeWrittenAsSpecified( ) {
        loginPage.open();
        loginPage.Login("fdfdfsfsf4334324&@", PASSWORD);
        String error = loginPage.getError();
        assertEquals(error, "Epic sadface: Username and password do not match any user in this service",
                "Username should be according to specified");
    }
    @Test(description = "password should be written as specified")
    public void passwordShouldBeWrittenAsSpecified( ) {
        loginPage.open();
        loginPage.Login(USER, "fdfdfsfsf4334324&@");
        String error = loginPage.getError();
        assertEquals(error, "Epic sadface: Username and password do not match any user in this service",
                "Password should be according to specified");
    }
}