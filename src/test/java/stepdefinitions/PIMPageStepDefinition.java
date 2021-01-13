package stepdefinitions;

import base.BaseSetup;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.PIMPage;
import util.ExcelReader;

import java.util.List;
import java.util.Map;

public class PIMPageStepDefinition extends BaseSetup {
    PIMPage pimPage;
    public PIMPageStepDefinition()
    {
        pimPage=new PIMPage(webDriver);
    }
    @When("^user navigates to PIM Module$")
    public void userNavigatesToPIMModule()
    {
      pimPage.clickOnPIM();
    }

    @Then("^user clicks on AddEmployee Option$")
    public void userClicksOnAddEmployeeOption() {
      pimPage.clickOnAddEmployee();
    }
    @And("^user enters firstname from given sheetname as \"([^\"]*)\" and rownumber \"([^\"]*)\"$")
    public void userEntersFirstnameFromGivenSheetnameAsAndRownumber(String sheetName, String arg1) throws Throwable {
        int rowNumber=Integer.parseInt(arg1);
        ExcelReader excelReader=new ExcelReader();
        List<Map<String,String>> testData=excelReader.getData("ExcelFiles\\OrangeHRMTestData.xlsx",sheetName);
        String firstName=testData.get(rowNumber).get("FirstName");
        pimPage.enterFirstName(firstName);
    }

    @And("^user enters lastname from given sheetname as \"([^\"]*)\" and rownumber \"([^\"]*)\"$")
    public void userEntersLastnameFromGivenSheetnameAsAndRownumber(String sheetName, String arg1) throws Throwable {
        int rowNumber=Integer.parseInt(arg1);
        ExcelReader excelReader=new ExcelReader();
        List<Map<String,String>> testData=excelReader.getData("ExcelFiles\\OrangeHRMTestData.xlsx",sheetName);
        String lastName=testData.get(rowNumber).get("LastName");
        pimPage.enterLastName(lastName);

    }

    @And("^user enters filepath for photograph from given sheetname as \"([^\"]*)\" and rownumber \"([^\"]*)\"$")
    public void userEntersFilepathForPhotographFromGivenSheetnameAsAndRownumber(String sheetName, String arg1) throws Throwable {
        int rowNumber=Integer.parseInt(arg1);
        ExcelReader excelReader=new ExcelReader();
        List<Map<String,String>> testData=excelReader.getData("ExcelFiles\\OrangeHRMTestData.xlsx",sheetName);
        String filePath=testData.get(rowNumber).get("FilePath");
        pimPage.choosePhotograph(filePath);
    }

    @Then("^user clicks on save button$")
    public void userClicksOnSaveButton() {
       pimPage.clickOnSave();
    }

    @And("^user clicks on Employee List$")
    public void userClicksOnEmployeeList() {
        pimPage.clickOnEmployeeList();
    }
    @Then("^user enters employee name from given sheetname as \"([^\"]*)\" and rownumber \"([^\"]*)\"$")
    public void userEntersEmployeeNameFromGivenSheetnameAsAndRownumber(String sheetName, String arg1) throws Throwable {
        int rowNumber=Integer.parseInt(arg1);
        ExcelReader excelReader=new ExcelReader();
        List<Map<String,String>> testData=excelReader.getData("ExcelFiles\\OrangeHRMTestData.xlsx",sheetName);
        String employeeName=testData.get(rowNumber).get("EmployeeName");
        pimPage.enterEmployeeName(employeeName);
    }
    @And("^user enters employee id from given sheetname as \"([^\"]*)\" and rownumber \"([^\"]*)\"$")
    public void userEntersEmployeeIdFromGivenSheetnameAsAndRownumber(String sheetName, String arg1) throws Throwable {
        int rowNumber=Integer.parseInt(arg1);
        ExcelReader excelReader=new ExcelReader();
        List<Map<String,String>> testData=excelReader.getData("ExcelFiles\\OrangeHRMTestData.xlsx",sheetName);
        String employeeId=testData.get(rowNumber).get("Id");
        pimPage.enterEmployeeID(employeeId);
    }

    @And("^user clicks on search Button$")
    public void userClicksOnSearchButton() {
        pimPage.clickOnSearch();
    }


}
