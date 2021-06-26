$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Facebook.feature");
formatter.feature({
  "name": "Validation of loginpage",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add Customer Validation",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "user fill up the details",
  "rows": [
    {
      "cells": [
        "Suriyakumar900@gmail.com",
        "Suriyakumar123"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "FacebookLogin.user_fill_up_the_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLogin.user_click_on_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user verifies home page",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookLogin.user_verifies_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});