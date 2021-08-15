package login;

import base.BaseTests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SuccessfulLoginTest extends BaseTests {

    @Test(dataProvider="authenticationData")
    public void testSuccessfulLogin(String email, String password){
        loginPage.setUsername(email);
        loginPage.setPassword(password);
        var homePage = loginPage.clickOnLogin();
        assertEquals(homePage.getTitlePage(), "PRODUCTS","Your selector are incorrect");
        homePage.logOutHomePage();
    }

    @DataProvider(name="authenticationData")
    public Object[][] getData(){
        Object[][] data = new Object[3][2];

        data[0][0] = "standard_user"; data[0][1] = "secret_sauce";
        data[1][0] = "problem_user"; data[1][1] = "secret_sauce";
        data[2][0] = "performance_glitch_user"; data[2][1] = "secret_sauce";
        return data;
    }

}
