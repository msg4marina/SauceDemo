package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    String openButton = "//*[contains text(),'%s')]/ancestor::*[@class='shopping_cart_badge']//button";

    public CartPage(WebDriver driver) {
        super(driver);
    }
    public void open(String name) {
        driver.findElement(By.xpath(String.format(openButton, name))).click();
    }
}