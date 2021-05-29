
package tests;

import org.testng.annotations.Test;
import tests.base.BaseTest;
import tests.base.Retry;

public class ProductsTest extends BaseTest {
    @Test (retryAnalyzer = Retry.class, description = "product should be added into the cart")
    public void productShouldBeAddedIntoTheCart (){
        loginPage.open();
        loginPage.Login(USER,PASSWORD);
        productsPage.addToCart("Test.allTheThings() T-Shirt (Red)");
        cartPage.open("shopping_cart_link");
        //TODO VALIDATE NAME AND PRICE
    }
}