Feature: This is login page automation of saucedemo app

Scenario: Checking if user is able to login successfully using valid creds

Given User is on Login page
When User enters valid credentials for username and password
And Clicks on Login Button
Then User is navigated to Home page
And Close the browser


