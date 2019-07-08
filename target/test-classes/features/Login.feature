Feature:  App login

Scenario: Logging into the application 
Given user is in the landing page
When entered "userName" and "passWord" and clicked on sign-in
Then user is navigated to the home page
And various contents are displayed
