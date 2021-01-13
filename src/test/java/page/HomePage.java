package page;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {
    WebDriver webDriver;
    public HomePage(WebDriver webDriver) {
        this.webDriver=webDriver;
    }
    public void loginVerification(String expectedTitle)
    {
        String actualTitle=webDriver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle,"Home page is not opened");
    }


}
