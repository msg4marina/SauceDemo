package tests;

import lombok.extern.log4j.Log4j;
import io.qameta.allure.Step;
import org.testng.annotations.Test;
import tests.base.Retry;

@Log4j
public class ProductsTest extends BaseTest {
    @Step ("Check the product adding into the cart")
    @Test(retryAnalyzer = Retry.class, description = "product should be added into the cart")

    public void productShouldBeAddedIntoTheCart( ) {
        loginPage.open();
        loginPage.Login(USER, PASSWORD);
        productsPage.addToCart("Test.allTheThings() T-Shirt (Red)");
        cartPage.open("shopping_cart_link");
        //TODO VALIDATE NAME AND PRICE
        log.fatal("fatal");
        log.error("error");
        log.debug("debug");

    }
}