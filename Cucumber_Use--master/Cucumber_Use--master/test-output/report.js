$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/LENOVO/workspace/crm.cucumber.qa.test/src/main/java/Features/LoginPage.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM login page",
  "description": "",
  "id": "free-crm-login-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 20353310615,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Test for login Page",
  "description": "",
  "id": "free-crm-login-page;test-for-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters user name and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "it should land on Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageTest.user_is_on_login_page()"
});
formatter.result({
  "duration": 165861838,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTest.user_enters_user_name_and_password()"
});
formatter.result({
  "duration": 384751961,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTest.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 23817600117,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTest.it_should_land_on_Home_page()"
});
formatter.result({
  "duration": 13724037,
  "status": "passed"
});
formatter.after({
  "duration": 4141578669,
  "status": "passed"
});
});