package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class PIMPage {
    WebDriver webDriver;
    public PIMPage(WebDriver webDriver) {
        this.webDriver=webDriver;
    }
    public void clickOnPIM()
    {
        By pimField= By.id("menu_pim_viewPimModule");
        WebElement pimElement= webDriver.findElement(pimField);
        Actions actions=new Actions(webDriver);
        actions.moveToElement(pimElement).build().perform();

    }
    public void clickOnAddEmployee()
    {
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        By addEmployeeField=By.id("menu_pim_addEmployee");
        WebElement addEmployeeElement= webDriver.findElement(addEmployeeField);
        addEmployeeElement.click();
    }

    public void enterFirstName(String firstName)
    {
        By firstNameField=By.id("firstName");
        WebElement firstNameElement= webDriver.findElement(firstNameField);
        firstNameElement.sendKeys(firstName);
    }
    public void enterLastName(String lastName)
    {
        By lastNameField=By.id("lastName");
        WebElement lastNameElement= webDriver.findElement(lastNameField);
        lastNameElement.sendKeys(lastName);
    }
    public void choosePhotograph(String filePath)
    {
        By photographField=By.id("photofile");
        WebElement photographElement= webDriver.findElement(photographField);
        photographElement.sendKeys(filePath);
    }
    public void clickOnSave()
    {
        By saveButton=By.id("btnSave");
        WebElement saveElement=webDriver.findElement(saveButton);
        saveElement.click();
    }
    public void clickOnEmployeeList()
    {
        By employeeListField=By.id("menu_pim_viewEmployeeList");
        WebElement employeeListElement= webDriver.findElement(employeeListField);
        employeeListElement.click();
    }
    public void enterEmployeeName(String employeeName)
    {
        By employeeNameField=By.cssSelector("input[id='empsearch_employee_name_empName']");
        WebElement employeeNameElement= webDriver.findElement(employeeNameField);
        employeeNameElement.sendKeys(employeeName);
    }
    public void clickOnSearch()
    {
        By searchButton=By.cssSelector("input[id='searchBtn']");
        WebElement searchButtonElement= webDriver.findElement(searchButton);
        searchButtonElement.click();
    }
    public void enterEmployeeID(String employeeId)
    {
        By employeeIdField=By.cssSelector("input[id='empsearch_id']");
        WebElement employeeIdElement= webDriver.findElement(employeeIdField);
        employeeIdElement.sendKeys(employeeId);
    }
}
