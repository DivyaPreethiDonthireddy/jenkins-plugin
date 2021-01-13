package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminPage {
    WebDriver webDriver;
    public AdminPage(WebDriver webDriver) {
        this.webDriver=webDriver;
    }
    public void clickOnAdmin()
    {
        By adminField= By.id("menu_admin_viewAdminModule");
        WebElement adminElement= webDriver.findElement(adminField);
        adminElement.click();
    }
    public void clickOnUserManagement()
    {
        By userManagementField= By.id("menu_admin_UserManagement");
        WebElement userManagementElement= webDriver.findElement(userManagementField);
        userManagementElement.click();
    }
    public void clickOnAddButton()
    {
        By addButton= By.cssSelector("input[name='btnAdd']");
        WebElement addButtonElement= webDriver.findElement(addButton);
        addButtonElement.click();
    }
    public void enterEmployeeNameForAdmin(String employeeNameForAdmin)
    {
        By employeeNameField=By.cssSelector("input[id='systemUser_employeeName_empName']");
        WebElement employeeNameElement= webDriver.findElement(employeeNameField);
        employeeNameElement.sendKeys(employeeNameForAdmin);
    }
    public void enterUserNameForAdminToAddUser(String employeeUserName)
    {
        By employeeUserNameAdmin=By.cssSelector("input[id='systemUser_userName']");
        WebElement employeeUserNameAdminElement= webDriver.findElement(employeeUserNameAdmin);
        employeeUserNameAdminElement.sendKeys(employeeUserName);
    }
    public void enterPasswordForAdmin(String passwordForAdmin)
    {
        By employeePasswordField=By.cssSelector("input[id='systemUser_password']");
        WebElement employeePasswordElement= webDriver.findElement(employeePasswordField);
        employeePasswordElement.sendKeys(passwordForAdmin);
    }
    public void enterConfirmPassword(String confirmPassword)
    {
        By confirmPasswordField=By.cssSelector("input[id='systemUser_confirmPassword']");
        WebElement confirmPasswordElement= webDriver.findElement(confirmPasswordField);
        confirmPasswordElement.sendKeys(confirmPassword);
    }
    public void clickOnSaveForAdmin()
    {
        By saveButton= By.id("btnSave");
        WebElement saveButtonElement= webDriver.findElement(saveButton);
        saveButtonElement.click();
    }
    public void enterUserNameForSearch(String employeeUserName)
    {
        By employeeUserNameFieldForSearch=By.cssSelector("input[id='searchSystemUser_userName']");
        WebElement employeeUserNameElementForSearch= webDriver.findElement(employeeUserNameFieldForSearch);
        employeeUserNameElementForSearch.sendKeys(employeeUserName);
    }
    public void clickOnSearchForAdmin()
    {
        By searchButton= By.id("searchBtn");
        WebElement searchButtonElement= webDriver.findElement(searchButton);
        searchButtonElement.click();
    }


}
