Feature: CM-CR30.2
  
Scenario: CM-CR30.2 Workflow Manager Blue thumb Functionality
	Given Launch Browser
    When User open URL "https://bkc-qa.guidingcare.com/Portal/Account/Login"
    Then UserentersUserID as "autocarecoord" and Password "Welcome@1234"
    Then clickonLogin button
   	Then Hover over the Manage icon and click Worklog Manager
   	Then Click the blue thumb next to the applicable CM Activity
   	Then Enter General Activity Outcome details and click Complete
   	Then Close browser
   	
   	 