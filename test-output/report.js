$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/LoginPage.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Sucessful Login with Valid Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Launch Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Login_Steps.launch_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "open URL and click on SIGNIN for user login",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Login_Steps.open_URL_and_click_on_SIGNIN_for_user_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "UserentersUserID as \"9654897582\" then Click on Continue then Enter Password \"abhi@1289\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Login_Steps.userentersuserid_as_then_Click_on_Continue_then_Enter_Password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clickonLogin button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Login_Steps.clickonlogin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Login_Steps.Close_browser()"
});
formatter.result({
  "status": "passed"
});
});