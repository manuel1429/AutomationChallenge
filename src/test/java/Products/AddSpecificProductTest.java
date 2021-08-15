package Products;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddSpecificProductTest extends BaseTests {


    private final By onesie = By.id("add-to-cart-sauce-labs-onesie");
    private final By itemNameOnesie = By.cssSelector("#item_2_title_link .inventory_item_name");

    @Test
    public void testLogoutHomePage() {
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        var homePage = loginPage.clickOnLogin();
        homePage.addItemsToShoppingCart(onesie);
        var cartPage = homePage.clickOnShoppingCart();
        assertEquals(cartPage.getItemName(itemNameOnesie), "Sauce Labs Onesie", "Wrong item name");
    }
}
