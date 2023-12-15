package tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductPage;

public class AddToCartTest extends BaseTest {
    @Test
    public void testSearch(){
        ProductPage productPage =homePage.getHeader().search("iphone 13");
        Assert.assertEquals(productPage.validateTitle(),"Amazon.in : iphone 13");
        productPage.clickProduct();

    }
}
