$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/featuresVue/Vue_EndtoEndTests.Feature");
formatter.feature({
  "line": 1,
  "name": "Automated E2E Tests",
  "description": "Description: Creating Todo list, completing existing tasks and removing tasks",
  "id": "automated-e2e-tests",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3821806363,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Create, Mark \u0026 Remove Todo List",
  "description": "",
  "id": "automated-e2e-tests;create,-mark-\u0026-remove-todo-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Launch URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Add Task in Todo list \"To Comb\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Mark Task as completed",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Remove Completed Task",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.launch_URL()"
});
formatter.result({
  "duration": 1886511909,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "To Comb",
      "offset": 23
    }
  ],
  "location": "Stepdefinition.add_Task_in_Todo_list(String)"
});
formatter.result({
  "duration": 388400527,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.mark_Task_as_completed()"
});
formatter.result({
  "duration": 1060764569,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.remove_Completed_Task()"
});
formatter.result({
  "duration": 1057833056,
  "status": "passed"
});
formatter.after({
  "duration": 148570803,
  "status": "passed"
});
formatter.before({
  "duration": 1507123160,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Create, Mark as completed \u0026 Remove Multiple Todo List",
  "description": "",
  "id": "automated-e2e-tests;create,-mark-as-completed-\u0026-remove-multiple-todo-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "Launch URL",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Add Task in Todo list \"To Comb\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Add Task in Todo list \"To Iron\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Add Task in Todo list \"To Wash\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Mark Task as completed",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Remove Completed Task",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.launch_URL()"
});
formatter.result({
  "duration": 521111948,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "To Comb",
      "offset": 23
    }
  ],
  "location": "Stepdefinition.add_Task_in_Todo_list(String)"
});
formatter.result({
  "duration": 227573236,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "To Iron",
      "offset": 23
    }
  ],
  "location": "Stepdefinition.add_Task_in_Todo_list(String)"
});
formatter.result({
  "duration": 126120292,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "To Wash",
      "offset": 23
    }
  ],
  "location": "Stepdefinition.add_Task_in_Todo_list(String)"
});
formatter.result({
  "duration": 103672305,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.mark_Task_as_completed()"
});
formatter.result({
  "duration": 1088727603,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.remove_Completed_Task()"
});
formatter.result({
  "duration": 1058991313,
  "status": "passed"
});
formatter.after({
  "duration": 80448431,
  "status": "passed"
});
});