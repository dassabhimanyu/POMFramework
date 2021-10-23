Feature: Login 
  
Scenario: Sucessful Login with Valid Credentials
	Given Launch Browser 
    When open URL and click on SIGNIN for user login
    Then UserentersUserID as "9654897582" then Click on Continue then Enter Password "abhi@1289"
    Then clickonLogin button
    Then Close browser
    
 
   
    