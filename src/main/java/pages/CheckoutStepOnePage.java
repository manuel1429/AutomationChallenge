package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutStepOnePage {

    private WebDriver driver;
    private By firstName = By.id("first-name");
    private By lastName = By.id("last-name");
    private By postalCode = By.id("postal-code");
    private final By continueButton = By.id("continue");

    public CheckoutStepOnePage(WebDriver driver){
        this.driver = driver;
    }

    public void setFirstName(String name){
        sendKeysToPage(firstName,name);
    }

    public void setLastNameName(String name){
        sendKeysToPage(lastName,name);
    }

    public void setPostalCode(String code){
        sendKeysToPage(postalCode,code);
    }

    public void sendKeysToPage(By item, String name){
        driver.findElement(item).sendKeys(name);
    }

    public CheckoutStepTwoPage clickOnContinue(){
        driver.findElement(continueButton).click();
        return new CheckoutStepTwoPage(driver);
    }
}
