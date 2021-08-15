package Products;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

public class LogoutHomePageTest extends BaseTests {

    @Test
    public void testLogoutHomePage(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        HomePage homePage = loginPage.clickOnLogin();
        homePage.logOutHomePage();
        assertEquals(loginPage.getLoginUsernames(),"Accepted usernames are:","Your selector are incorrect");
    }
}
