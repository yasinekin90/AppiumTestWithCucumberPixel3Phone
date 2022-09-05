$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/android.feature");
formatter.feature({
  "name": "Android",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wifi"
    }
  ]
});
formatter.scenario({
  "name": "verify wifi text",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wifi"
    }
  ]
});
formatter.step({
  "name": "navigate to apidemos and click preferences",
  "keyword": "Given "
});
formatter.match({
  "location": "AppiumTest.stepdefinitions.WififStepDefinitions.navigate_to_apidemos_and_click_preferences()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click preference dependencies",
  "keyword": "Then "
});
formatter.match({
  "location": "AppiumTest.stepdefinitions.WififStepDefinitions.click_preference_dependencies()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "activate wifi check box",
  "keyword": "And "
});
formatter.match({
  "location": "AppiumTest.stepdefinitions.WififStepDefinitions.activate_wifi_check_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click wifi settings",
  "keyword": "Then "
});
formatter.match({
  "location": "AppiumTest.stepdefinitions.WififStepDefinitions.click_wifi_settings()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "write holder \"thanks god appium has ended\" and click ok",
  "keyword": "And "
});
formatter.match({
  "location": "AppiumTest.stepdefinitions.WififStepDefinitions.write_holder_and_click_ok(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify written text in the holder",
  "keyword": "Then "
});
formatter.match({
  "location": "AppiumTest.stepdefinitions.WififStepDefinitions.verifyWrittenTextInTheHolder()"
});
formatter.result({
  "status": "passed"
});
});