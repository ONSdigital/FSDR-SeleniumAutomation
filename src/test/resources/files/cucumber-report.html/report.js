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
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I enter the following Credentials for Login",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I click login button",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I should see the userform page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/features/SearchResults.feature");
formatter.feature({
  "name": "SearchResults",
  "description": "  This feature deals with the search functionality of the application",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@SearchResults"
    }
  ]
});
formatter.scenario({
  "name": "Search for a user in fsdr",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SearchResults"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "fsdr user is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchResults.fsdrUserIsLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "searches for a field worker",
  "keyword": "And "
});
formatter.match({
  "location": "SearchResults.searchesForAFieldWorker()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "field worker results will be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchResults.fieldWorkerResultsWillBeDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a field worker can then be viewed",
  "keyword": "And "
});
formatter.match({
  "location": "SearchResults.aFieldWorkerCanThenBeViewed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});