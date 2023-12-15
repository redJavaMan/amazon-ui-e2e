package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage {
    private WebDriver driver;
    private By iphone = By.xpath("//span[text()='iPhone 13 (128GB) - Blue']");
    //List<WebElement>products= driver.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));
    public ProductPage(WebDriver driver) {
        this.driver=driver;
    }
    public String validateTitle(){
       return driver.getTitle();
    }
    public void clickProduct(){

        driver.findElement(iphone).click();

        }
}
