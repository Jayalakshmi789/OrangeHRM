Feature: NewTours Application Login Test

Scenario Outline: validating NewTours Application Login Functionality Test

Given Open Chrome Browser and Navigate To NewTours Application

When User enters "<UserName>" and "<Password>" and Click on SignIn Button

Then User Should be able to successfully LogIn to the Application and Close the Application

Examples:

| UserName | Password |

| tutorial | tutorial |

| hello | chello |

| mercury | mercury |

