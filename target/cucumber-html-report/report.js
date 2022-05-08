$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:UserRegitiration.feature");
formatter.feature({
  "name": "user registration",
  "description": "\tI want to check that the user can register in our commerce website.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "user registraion",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user in the home page",
  "keyword": "Given "
});
formatter.step({
  "name": "he click on register link",
  "keyword": "When "
});
formatter.step({
  "name": "he entered  \t\"\u003cfirsName\u003e\" , \"\u003clastName\u003e\", \"\u003cemail\u003e\", \"\u003ccompanyName\u003e\" , \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the registration page displayed sucsessfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firsName",
        "lastName",
        "email",
        "companyName",
        "password"
      ]
    },
    {
      "cells": [
        "hafdvssan",
        "morkgos",
        "hosdr@nana.com",
        "xoxo",
        "123456ss"
      ]
    },
    {
      "cells": [
        "hassavfdn",
        "morkaos",
        "hmbsr@nana.com",
        "xoxo",
        "123456ss"
      ]
    },
    {
      "cells": [
        "hassdfvsan",
        "morskos",
        "hmor@nana.com",
        "xoxo",
        "123456ss"
      ]
    }
  ]
});
formatter.scenario({
  "name": "user registraion",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user in the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "UserRegistration.the_user_in_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he click on register link",
  "keyword": "When "
});
formatter.match({
  "location": "UserRegistration.he_click_on_register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he entered  \t\"hafdvssan\" , \"morkgos\", \"hosdr@nana.com\", \"xoxo\" , \"123456ss\"",
  "keyword": "And "
});
formatter.match({
  "location": "UserRegistration.he_entered(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the registration page displayed sucsessfully",
  "keyword": "Then "
});
formatter.match({
  "location": "UserRegistration.the_registration_page_displayed_sucsessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user registraion",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user in the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "UserRegistration.the_user_in_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he click on register link",
  "keyword": "When "
});
formatter.match({
  "location": "UserRegistration.he_click_on_register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he entered  \t\"hassavfdn\" , \"morkaos\", \"hmbsr@nana.com\", \"xoxo\" , \"123456ss\"",
  "keyword": "And "
});
formatter.match({
  "location": "UserRegistration.he_entered(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the registration page displayed sucsessfully",
  "keyword": "Then "
});
formatter.match({
  "location": "UserRegistration.the_registration_page_displayed_sucsessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user registraion",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user in the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "UserRegistration.the_user_in_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he click on register link",
  "keyword": "When "
});
formatter.match({
  "location": "UserRegistration.he_click_on_register_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he entered  \t\"hassdfvsan\" , \"morskos\", \"hmor@nana.com\", \"xoxo\" , \"123456ss\"",
  "keyword": "And "
});
formatter.match({
  "location": "UserRegistration.he_entered(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the registration page displayed sucsessfully",
  "keyword": "Then "
});
formatter.match({
  "location": "UserRegistration.the_registration_page_displayed_sucsessfully()"
});
formatter.result({
  "status": "passed"
});
});