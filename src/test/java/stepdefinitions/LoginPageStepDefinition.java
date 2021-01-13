package stepdefinitions;

import base.BaseSetup;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import page.LoginPage;
import util.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class LoginPageStepDefinition extends BaseSetup {
    LoginPage loginPage;
    public LoginPageStepDefinition()
    {
        loginPage=new LoginPage(webDriver);
    }

   @Given("^user is available on Login Page Of OrangeHRM$")
    public void userIsAvailableOnLoginPageOfOrangeHRM()
    {
      loginPage.openApplication();
    }

    @Then("^user enters username from given sheetname as \"([^\"]*)\" and rownumber \"([^\"]*)\"$")
    public void userEntersUsernameFromGivenSheetnameAsAndRownumber(String sheetName, String arg1) throws IOException, InvalidFormatException {
        int rowNumber=Integer.parseInt(arg1);
        ExcelReader excelReader=new ExcelReader();
        List<Map<String,String>> testData=excelReader.getData("ExcelFiles\\OrangeHRMTestData.xlsx",sheetName);
        String userName=testData.get(rowNumber).get("UserName");
        loginPage.enterUserName(userName);
    }

    @And("^user enters password from given sheetname as \"([^\"]*)\" and rownumber \"([^\"]*)\"$")
    public void userEntersPasswordFromGivenSheetnameAsAndRownumber(String sheetName, String arg1) throws IOException, InvalidFormatException {
      int rowNumber=Integer.parseInt(arg1);
        ExcelReader excelReader=new ExcelReader();
        List<Map<String,String>> testData=excelReader.getData("ExcelFiles\\OrangeHRMTestData.xlsx",sheetName);
        String password=testData.get(rowNumber).get("Password");
        loginPage.enterPassword(password);
    }

    @Then("^user clicks on Login Button$")
    public void userClicksOnLoginButton() {
        loginPage.clickOnLogin();
    }


}
