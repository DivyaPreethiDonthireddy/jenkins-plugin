package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver webDriver;
    public LoginPage(WebDriver webDriver) {
        this.webDriver=webDriver;
    }
    public void openApplication()
    {
        webDriver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
    }
  public void enterUserName(String userName)
  {
      By userNameField= By.cssSelector("input[id='txtUsername']");
      WebElement userNameElement= webDriver.findElement(userNameField);
      userNameElement.sendKeys(userName);
  }
  public void enterPassword(String password)
  {
      By passwordField=By.cssSelector("input[id='txtPassword']");
      WebElement passwordElement= webDriver.findElement(passwordField);
      passwordElement.sendKeys(password);
  }
  public void clickOnLogin()
  {
      By loginButton=By.cssSelector("input[id='btnLogin']");
      WebElement loginElement= webDriver.findElement(loginButton);
      loginElement.click();
  }
}
