import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SaucedemoFindLocatorsTest {
    @Test
    public void findLocatorsinSauceDemoSite() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        //find me By.id
        driver.findElement(By.id("root"));
        driver.findElement(By.id("login_button_container"));
        driver.findElement(By.id("user-name"));
        //find me By.cssSelector("#id")
        driver.findElement(By.cssSelector("#login_credentials"));
        driver.findElement(By.cssSelector("#password"));
        driver.findElement(By.cssSelector("#login-button"));

        //find me By.name
        driver.findElement(By.name("user-name"));
        driver.findElement(By.name("password"));
        driver.findElement(By.name("login-button"));

        //find me By.tagName
        driver.findElement(By.tagName("meta"));
        driver.findElement(By.tagName("link"));
        driver.findElement(By.tagName("script"));
        driver.findElement(By.tagName("title"));
        driver.findElement(By.tagName("div"));
        //etc.

        //find me By.className
        driver.findElement(By.className("login_logo"));
        driver.findElement(By.className("login_wrapper"));
        driver.findElement(By.className("login_wrapper-inner"));
        driver.findElement(By.className("form_column"));
        driver.findElement(By.className("login-box"));
        driver.findElement(By.className("form_group"));
        driver.findElement(By.className("form_input"));
        driver.findElement(By.className("form_group"));
        driver.findElement(By.className("input_error"));
        driver.findElement(By.className("error-message-container"));
        //etc..

        // find me By.cssSelector(".class")
        driver.findElement(By.cssSelector("div[class='login_credentials']"));
        driver.findElement(By.cssSelector("div[class='login_credentials_wrap-inner']"));
        driver.findElement(By.cssSelector("div[class='login_credentials_wrap']"));
        driver.findElement(By.cssSelector("div[class='login_password']"));


        //find me By.xpath ("//div")
        driver.findElement(By.xpath("//h4"));
        driver.findElement(By.xpath("//div"));
        driver.findElement(By.xpath("//form"));
        driver.findElement(By.xpath("//br"));

        //find me By.xpath ("//div/a")
        driver.findElement(By.xpath("//head/meta"));
        driver.findElement(By.xpath("//div/br"));
        driver.findElement(By.xpath("//form/div"));
        driver.findElement(By.xpath("//div/h4"));

        //find me By.xpath ("//*/a")
        driver.findElement(By.xpath("//*/br"));
        driver.findElement(By.xpath("//*/script"));
        driver.findElement(By.xpath("//*/link"));
        driver.findElement(By.xpath("//*/form"));

        //find me by ("//form/..")
        driver.findElement(By.xpath("//h4/.."));
        driver.findElement(By.xpath("(//div)[2]/.."));
        driver.findElement(By.xpath("(//meta)[4]/.."));
        driver.findElement(By.xpath("(//link)[4]/.."));

        //find me By.xpath ("(//div)[5]")
        driver.findElement(By.xpath(("(//div)[6]")));
        driver.findElement(By.xpath(("(//script)[3]")));
        driver.findElement(By.xpath(("(//input)[3]")));
        driver.findElement(By.xpath(("(//br)[4]")));

        //find me By.xpath("//tag[@attribute='value']")
        driver.findElement(By.xpath("//link[@rel='apple-touch-icon']"));
        driver.findElement(By.xpath("//link[@href='/static/css/main.b9d87ff6.chunk.css']"));
        driver.findElement(By.xpath("//div[@class='login-box']"));
        driver.findElement(By.xpath("//input[@data-test='login-button']"));
        driver.findElement(By.xpath("//script[@src='/static/js/2.a1a947cf.chunk.js']"));
        driver.findElement(By.xpath("//div[@id='login_credentials']"));

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector(".submit-button")).click();

        //continue to find me By.xpath("//tag[@attribute='value']")
        driver.findElement(By.xpath("//img[@srcset='/static/media/close@3x.3a2a3ada.svg']"));
        driver.findElement(By.xpath("//button[@name='add-to-cart-test.allthethings()-t-shirt-(red)']"));
        driver.findElement(By.xpath("//a[@href='#']"));

        //find me By.xpath("//tag[text()='text']")
        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        driver.findElement(By.xpath("//*[text()='Add to cart']"));
        driver.findElement(By.xpath("//button[text()='Add to cart']"));
        driver.findElement(By.xpath("//*[text()='9.99']"));
        driver.findElement(By.xpath("//footer/div[text()='2021']"));

        //find me By.xpath("//tag[contains(text(),'text')]");
        driver.findElement(By.xpath("//div[contains(text(),'but it sure helps')]"));
        driver.findElement(By.xpath("//span[contains(text(),'Products')]"));
        driver.findElement(By.xpath("//div[contains(text(),'Test.allTheThings() T-Shirt (Red)')]"));
        driver.findElement(By.xpath("//option[contains(text(),'Price (low to high)')]"));

        //find me By.cssSelector(“a[target=_blank]”)
        driver.findElement(By.cssSelector("a[target=_blank]"));

        //find me By.linkText
        driver.findElement(By.linkText("Facebook"));
        driver.findElement(By.linkText("Twitter"));
        driver.findElement(By.linkText("Sauce Labs Onesie"));
        driver.findElement(By.linkText("Test.allTheThings() T-Shirt (Red)"));

        //find me By.partialLinkText
        driver.findElement(By.partialLinkText("Linke"));
        driver.findElement(By.partialLinkText("Labs Back"));
        driver.findElement(By.partialLinkText("Bike Li"));

        driver.quit();
    }
}
