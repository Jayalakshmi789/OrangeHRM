Feature: OrangeHRm Application LogIn Test

Scenario Outline: Validating OrangeHRM Application LogIn Functionality Test

Given Open Chrome Browser and Navigate to OrangeHRM Application

When User eneters "<UserName>" and "<Password>" and click on logIn Button

Then User should be able to successfully LogIn to the Application and close the application

Examples:

| UserName | Password |

| jaya     | jaya1234 |

| jaya1234 | jaya     |
