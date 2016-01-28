$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/Second.feature");
formatter.feature({
  "line": 1,
  "name": "Google Action2",
  "description": "",
  "id": "google-action2",
  "keyword": "Feature"
});
formatter.before({
  "duration": 173013,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Go to Google2",
  "description": "",
  "id": "google-action2;go-to-google2",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Google Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.verifyGooglePage()"
});
formatter.result({
  "duration": 3092514497,
  "status": "passed"
});
formatter.write("Current Page URL is https://www.google.com/");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 805835911,
  "status": "passed"
});
formatter.before({
  "duration": 59566,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Go to Google2",
  "description": "",
  "id": "google-action2;go-to-google2",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User is on Google Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.verifyGooglePage()"
});
formatter.result({
  "duration": 1646738735,
  "status": "passed"
});
formatter.write("Current Page URL is https://www.google.com/");
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 1223902080,
  "status": "passed"
});
});