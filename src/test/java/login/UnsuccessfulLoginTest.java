package login;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UnsuccessfulLoginTest extends BaseTests {

    @Test
    public void testUnsuccessfulLogin(){
        loginPage.setUsername("fake_user");
        loginPage.setPassword("fake_password");
        loginPage.clickOnLogin();
        assertEquals(loginPage.getErrorMsgLogin(),
                "Epic sadface: Username and password do not match any user in this service",
                "Your selector are incorrect");
    }
}
