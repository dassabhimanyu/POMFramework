Feature: CM-CR33.1
 
 Scenario: CM-CR33.1
	Given Launch Browser
    When User open URL "https://bkc-qa.guidingcare.com/Portal/Account/Login"
    Then UserentersUserID as "autocarecoord" and Password "Welcome@1234"
    Then clickonLogin button
    Then Navigate to the My Alerts widget located on the Guiding Care dashboard 
    Then Click the hyperlink in the Count column to view the members associated with the Alert
    Then Close browser