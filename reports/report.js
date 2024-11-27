$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/doc.feature");
formatter.feature({
  "name": "Automate TestLeaf Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "TC001_login and Loout",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Launch chrome browser and load url",
  "keyword": "Given "
});
formatter.step({
  "name": "enter username as \u003cusername\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "enter password as \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "click the login button",
  "keyword": "When "
});
formatter.step({
  "name": "its navigated Homepage",
  "keyword": "Then "
});
formatter.step({
  "name": "click the logout button",
  "keyword": "And "
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "DemoSalesManager",
        "crmsfa"
      ]
    },
    {
      "cells": [
        "DemoCSR",
        "crmsfa"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TC001_login and Loout",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Launch chrome browser and load url",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCases.launch_chrome_browser_and_load_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter username as DemoSalesManager",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.enter_username_as_demosalesmanager(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.enter_password_as_crmsfa(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "TestCases.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "its navigated Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCases.its_navigated_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the logout button",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.click_the_logout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC001_login and Loout",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Launch chrome browser and load url",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCases.launch_chrome_browser_and_load_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter username as DemoCSR",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.enter_username_as_demosalesmanager(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.enter_password_as_crmsfa(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "TestCases.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "its navigated Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCases.its_navigated_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the logout button",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.click_the_logout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TC003_verify TestLeaf CreateLead",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Launch chrome browser and load url",
  "keyword": "Given "
});
formatter.step({
  "name": "enter username as demosalesmanager",
  "keyword": "And "
});
formatter.step({
  "name": "enter password as crmsfa",
  "keyword": "And "
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "click CRMSFA",
  "keyword": "And "
});
formatter.step({
  "name": "click leads link",
  "keyword": "And "
});
formatter.step({
  "name": "click Create Lead link",
  "keyword": "When "
});
formatter.step({
  "name": "its navigated CreateLeadPage",
  "keyword": "And "
});
formatter.step({
  "name": "enter the company as \u003ccompanyname\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "enter the firstname as \u003cfirstname\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "enter the lastname as \u003clastname\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "choose source as Website",
  "keyword": "And "
});
formatter.step({
  "name": "click the Create Lead button",
  "keyword": "And "
});
formatter.step({
  "name": "its navigated ViewLeadPage",
  "keyword": "Then "
});
formatter.step({
  "name": "verify the firstname",
  "keyword": "And "
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "companyname",
        "firstname",
        "lastname"
      ]
    },
    {
      "cells": [
        "ABC",
        "Hema",
        "Mali"
      ]
    },
    {
      "cells": [
        "CBC",
        "Hema1",
        "Mali1"
      ]
    },
    {
      "cells": [
        "XYZ",
        "Gopi",
        "Nath"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TC003_verify TestLeaf CreateLead",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Launch chrome browser and load url",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCases.launch_chrome_browser_and_load_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter username as demosalesmanager",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.enter_username_as_demosalesmanager(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.enter_password_as_crmsfa(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click CRMSFA",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.click_CRMSFA()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click leads link",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.click_leads_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Create Lead link",
  "keyword": "When "
});
formatter.match({
  "location": "TestCases.click_Create_Lead_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "its navigated CreateLeadPage",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.its_navigated_CreateLeadPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the company as ABC",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.enter_the_company_as_ABC(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the firstname as Hema",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.enter_the_firstname_as_Hema(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the lastname as Mali",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.enter_the_lastname_as_Mali(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "choose source as Website",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.choose_source_as_Website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the Create Lead button",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.click_the_Create_Lead_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "its navigated ViewLeadPage",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCases.its_navigated_ViewLeadPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the firstname",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.verify_the_firstname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC003_verify TestLeaf CreateLead",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Launch chrome browser and load url",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCases.launch_chrome_browser_and_load_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter username as demosalesmanager",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.enter_username_as_demosalesmanager(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.enter_password_as_crmsfa(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click CRMSFA",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.click_CRMSFA()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click leads link",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.click_leads_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Create Lead link",
  "keyword": "When "
});
formatter.match({
  "location": "TestCases.click_Create_Lead_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "its navigated CreateLeadPage",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.its_navigated_CreateLeadPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the company as CBC",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.enter_the_company_as_ABC(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the firstname as Hema1",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.enter_the_firstname_as_Hema(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the lastname as Mali1",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.enter_the_lastname_as_Mali(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "choose source as Website",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.choose_source_as_Website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the Create Lead button",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.click_the_Create_Lead_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "its navigated ViewLeadPage",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCases.its_navigated_ViewLeadPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the firstname",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.verify_the_firstname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC003_verify TestLeaf CreateLead",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Launch chrome browser and load url",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCases.launch_chrome_browser_and_load_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter username as demosalesmanager",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.enter_username_as_demosalesmanager(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password as crmsfa",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.enter_password_as_crmsfa(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click CRMSFA",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.click_CRMSFA()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click leads link",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.click_leads_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Create Lead link",
  "keyword": "When "
});
formatter.match({
  "location": "TestCases.click_Create_Lead_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "its navigated CreateLeadPage",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.its_navigated_CreateLeadPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the company as XYZ",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.enter_the_company_as_ABC(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the firstname as Gopi",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.enter_the_firstname_as_Hema(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the lastname as Nath",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.enter_the_lastname_as_Mali(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "choose source as Website",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.choose_source_as_Website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the Create Lead button",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.click_the_Create_Lead_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "its navigated ViewLeadPage",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCases.its_navigated_ViewLeadPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the firstname",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.verify_the_firstname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.close_browser()"
});
formatter.result({
  "status": "passed"
});
});