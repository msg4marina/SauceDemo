import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertEquals;

public class SaucedemoTest {
    @Test
    public void testSauceDemoSite() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector(".submit-button")).click();
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
        //BUG! Impossible to change the quantity of same item or to add another.
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
        driver.findElement(By.xpath(("//button[contains(text(),'Back Home')]"))).click();
        driver.quit();
    }
}
