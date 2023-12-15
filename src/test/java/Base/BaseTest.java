package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeSuite
    public void setUp(){
       // System.setProperty("webdriver.chrome.driver", "//Users//shameed//sLab//amazon-ui-e2e//Chrome Driver//chromedriver//chromedriver.uef");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePage = new HomePage(driver);
    }
    @AfterSuite
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        //driver.quit();
    }
}
