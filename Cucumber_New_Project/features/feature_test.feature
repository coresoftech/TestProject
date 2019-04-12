Feature: Test iConnectYash smoke scenario
Description: The purpose of this feature is to test the Background keyword
 
 //Test Background Feature
 
Background: User is Logged In
 Given I navigate to the login page
 When I submit username and password
 Then I should be logged in 
 


	
	Scenario Outline: Test login with valid crendials  //For multiple data driven test
	Given  Open chrome and start application
	When I enter valid "<username>" and valid "<password>"	
	Then user should able to login into the application
	Then application should be closed
	 


	Examples:
	| username | password |
	| 1007518 | password1 |
	| 1007518 | password2 |
	| 1007518 | password3 |
	| 1007518 | password4 |
	
	

	Scenario: Successful LogOut
 When User LogOut from the Application
 Then Message displayed LogOut Successfully
 
 					
					
	
	
	