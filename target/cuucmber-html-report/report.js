$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/OrangeHRM.feature");
formatter.feature({
  "line": 1,
  "name": "OrangeHRM Functionality Feature",
  "description": "The user login to OrangeHRM with valid username and password.\r\nThe user creates a new Employee by filling details in AddEmployee under Pim.\r\nThe user can search for their profile creation in Employee List under Pim.\r\nThe user can create admin credentials using their employee profile and can search for their admin profile creation.",
  "id": "orangehrm-functionality-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "OrangeHRM Functionality Scenario",
  "description": "",
  "id": "orangehrm-functionality-feature;orangehrm-functionality-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "user is available on Login Page Of OrangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user enters username from given sheetname as \"\u003cSheetName\u003e\" and rownumber \"\u003cRowNumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters password from given sheetname as \"\u003cSheetName\u003e\" and rownumber \"\u003cRowNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user verifies login verification from given sheetname as \"\u003cSheetName\u003e\" and rownumber \"\u003cRowNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user navigates to PIM Module",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user clicks on AddEmployee Option",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user enters firstname from given sheetname as \"\u003cSheetName\u003e\" and rownumber \"\u003cRowNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user enters lastname from given sheetname as \"\u003cSheetName\u003e\" and rownumber \"\u003cRowNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user enters filepath for photograph from given sheetname as \"\u003cSheetName\u003e\" and rownumber \"\u003cRowNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user clicks on save button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user clicks on Employee List",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user enters employee name from given sheetname as \"\u003cSheetName\u003e\" and rownumber \"\u003cRowNumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user enters employee id from given sheetname as \"\u003cSheetName\u003e\" and rownumber \"\u003cRowNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user clicks on search Button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user navigates to Admin Module",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user clicks on UserManagement Option",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user clicks on Add Button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user enters employee name for admin from given sheetname as \"\u003cSheetName\u003e\" and rownumber \"\u003cRowNumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user enters username for admin  from given sheetname as \"\u003cSheetName\u003e\" and rownumber \"\u003cRowNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user enters password for admin from given sheetname as \"\u003cSheetName\u003e\" and rownumber \"\u003cRowNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user enters confirm password from given sheetname as \"\u003cSheetName\u003e\" and rownumber \"\u003cRowNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user clicks on save button for admin",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "user enters system Username from given sheetname as \"\u003cSheetName\u003e\" and rownumber \"\u003cRowNumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "user clicks on search button for admin",
  "keyword": "And "
});
formatter.examples({
  "line": 33,
  "name": "",
  "description": "",
  "id": "orangehrm-functionality-feature;orangehrm-functionality-scenario;",
  "rows": [
    {
      "cells": [
        "SheetName",
        "RowNumber"
      ],
      "line": 34,
      "id": "orangehrm-functionality-feature;orangehrm-functionality-scenario;;1"
    },
    {
      "cells": [
        "Sheet1",
        "0"
      ],
      "line": 35,
      "id": "orangehrm-functionality-feature;orangehrm-functionality-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 13789917000,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "OrangeHRM Functionality Scenario",
  "description": "",
  "id": "orangehrm-functionality-feature;orangehrm-functionality-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "user is available on Login Page Of OrangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user enters username from given sheetname as \"Sheet1\" and rownumber \"0\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters password from given sheetname as \"Sheet1\" and rownumber \"0\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user verifies login verification from given sheetname as \"Sheet1\" and rownumber \"0\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user navigates to PIM Module",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user clicks on AddEmployee Option",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user enters firstname from given sheetname as \"Sheet1\" and rownumber \"0\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user enters lastname from given sheetname as \"Sheet1\" and rownumber \"0\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user enters filepath for photograph from given sheetname as \"Sheet1\" and rownumber \"0\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user clicks on save button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user clicks on Employee List",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user enters employee name from given sheetname as \"Sheet1\" and rownumber \"0\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user enters employee id from given sheetname as \"Sheet1\" and rownumber \"0\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user clicks on search Button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user navigates to Admin Module",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user clicks on UserManagement Option",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user clicks on Add Button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user enters employee name for admin from given sheetname as \"Sheet1\" and rownumber \"0\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user enters username for admin  from given sheetname as \"Sheet1\" and rownumber \"0\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user enters password for admin from given sheetname as \"Sheet1\" and rownumber \"0\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user enters confirm password from given sheetname as \"Sheet1\" and rownumber \"0\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user clicks on save button for admin",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "user enters system Username from given sheetname as \"Sheet1\" and rownumber \"0\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "user clicks on search button for admin",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStepDefinition.userIsAvailableOnLoginPageOfOrangeHRM()"
});
formatter.result({
  "duration": 4698094200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sheet1",
      "offset": 46
    },
    {
      "val": "0",
      "offset": 69
    }
  ],
  "location": "LoginPageStepDefinition.userEntersUsernameFromGivenSheetnameAsAndRownumber(String,String)"
});
formatter.result({
  "duration": 4196268800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sheet1",
      "offset": 46
    },
    {
      "val": "0",
      "offset": 69
    }
  ],
  "location": "LoginPageStepDefinition.userEntersPasswordFromGivenSheetnameAsAndRownumber(String,String)"
});
formatter.result({
  "duration": 183986600,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefinition.userClicksOnLoginButton()"
});
formatter.result({
  "duration": 5469495400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sheet1",
      "offset": 58
    },
    {
      "val": "0",
      "offset": 81
    }
  ],
  "location": "HomePageStepDefinition.userVerifiesLoginVerificationFromGivenSheetnameAsAndRownumber(String,String)"
});
formatter.result({
  "duration": 127525700,
  "status": "passed"
});
formatter.match({
  "location": "PIMPageStepDefinition.userNavigatesToPIMModule()"
});
formatter.result({
  "duration": 189371300,
  "status": "passed"
});
formatter.match({
  "location": "PIMPageStepDefinition.userClicksOnAddEmployeeOption()"
});
formatter.result({
  "duration": 1066022600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sheet1",
      "offset": 47
    },
    {
      "val": "0",
      "offset": 70
    }
  ],
  "location": "PIMPageStepDefinition.userEntersFirstnameFromGivenSheetnameAsAndRownumber(String,String)"
});
formatter.result({
  "duration": 221601800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sheet1",
      "offset": 46
    },
    {
      "val": "0",
      "offset": 69
    }
  ],
  "location": "PIMPageStepDefinition.userEntersLastnameFromGivenSheetnameAsAndRownumber(String,String)"
});
formatter.result({
  "duration": 169464400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sheet1",
      "offset": 61
    },
    {
      "val": "0",
      "offset": 84
    }
  ],
  "location": "PIMPageStepDefinition.userEntersFilepathForPhotographFromGivenSheetnameAsAndRownumber(String,String)"
});
formatter.result({
  "duration": 137852400,
  "status": "passed"
});
formatter.match({
  "location": "PIMPageStepDefinition.userClicksOnSaveButton()"
});
formatter.result({
  "duration": 3698429600,
  "status": "passed"
});
formatter.match({
  "location": "PIMPageStepDefinition.userClicksOnEmployeeList()"
});
formatter.result({
  "duration": 1237403200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sheet1",
      "offset": 51
    },
    {
      "val": "0",
      "offset": 74
    }
  ],
  "location": "PIMPageStepDefinition.userEntersEmployeeNameFromGivenSheetnameAsAndRownumber(String,String)"
});
formatter.result({
  "duration": 585160400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sheet1",
      "offset": 49
    },
    {
      "val": "0",
      "offset": 72
    }
  ],
  "location": "PIMPageStepDefinition.userEntersEmployeeIdFromGivenSheetnameAsAndRownumber(String,String)"
});
formatter.result({
  "duration": 139755700,
  "status": "passed"
});
formatter.match({
  "location": "PIMPageStepDefinition.userClicksOnSearchButton()"
});
formatter.result({
  "duration": 600683400,
  "status": "passed"
});
formatter.match({
  "location": "AdminPageStepDefinition.userNavigatesToAdminModule()"
});
formatter.result({
  "duration": 1344779500,
  "status": "passed"
});
formatter.match({
  "location": "AdminPageStepDefinition.userClicksOnUserManagementOption()"
});
formatter.result({
  "duration": 77399300,
  "status": "passed"
});
formatter.match({
  "location": "AdminPageStepDefinition.userClicksOnAddButton()"
});
formatter.result({
  "duration": 741170600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sheet1",
      "offset": 61
    },
    {
      "val": "0",
      "offset": 84
    }
  ],
  "location": "AdminPageStepDefinition.userEntersEmployeeNameForAdminFromGivenSheetnameAsAndRownumber(String,String)"
});
formatter.result({
  "duration": 251094500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sheet1",
      "offset": 57
    },
    {
      "val": "0",
      "offset": 80
    }
  ],
  "location": "AdminPageStepDefinition.userEntersUsernameForAdminFromGivenSheetnameAsAndRownumber(String,String)"
});
formatter.result({
  "duration": 195497100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sheet1",
      "offset": 56
    },
    {
      "val": "0",
      "offset": 79
    }
  ],
  "location": "AdminPageStepDefinition.userEntersPasswordForAdminFromGivenSheetnameAsAndRownumber(String,String)"
});
formatter.result({
  "duration": 241618400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sheet1",
      "offset": 54
    },
    {
      "val": "0",
      "offset": 77
    }
  ],
  "location": "AdminPageStepDefinition.userEntersConfirmPasswordFromGivenSheetnameAsAndRownumber(String,String)"
});
formatter.result({
  "duration": 191534300,
  "status": "passed"
});
formatter.match({
  "location": "AdminPageStepDefinition.userClicksOnSaveButtonForAdmin()"
});
formatter.result({
  "duration": 88852900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sheet1",
      "offset": 53
    },
    {
      "val": "0",
      "offset": 76
    }
  ],
  "location": "AdminPageStepDefinition.userEntersSystemUsernameFromGivenSheetnameAsAndRownumber(String,String)"
});
formatter.result({
  "duration": 9000590200,
  "status": "passed"
});
formatter.match({
  "location": "AdminPageStepDefinition.userClicksOnSearchButtonForAdmin()"
});
formatter.result({
  "duration": 563762600,
  "status": "passed"
});
formatter.after({
  "duration": 1507439000,
  "status": "passed"
});
});