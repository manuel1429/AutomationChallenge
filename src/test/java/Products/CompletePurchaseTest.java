package Products;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CompletePurchaseTest extends BaseTests {

    private final By onesie = By.id("add-to-cart-sauce-labs-onesie");

    @Test
    public void testLogoutHomePage() {
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        var homePage = loginPage.clickOnLogin();
        homePage.addItemsToShoppingCart(onesie);
        var cartPage = homePage.clickOnShoppingCart();
        var checkoutStepOnePage = cartPage.clickOnCheckout();
        checkoutStepOnePage.setFirstName("Jhon");
        checkoutStepOnePage.setLastNameName("Rivas");
        checkoutStepOnePage.setPostalCode("52400");
        var checkoutStepTwoPage = checkoutStepOnePage.clickOnContinue();
        var checkoutCompletePage = checkoutStepTwoPage.clickOnFinish();
        assertEquals(checkoutCompletePage.getConfirmationTitle(),"CHECKOUT: COMPLETE!","Confirmation msg incorrect");
    }
}
