Spring Cloud Security Oauth2 authentication with github:

What does this Error-Handling-service do?

	This is a spring boot application which implements spring security oauth2 authentication. It helps to authenticate the user by using github. After authentication only the application will allow the user to access the apis or the application.
	
Special Requirement: 

	1. For setting up the project you will have register an application in github.
	2. Go to developer section of github and register for an app.
	3. After registration it will give you:
			a. client-id
			b. client-secret
	4. Register application and enter url like, http://localhost:8080 
	5. Now configure everything as has been done in the application.yml
	
		

Installation:

	1. This is a gradle project.
	2. Import the project in STS Tool Suits.
	3. Build the project.
	4. Before launching the application kindly enter the *Client-id* and *Client Secret*


How to run:

	1. Run the project
	2. Go to http://localhost:8080/check into your browser
	3. It will ask for user and password.
	4. Go With your github username and password


