package pages;

import lombok.extern.log4j.Log4j;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j
public class ProductsPage extends BasePage {
    String addToCartButton = "//*[contains(text(), '%s')]//ancestor::*[@class='inventory_item']//button";

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Add product: {name} into cart")
    public void addToCart(String name) {
        driver.findElement(By.xpath(String.format(addToCartButton, name))).click();
        log.warn("warn");
        log.info("info");
    }
}