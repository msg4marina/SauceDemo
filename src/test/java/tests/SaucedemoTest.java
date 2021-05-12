package tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class SaucedemoTest extends BaseTest {
    @Test
    public void testSauceDemoSite() {
        loginPage.open();
        loginPage.Login(USER, PASSWORD);
    }
       /* driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.xpath(("//div[contains(text(),'Sauce Labs Backpack')]"))).click();
        driver.findElement(By.xpath(("//a[@class='shopping_cart_link']"))).click();
        driver.findElement(By.xpath(("//button[contains(text(),'Continue Shopping')]"))).click();
        driver.findElement(By.xpath(("//div[contains(text(),'Sauce Labs Fleece Jacket')]"))).click();
        driver.findElement(By.xpath(("//button[contains(text(),'Add to cart')]"))).click();
        driver.findElement(By.xpath(("//a[@class='shopping_cart_link']"))).click();
        driver.findElement(By.xpath(("//button[contains(text(),'Checkout')]"))).click();
        driver.findElement(By.id("first-name")).sendKeys(" Marie-Antoinette");
        driver.findElement(By.id("last-name")).sendKeys(" Rabinovich");
        driver.findElement(By.id("postal-code")).sendKeys("220002");
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        String m1 = driver.findElement(By.xpath("(//div)[26]")).getText();
        assertEquals(m1, "Sauce Labs Fleece Jacket", "Product name is not correct");
        String m2 = driver.findElement(By.xpath("(//div)[35]")).getText();
        assertEquals(m2, "Item total: $49.99", "Price is not correct");
        String m3 = driver.findElement(By.xpath("(//div)[36]")).getText();
        //check the tax rate and the calculation: tax=8% on a product price: = 49.99*8%=4.00,
        assertEquals(m3, "Tax: $4.00", "Tax on a product price is not correct");
        String m4 = driver.findElement(By.xpath("(//div)[37]")).getText();
        assertEquals(m4, "Total: $53.99", "Total price on a product price is not correct");
        driver.findElement(By.id("finish")).click();
        driver.findElement(By.xpath(("//button[contains(text(),'Back Home')]"))).click();*/
    @Test
    public void userNameShouldBeRequired() {
        loginPage.open();
        loginPage.Login("", PASSWORD);
        String error = loginPage.getError();
        assertEquals(error, "Epic sadface: Username is required", "Error message is not correct");
    }
    @Test
    public void passwordShouldBeRequired() {
        loginPage.open();
        loginPage.Login(USER, "");
        String error = loginPage.getError();
        assertEquals(error, "Epic sadface: Password is required", "Password should be written");
    }
    @Test
    public void usernamedShouldWrittenAsSpecified() {
        loginPage.open();
        loginPage.Login("fdfdfsfsf4334324&@", PASSWORD);
        String error = loginPage.getError();
        assertEquals(error, "Epic sadface: Username and password do not match any user in this service",
                "Username should be according to specified");
    }
    @Test
    public void passworddShouldWrittenAsSpecified() {
        loginPage.open();
        loginPage.Login(USER, "fdfdfsfsf4334324&@");
        String error = loginPage.getError();
        assertEquals(error, "Epic sadface: Username and password do not match any user in this service",
                "Password should be according to specified");
    }
}