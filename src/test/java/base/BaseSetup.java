package base;

import org.openqa.selenium.WebDriver;

public class BaseSetup {
     public static WebDriver webDriver;
     public static void setWebDriver(WebDriver webDriver1)
     {
         webDriver=webDriver1;
     }
}
