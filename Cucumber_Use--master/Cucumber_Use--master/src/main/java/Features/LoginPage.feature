Feature: Free CRM login page

Scenario: Test for login Page

Given User is on login page
When User enters user name and password
Then User clicks on login button
Then it should land on Home page