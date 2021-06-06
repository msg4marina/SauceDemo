package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {
    String addToCartButton = "//*[contains(text(), '%s')]//ancestor::*[@class='inventory_item']//button";

    public ProductsPage(WebDriver driver) {
        super(driver);
    }
@Step("Add product: {name} into cart")
    public void addToCart(String name) {
        driver.findElement(By.xpath(String.format(addToCartButton, name))).click();
    }
}