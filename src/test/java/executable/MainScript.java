package executable;

import base.BaseSetup;
import org.testng.annotations.Test;
import page.AdminPage;
import page.HomePage;
import page.LoginPage;
import page.PIMPage;

import java.util.concurrent.TimeUnit;

public class MainScript extends BaseSetup {
    /*@Test
    public  void testBase()
    {
        String userName= properties.getProperty("UserName");
        String password= properties.getProperty("Password");
        String expectedTitle=properties.getProperty("HomePageTitle");
        String firstName=properties.getProperty("FirstName");
        String lastName= properties.getProperty("LastName");
        String filePath= properties.getProperty("FilePath");
        String employeeName= properties.getProperty("EmployeeName");
        String empID= properties.getProperty("Id");
        String employeeNameForAdmin= properties.getProperty("EmployeeNameForAdmin");
        String employeeUserName= properties.getProperty("username");
        String passwordForAdmin= properties.getProperty("password");
        String confirmPassword= properties.getProperty("confirmPassword");


        LoginPage loginPage=new LoginPage(webDriver);
        loginPage.enterUserName(userName);
        loginPage.enterPassword(password);
        loginPage.clickOnLogin();

        HomePage homePage=new HomePage(webDriver);
        homePage.loginVerification(expectedTitle);

        PIMPage pimPage=new PIMPage(webDriver);
        pimPage.clickOnPIM();
        pimPage.clickOnAddEmployee();
        pimPage.enterFirstName(firstName);
        pimPage.enterLastName(lastName);
        pimPage.choosePhotograph(filePath);
        pimPage.clickOnSave();
        pimPage.clickOnEmployeeList();
        pimPage.enterEmployeeName(employeeName);
        pimPage.enterId(empID);
        pimPage.clickOnSearch();

        AdminPage adminPage=new AdminPage(webDriver);
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        adminPage.clickOnAdmin();
        adminPage.clickOnUserManagement();
        adminPage.clickOnAddButton();
        adminPage.enterEmployeeNameForAdmin(employeeNameForAdmin);
        adminPage.enterUserNameForAdminToAddUser(employeeUserName);
        adminPage.enterPasswordForAdmin(passwordForAdmin);
        adminPage.enterConfirmPassword(confirmPassword);
        adminPage.clickOnSaveForAdmin();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        adminPage.enterUserNameForSearch(employeeUserName);
        adminPage.clickOnSearchForAdmin();
    }
*/
}
