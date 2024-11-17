Feature: Login

Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
When title of login page is Customer Login
Then user enters "<username>" and "<password>"
Then user is on myaccount page
Then Close the browser

Examples:
	| username | password |
	| jocktmp+mf8vy@gmail.com  | Welcome123! |
	|  c.amu.spa.m.m@gmail.com     | Noida@123  | 	
		