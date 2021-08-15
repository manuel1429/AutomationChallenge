package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutStepTwoPage {

    private WebDriver driver;
    private final By finishButton = By.id("finish");

    public CheckoutStepTwoPage(WebDriver driver){
        this.driver = driver;
    }

    public CheckoutCompletePage clickOnFinish(){
        driver.findElement(finishButton).click();
        return new CheckoutCompletePage(driver);
    }
}
