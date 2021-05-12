package tests;

import org.testng.annotations.Test;

public class ProductsTest extends BaseTest{
    @Test
    public void productShouldBeAddedIntoTheCart (){
        loginPage.open();
        loginPage.Login(USER,PASSWORD);
        productsPage.addToCart("Test.allTheThings() T-Shirt (Red)");
        cartPage.open("shopping_cart_link");
        //TODO VALIDATE NAME AND PRICE
    }
}