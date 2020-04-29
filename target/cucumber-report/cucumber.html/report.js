$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/uk/barclays/co/recources/featurefile/register.feature");
formatter.feature({
  "line": 2,
  "name": "Register page feature",
  "description": "As a user I want to navigate to Registration page into barclays website",
  "id": "register-page-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Register"
    }
  ]
});
formatter.before({
  "duration": 12343626700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should navigate to registration page successfully",
  "description": "",
  "id": "register-page-feature;user-should-navigate-to-registration-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on Register link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should navigate to register page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 88033900,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTestSteps.iClickOnRegisterLink()"
});
formatter.result({
  "duration": 11523463200,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTestSteps.iShouldNavigateToRegisterPageSuccessfully()"
});
formatter.result({
  "duration": 77516700,
  "status": "passed"
});
formatter.after({
  "duration": 663768100,
  "status": "passed"
});
formatter.before({
  "duration": 11204986000,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User should navigate to user details page successfully",
  "description": "",
  "id": "register-page-feature;user-should-navigate-to-user-details-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on Register link",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click on start button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should navigate to your details page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 18800,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTestSteps.iClickOnRegisterLink()"
});
formatter.result({
  "duration": 11705053400,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTestSteps.iClickOnStartButton()"
});
formatter.result({
  "duration": 116184600,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTestSteps.iShouldNavigateToYourDetailsPageSuccessfully()"
});
formatter.result({
  "duration": 238233000,
  "status": "passed"
});
formatter.after({
  "duration": 662569600,
  "status": "passed"
});
});