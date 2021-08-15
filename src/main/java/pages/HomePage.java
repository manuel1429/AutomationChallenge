package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HomePage {

    private WebDriver driver;
    private By titlePage = By.className("title");
    private By burgerMenu = By.id("react-burger-menu-btn");
    private By logoutPage = By.id("logout_sidebar_link");
    private By selectedClass = By.className("product_sort_container");
    private By activeOption = By.className("active_option");
    private By shoppingCartButton = By.className("shopping_cart_link");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public String getTitlePage(){
        return getElementText(titlePage);
    }

    public void logOutHomePage(){
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        clickElement(burgerMenu);
        clickElement(logoutPage);
    }

    public void clickOnFilterBy(String value){
        var dropdownElement = new Select(driver.findElement(selectedClass));
        dropdownElement.selectByValue(value);
    }

    public String getActiveOption(){
        return getElementText(activeOption);
    }

    public void addItemsToShoppingCart(By item){
        clickElement(item);
    }

    public CartPage clickOnShoppingCart(){
        clickElement(shoppingCartButton);
        return new CartPage(driver);
    }

    public void clickElement(By element){
        driver.findElement(element).click();
    }

    public String getElementText(By element){
        return driver.findElement(element).getText();
    }
}
