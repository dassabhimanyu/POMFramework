Feature: CM-CR29.1
 
 @US001
Scenario: CM-CR 29.1CMDM American Heart Association external link
	Given Launch Browser
    When User open URL "https://bkc-qa.guidingcare.com/Portal/Account/Login"
    Then UserentersUserID as "autocarecoord" and Password "Welcome@1234"
    Then clickonLogin button
    Then Hover over the Know drop-down list
    Then Click External Links
    Then Click the CMDM American Heart Association external link
        Then Close browser
  