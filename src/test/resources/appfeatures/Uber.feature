
Feature: Uber booking feature

Scenario: Booking cab
Given User wants to select a car type "sedan" from uber app 
When user selects car "sedan" and pickup location "bangalore" and drop location "pune"
Then Driver starts the journey
And Driver ends the journey
Then user pays 1000 usd

