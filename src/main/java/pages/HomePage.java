package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private Header header;
    private By mobile=By.id("nav_cs_5");
    public HomePage(WebDriver driver) {
        this.driver=driver;
        this.header = new Header(driver);
    }
    public Header getHeader(){
        return this.header;
    }
}
