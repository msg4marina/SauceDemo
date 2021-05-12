package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    String openPage ="//a[@class='shopping_cart_link']";
    public CartPage(WebDriver driver) {
        super(driver);
    }
    public void open(String value) {
        driver.findElement(By.xpath(String.format(openPage, value))).click();
    }
}