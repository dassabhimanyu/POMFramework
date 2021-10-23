Feature: CM-CR30.3
 
 Scenario: CM-CR30.3 Worklog Manager select checkbox and Refer
	Given Launch Browser
    When User open URL "https://bkc-qa.guidingcare.com/Portal/Account/Login"
    Then UserentersUserID as "autocarecoord" and Password "Welcome@1234"
    Then clickonLogin button
    Then Hover over the Manage icon and click Worklog Manager
    Then Click the checkbox next to the applicable CM Activity
    Then Click Refer
    Then click on Refer TO checkbox 
    Then Select WorkQue dropdown
    Then Select a Care Staff member in the Care Staff field
    Then Click Refer2
    Then Validate the Activity no longer displays on the Worklog Manager grid
    Then Close browser