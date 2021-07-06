$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Admin.feature");
formatter.feature({
  "line": 1,
  "name": "Filter  functionality",
  "description": "I want to use this template for my feature file",
  "id": "filter--functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "verify home page",
  "description": "",
  "id": "filter--functionality;verify-home-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Admin"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am in home page and enter  username \"\u003cusername\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I  click on Admin tab",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter username for testadmin \"\u003cusername1\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I select user role \"\u003cselectrole\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter EmployeeName \"\u003cEmployeeName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I select Status \"\u003cStatus\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I click on search button",
  "keyword": "When "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "filter--functionality;verify-home-page;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "username1",
        "selectrole",
        "EmployeeName",
        "Status"
      ],
      "line": 15,
      "id": "filter--functionality;verify-home-page;;1"
    },
    {
      "cells": [
        "Admin",
        "admin123",
        "admin",
        "Admin",
        "admin",
        "Enabled"
      ],
      "line": 16,
      "id": "filter--functionality;verify-home-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "verify home page",
  "description": "",
  "id": "filter--functionality;verify-home-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Admin"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am in home page and enter  username \"Admin\" and password \"admin123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I  click on Admin tab",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter username for testadmin \"admin\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I select user role \"Admin\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter EmployeeName \"admin\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I select Status \"Enabled\"",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I click on search button",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 39
    },
    {
      "val": "admin123",
      "offset": 60
    }
  ],
  "location": "AdminPageTest.i_am_in_home_page_and_enter_username_and_password(String,String)"
});
formatter.result({
  "duration": 22726514300,
  "status": "passed"
});
formatter.match({
  "location": "AdminPageTest.i_click_on_Admin_tab()"
});
formatter.result({
  "duration": 1950808300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 32
    }
  ],
  "location": "AdminPageTest.i_enter_username_Admin(String)"
});
formatter.result({
  "duration": 84055100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 20
    }
  ],
  "location": "AdminPageTest.i_select_user_role(String)"
});
formatter.result({
  "duration": 158538100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 22
    }
  ],
  "location": "AdminPageTest.i_enter_EmployeeName(String)"
});
formatter.result({
  "duration": 83150000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enabled",
      "offset": 17
    }
  ],
  "location": "AdminPageTest.i_select_Status(String)"
});
formatter.result({
  "duration": 130698700,
  "status": "passed"
});
formatter.match({
  "location": "AdminPageTest.i_click_on_search_button()"
});
formatter.result({
  "duration": 1345870500,
  "status": "passed"
});
});