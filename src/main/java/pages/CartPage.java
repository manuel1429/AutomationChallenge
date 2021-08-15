package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    private final By checkoutButton = By.id("checkout");

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public String getItemName(By item){
        return driver.findElement(item).getText();
    }

    public CheckoutStepOnePage clickOnCheckout(){
        driver.findElement(checkoutButton).click();
        return new CheckoutStepOnePage(driver);
    }
}
