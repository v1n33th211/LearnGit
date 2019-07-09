Feature:  App login

Scenario: Logging into the application 
Given user is in the landing page
When entered userName "vineeth" and passWord "abc" and clicked on sign-in
Then user is navigated to the home page
And various contents are displayed

Scenario: Logging into the application 
Given user is in the landing page
When entered userName "Menon" and passWord "cdg" and clicked on sign-in
Then user is navigated to the home page
And various contents are displayed