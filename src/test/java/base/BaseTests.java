package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import pages.LoginPage;

public class BaseTests {

    private WebDriver driver;
    protected LoginPage loginPage;

    @BeforeClass
    @Parameters({"URL", "BrowserType"})
    public void setUp(String url, String browserType){
        if(browserType.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(url);
            loginPage = new LoginPage(driver);
        }else if(browserType.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(url);
            loginPage = new LoginPage(driver);
        }
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
