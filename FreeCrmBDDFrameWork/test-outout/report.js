$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Z:/Eclipse Workspace/FreeCrmBDDFrameWork/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "login;free-crm-login-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Customer Login",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is on myaccount page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "login;free-crm-login-test-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "login;free-crm-login-test-scenario;;1"
    },
    {
      "cells": [
        "jocktmp+mf8vy@gmail.com",
        "Welcome123!"
      ],
      "line": 13,
      "id": "login;free-crm-login-test-scenario;;2"
    },
    {
      "cells": [
        "c.amu.spa.m.m@gmail.com",
        "Noida@123"
      ],
      "line": 14,
      "id": "login;free-crm-login-test-scenario;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "login;free-crm-login-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Customer Login",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"jocktmp+mf8vy@gmail.com\" and \"Welcome123!\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is on myaccount page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 8216699700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_customer_login()"
});
formatter.result({
  "duration": 7588601,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jocktmp+mf8vy@gmail.com",
      "offset": 13
    },
    {
      "val": "Welcome123!",
      "offset": 43
    }
  ],
  "location": "LoginStepDefinition.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 3859354300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_myaccount_page()"
});
formatter.result({
  "duration": 20847800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 748629800,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "login;free-crm-login-test-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Customer Login",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"c.amu.spa.m.m@gmail.com\" and \"Noida@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is on myaccount page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 7876927600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_customer_login()"
});
formatter.result({
  "duration": 9452899,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "c.amu.spa.m.m@gmail.com",
      "offset": 13
    },
    {
      "val": "Noida@123",
      "offset": 43
    }
  ],
  "location": "LoginStepDefinition.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 3454922501,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_myaccount_page()"
});
formatter.result({
  "duration": 9027000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 742009199,
  "status": "passed"
});
});