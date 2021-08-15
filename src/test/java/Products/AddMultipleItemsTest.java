package Products;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddMultipleItemsTest extends BaseTests {

    private final By backpack = By.id("add-to-cart-sauce-labs-backpack");
    private final By jacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
    private final By onesie = By.id("add-to-cart-sauce-labs-onesie");

    private final By itemNameBackpack = By.cssSelector("#item_4_title_link .inventory_item_name");
    private final By itemNameJacket = By.cssSelector("#item_5_title_link .inventory_item_name");
    private final By itemNameOnesie = By.cssSelector("#item_2_title_link .inventory_item_name");

    @Test
    public void testLogoutHomePage(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        var homePage = loginPage.clickOnLogin();
        homePage.addItemsToShoppingCart(backpack);
        homePage.addItemsToShoppingCart(jacket);
        homePage.addItemsToShoppingCart(onesie);
        var cartPage = homePage.clickOnShoppingCart();
        assertEquals(cartPage.getItemName(itemNameBackpack),"Sauce Labs Backpack","Wrong item name");
        assertEquals(cartPage.getItemName(itemNameJacket),"Sauce Labs Fleece Jacket","Wrong item name");
        assertEquals(cartPage.getItemName(itemNameOnesie),"Sauce Labs Onesie","Wrong item name");
    }

}
