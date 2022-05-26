Feature: Automated E2E Tests
Description: Creating Todo list, completing existing tasks and removing tasks 

@Basic
Scenario Outline: Create, Mark & Remove Todo List
	Given Launch URL
	When Add Task in Todo list "<Task1>"
	And Mark Task as completed
	Then Remove Completed Task
	Examples:
					|Task1|
					|To Manage todo list|
@Multiple
	Scenario Outline: Create, Mark as completed & Remove Multiple Todo List
	Given Launch URL
	When Add Task in Todo list "<Task1>"
	When Add Task in Todo list "<Task2>"
	When Add Task in Todo list "<Task3>"
	When Add Task in Todo list "<Task4>"
	And Mark Task as completed
	Then Remove Completed Task
	Examples:
					|Task1|Task2|Task3|Task4|
					|To Iron|To Comb|To Wash|To Dressup|