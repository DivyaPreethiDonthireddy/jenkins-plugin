package stepdefinitions;

import base.BaseSetup;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    Scenario scenario;
    public WebDriver webDriver;
    @Before()
    public void initializeBrowser(Scenario scenario1)
    {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        webDriver=new ChromeDriver();
        webDriver.manage().window().maximize();
        BaseSetup.setWebDriver(webDriver);
        this.scenario=scenario1;
    }

    @After()
    public void closeBrowser(Scenario s)
    {
        if(s.isFailed()) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) webDriver;
            byte[] data = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.embed(data, "image/png");
            System.out.println(scenario.getName());
        }
        webDriver.quit();
    }
}
