Feature: CM-CR30.1
 
Scenario: CM-CR30.1 Worklog Manager  WQ icon
	Given Launch Browser
    When User open URL "https://bkc-qa.guidingcare.com/Portal/Account/Login"
    Then UserentersUserID as "autocarecoord" and Password "Welcome@1234"
    Then clickonLogin button
   	Then Hover over the Manage icon and click Worklog Manager
   	Then Validate the Accepted and Pending Acceptance activities display as expected
   	Then Validate the Assigned By and Activity Assigned To displays and functions as expected
   	Then Click the WQ icon to validate the Work Queue Activity Participants grid displays 	
    Then Close browser
    
    