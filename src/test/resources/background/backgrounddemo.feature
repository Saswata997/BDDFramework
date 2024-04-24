Feature: This is background demo

Background: User is logged in to the saucedemo App
Given User acess the saucedemo app login page
When User enters valid username and password
Then User should be able to navigate to the Home Page



Scenario: Test Menu Items

And Clicks on breadcrumb icon
Then User should be able to see the menu items

Scenario: Verify add to cart functionality

And Clicks on Add to Cart button
Then Item should be add to the cart


