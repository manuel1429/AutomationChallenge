package Products;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class SortProductsTest extends BaseTests {

    public String lowToHigh = "lohi";

    @Test
    public void testSortProducts(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        var homePage = loginPage.clickOnLogin();
        homePage.clickOnFilterBy(lowToHigh);
        assertEquals(homePage.getActiveOption(),"PRICE (LOW TO HIGH)","Your selector are incorrect");
    }
}
