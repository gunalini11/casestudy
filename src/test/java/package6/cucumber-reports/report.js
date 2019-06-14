$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:package6/testmeapp.feature");
formatter.feature({
  "name": "testme",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Testmeapp",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "user enter username and password and logins",
  "keyword": "Given "
});
formatter.match({
  "location": "tesesetup.user_enter_username_and_password_and_logins()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select the product",
  "keyword": "And "
});
formatter.match({
  "location": "tesesetup.select_the_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user proceed for payement",
  "keyword": "Then "
});
formatter.match({
  "location": "tesesetup.user_proceed_for_payement()"
});
formatter.result({
  "status": "passed"
});
});