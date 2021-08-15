package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    private WebDriver driver;
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMsg = By.tagName("h3");
    private By acceptedUsernames = By.cssSelector("#login_credentials h4");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public HomePage clickOnLogin(){
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }

    public String getErrorMsgLogin(){
        return driver.findElement(errorMsg).getText();
    }
    public String getLoginUsernames(){
        return driver.findElement(acceptedUsernames).getText();
    }
}
