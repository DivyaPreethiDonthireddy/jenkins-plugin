package stepdefinitions;

import base.BaseSetup;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.AdminPage;
import util.ExcelReader;

import java.util.List;
import java.util.Map;

public class AdminPageStepDefinition extends BaseSetup {
    AdminPage adminPage;
    public AdminPageStepDefinition()
    {
        adminPage=new AdminPage(webDriver);
    }
    @When("^user navigates to Admin Module$")
    public void userNavigatesToAdminModule()
    {
     adminPage.clickOnAdmin();
    }

    @Then("^user clicks on UserManagement Option$")
    public void userClicksOnUserManagementOption() {
      adminPage.clickOnUserManagement();
    }

    @And("^user clicks on Add Button$")
    public void userClicksOnAddButton() {
      adminPage.clickOnAddButton();
    }

    @Then("^user enters employee name for admin from given sheetname as \"([^\"]*)\" and rownumber \"([^\"]*)\"$")
    public void userEntersEmployeeNameForAdminFromGivenSheetnameAsAndRownumber(String sheetName, String arg1) throws Throwable {
        int rowNumber=Integer.parseInt(arg1);
        ExcelReader excelReader=new ExcelReader();
        List<Map<String,String>> testData=excelReader.getData("ExcelFiles\\OrangeHRMTestData.xlsx",sheetName);
        String employeeName=testData.get(rowNumber).get("EmployeeName");
        adminPage.enterEmployeeNameForAdmin(employeeName);
    }

    @And("^user enters username for admin  from given sheetname as \"([^\"]*)\" and rownumber \"([^\"]*)\"$")
    public void userEntersUsernameForAdminFromGivenSheetnameAsAndRownumber(String sheetName, String arg1) throws Throwable {
        int rowNumber=Integer.parseInt(arg1);
        ExcelReader excelReader=new ExcelReader();
        List<Map<String,String>> testData=excelReader.getData("ExcelFiles\\OrangeHRMTestData.xlsx",sheetName);
        String adminUserName=testData.get(rowNumber).get("AdminUserName");
        adminPage.enterUserNameForAdminToAddUser(adminUserName);
    }

    @And("^user enters password for admin from given sheetname as \"([^\"]*)\" and rownumber \"([^\"]*)\"$")
    public void userEntersPasswordForAdminFromGivenSheetnameAsAndRownumber(String sheetName, String arg1) throws Throwable {
        int rowNumber=Integer.parseInt(arg1);
        ExcelReader excelReader=new ExcelReader();
        List<Map<String,String>> testData=excelReader.getData("ExcelFiles\\OrangeHRMTestData.xlsx",sheetName);
        String adminPassword=testData.get(rowNumber).get("AdminPassword");
        adminPage.enterPasswordForAdmin(adminPassword);
    }

    @And("^user enters confirm password from given sheetname as \"([^\"]*)\" and rownumber \"([^\"]*)\"$")
    public void userEntersConfirmPasswordFromGivenSheetnameAsAndRownumber(String sheetName, String arg1) throws Throwable {
        int rowNumber=Integer.parseInt(arg1);
        ExcelReader excelReader=new ExcelReader();
        List<Map<String,String>> testData=excelReader.getData("ExcelFiles\\OrangeHRMTestData.xlsx",sheetName);
        String confirmPassword=testData.get(rowNumber).get("ConfirmPassword");
        adminPage.enterConfirmPassword(confirmPassword);
    }

    @Then("^user clicks on save button for admin$")
    public void userClicksOnSaveButtonForAdmin() {
        adminPage.clickOnSaveForAdmin();
    }

    @Then("^user enters system Username from given sheetname as \"([^\"]*)\" and rownumber \"([^\"]*)\"$")
    public void userEntersSystemUsernameFromGivenSheetnameAsAndRownumber(String sheetName, String arg1) throws Throwable {
        int rowNumber=Integer.parseInt(arg1);
        ExcelReader excelReader=new ExcelReader();
        List<Map<String,String>> testData=excelReader.getData("ExcelFiles\\OrangeHRMTestData.xlsx",sheetName);
        String systemUserName=testData.get(rowNumber).get("AdminUserName");
        adminPage.enterUserNameForSearch(systemUserName);
    }
    @And("^user clicks on search button for admin$")
    public void userClicksOnSearchButtonForAdmin() {
        adminPage.clickOnSearchForAdmin();
    }

}
