Feature: Checking the booking functionality of the adactin hotel application 

Scenario: User checking the login page using valid username and password 
	Given user launch the application 
	When user enter the valid username in the username field 
	And user enter the valid password in the password field 
	And user clicks on the login button 
	And User searching the hotel location 
	And user searching the hotel 
	And user search the what kind of rooms avaiable in the hotel 
	And user select the rooms they wanted 
	And user clear the indate of the hotel 
	And user clear the outdate of the hotel 
	And user pick the indate of the hotel 
	And user pick the outdate of the hotel 
	And user pick the rooms for the adultsper room 
	And user pick the rooms for the childrenper room 
	And user search if these options are available in that hotel room 
	And user select that room 
	Then user countinues the future process 
	
Scenario: user searching the hotel for them 
	Given user enter the firstname in the firstname field 
	When user enter the lastname in the lastname field 
	And user enter the address in the address field 
	And user enter the creditcard type in the creditcard field 
	And user enter the creditcard no in the cardno field 
	And user enter the expirymonth of the creditcard 
	And user enter the expiryyear of the creditcard 
	And user enter the CVV of the creditcard 
	And user booking the select hotel 
	Then user select the myitinerary of the booking hotel 
