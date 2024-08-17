
Feature: User registration

  Scenario: User registration with the following data 
    Given User is on registration page
			When The user enters the following details
	      |abhishek|anand|abhi@gmail.com|8987876754|Bangalore|
 		     |divya|mishra|div@gmail.com|8987876277|Lko|
   		   |supro|singh|supro@gmail.com|8787226754|Del|
      
      Then User reg is successful

