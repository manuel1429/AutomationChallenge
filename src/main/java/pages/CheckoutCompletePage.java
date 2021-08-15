package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage {

    private WebDriver driver;
    private By confirmationTitle = By.className("title");

    public CheckoutCompletePage(WebDriver driver){
        this.driver = driver;
    }
    public String getConfirmationTitle(){
        return driver.findElement(confirmationTitle).getText();
    }

}
