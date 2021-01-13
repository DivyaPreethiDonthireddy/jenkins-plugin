package stepdefinitions;

import base.BaseSetup;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import page.HomePage;
import util.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class HomePageStepDefinition extends BaseSetup {
    HomePage homePage;
    public HomePageStepDefinition()
    {
        homePage=new HomePage(webDriver);
    }

    @And("^user verifies login verification from given sheetname as \"([^\"]*)\" and rownumber \"([^\"]*)\"$")
    public void userVerifiesLoginVerificationFromGivenSheetnameAsAndRownumber(String sheetName, String arg1) throws IOException, InvalidFormatException {
        int rowNumber=Integer.parseInt(arg1);
        ExcelReader excelReader=new ExcelReader();
        List<Map<String,String>> testData=excelReader.getData("ExcelFiles\\OrangeHRMTestData.xlsx",sheetName);
        String expectedTitle=testData.get(rowNumber).get("HomePageTitle");
        homePage.loginVerification(expectedTitle);
    }
}
