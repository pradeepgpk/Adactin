$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ada.feature");
formatter.feature({
  "line": 1,
  "name": "To Test The Adactin Hotal Booking Application",
  "description": "",
  "id": "to-test-the-adactin-hotal-booking-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Check The Login Functionality",
  "description": "",
  "id": "to-test-the-adactin-hotal-booking-application;check-the-login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "launch The Adactin Hotal Booking Application Url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The Username \"\u003cuser\u003e\"In The Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The password \"\u003cpass\u003e\" In The Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click The Loginbutton and To Check The Search Hotal Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "to-test-the-adactin-hotal-booking-application;check-the-login-functionality;",
  "rows": [
    {
      "cells": [
        "user",
        "pass"
      ],
      "line": 10,
      "id": "to-test-the-adactin-hotal-booking-application;check-the-login-functionality;;1"
    },
    {
      "cells": [
        "Dinesh1993",
        "811BWB"
      ],
      "line": 11,
      "id": "to-test-the-adactin-hotal-booking-application;check-the-login-functionality;;2"
    },
    {
      "cells": [
        "pradeep",
        "3rwr3w"
      ],
      "line": 12,
      "id": "to-test-the-adactin-hotal-booking-application;check-the-login-functionality;;3"
    },
    {
      "cells": [
        "Dinesh1993",
        "811BWB"
      ],
      "line": 13,
      "id": "to-test-the-adactin-hotal-booking-application;check-the-login-functionality;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Check The Login Functionality",
  "description": "",
  "id": "to-test-the-adactin-hotal-booking-application;check-the-login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "launch The Adactin Hotal Booking Application Url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The Username \"Dinesh1993\"In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The password \"811BWB\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click The Loginbutton and To Check The Search Hotal Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.launch_The_Adactin_Hotal_Booking_Application_Url()"
});
formatter.result({
  "duration": 1835495000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dinesh1993",
      "offset": 25
    }
  ],
  "location": "StepDefinition.user_Enter_The_Username_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 122018000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "811BWB",
      "offset": 25
    }
  ],
  "location": "StepDefinition.user_Enter_The_password_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 86673700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Loginbutton_and_To_Check_The_Search_Hotal_Page()"
});
formatter.result({
  "duration": 358442400,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Check The Login Functionality",
  "description": "",
  "id": "to-test-the-adactin-hotal-booking-application;check-the-login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "launch The Adactin Hotal Booking Application Url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The Username \"pradeep\"In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The password \"3rwr3w\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click The Loginbutton and To Check The Search Hotal Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.launch_The_Adactin_Hotal_Booking_Application_Url()"
});
formatter.result({
  "duration": 371724100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pradeep",
      "offset": 25
    }
  ],
  "location": "StepDefinition.user_Enter_The_Username_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 73214800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3rwr3w",
      "offset": 25
    }
  ],
  "location": "StepDefinition.user_Enter_The_password_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 77870000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Loginbutton_and_To_Check_The_Search_Hotal_Page()"
});
formatter.result({
  "duration": 253258500,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Check The Login Functionality",
  "description": "",
  "id": "to-test-the-adactin-hotal-booking-application;check-the-login-functionality;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "launch The Adactin Hotal Booking Application Url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The Username \"Dinesh1993\"In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The password \"811BWB\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click The Loginbutton and To Check The Search Hotal Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.launch_The_Adactin_Hotal_Booking_Application_Url()"
});
formatter.result({
  "duration": 228155000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dinesh1993",
      "offset": 25
    }
  ],
  "location": "StepDefinition.user_Enter_The_Username_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 78548600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "811BWB",
      "offset": 25
    }
  ],
  "location": "StepDefinition.user_Enter_The_password_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 69549500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Loginbutton_and_To_Check_The_Search_Hotal_Page()"
});
formatter.result({
  "duration": 399714100,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "TO Check The Search Hotal Page",
  "description": "",
  "id": "to-test-the-adactin-hotal-booking-application;to-check-the-search-hotal-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "select The Room Location",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "select The Hotel Name",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "slect The Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "select Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "enter The Check In Date",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "enter The Check Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "select Adults Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "select Children Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Click The Searchbutton and To Check The Select Hotal Page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 26,
  "name": "To Check The Select Hotel Page Functionality",
  "description": "",
  "id": "to-test-the-adactin-hotal-booking-application;to-check-the-select-hotel-page-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "user Should Click The Hotel Page",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "user Should Click The  Continue button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 31,
  "name": "To Check The Booking Page",
  "description": "",
  "id": "to-test-the-adactin-hotal-booking-application;to-check-the-booking-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 33,
  "name": "user Should Insert The First Name",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "user Should Insert The Last Name",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Should Insert The Billing Address",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Should Insert The Credit Card Number",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Should Select The Credit Card Type",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Should Select The Expiry Date Month",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Should Select The Expiry Date Year",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Should Insert The CVV Number",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Should Click The BookNow button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 44,
  "name": "To Check The Logout Page",
  "description": "",
  "id": "to-test-the-adactin-hotal-booking-application;to-check-the-logout-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 46,
  "name": "user Should Logout",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});