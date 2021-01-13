Feature: OrangeHRM Functionality Feature
  The user login to OrangeHRM with valid username and password.
  The user creates a new Employee by filling details in AddEmployee under Pim.
  The user can search for their profile creation in Employee List under Pim.
  The user can create admin credentials using their employee profile and can search for their admin profile creation.

  Scenario Outline: OrangeHRM Functionality Scenario
    Given user is available on Login Page Of OrangeHRM
    Then user enters username from given sheetname as "<SheetName>" and rownumber "<RowNumber>"
    And user enters password from given sheetname as "<SheetName>" and rownumber "<RowNumber>"
    Then user clicks on Login Button
    And user verifies login verification from given sheetname as "<SheetName>" and rownumber "<RowNumber>"
    When user navigates to PIM Module
    Then user clicks on AddEmployee Option
    And user enters firstname from given sheetname as "<SheetName>" and rownumber "<RowNumber>"
    And user enters lastname from given sheetname as "<SheetName>" and rownumber "<RowNumber>"
    And user enters filepath for photograph from given sheetname as "<SheetName>" and rownumber "<RowNumber>"
    Then user clicks on save button
    And user clicks on Employee List
    Then user enters employee name from given sheetname as "<SheetName>" and rownumber "<RowNumber>"
    And user enters employee id from given sheetname as "<SheetName>" and rownumber "<RowNumber>"
    And user clicks on search Button
    When user navigates to Admin Module
    Then user clicks on UserManagement Option
    And user clicks on Add Button
    Then user enters employee name for admin from given sheetname as "<SheetName>" and rownumber "<RowNumber>"
    And user enters username for admin  from given sheetname as "<SheetName>" and rownumber "<RowNumber>"
    And user enters password for admin from given sheetname as "<SheetName>" and rownumber "<RowNumber>"
    And user enters confirm password from given sheetname as "<SheetName>" and rownumber "<RowNumber>"
    Then user clicks on save button for admin
    Then user enters system Username from given sheetname as "<SheetName>" and rownumber "<RowNumber>"
    And user clicks on search button for admin
    Examples:
      | SheetName | RowNumber |
      |Sheet1     |0  |

