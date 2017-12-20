$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/IBM_ADMIN/git/cucumberdemo/Feature/Demo.feature");
formatter.feature({
  "name": "Demo of thedemosite",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "client will launch the demo site and enter user ID, passward and perform validation",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Client will launch the demo site",
  "keyword": "When "
});
formatter.match({
  "location": "DemoSite.client_will_launch_the_demo_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the following data",
  "rows": [
    {
      "cells": [
        "Nagesh",
        "password"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "DemoSite.user_enters_the_following_data(DataTable)"
});
formatter.result({
  "status": "passed"
});
});