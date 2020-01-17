$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/FsdrLogin.feature");
formatter.feature({
  "name": "LoginFeature",
  "description": "  This feature deals with the login functionality of the application",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenario({
  "name": "Login with correct username and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "fsdrLogin.i_navigate_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the following Credentials for Login",
  "keyword": "And "
});
formatter.match({
  "location": "fsdrLogin.i_enter_the_following_Credentials_for_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "fsdrLogin.i_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the userform page",
  "keyword": "Then "
});
formatter.match({
  "location": "fsdrLogin.i_should_see_the_userform_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});