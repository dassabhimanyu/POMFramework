Feature: CM-CR32.3
 
 Scenario: CM-CR32.3 Prerequisite: Completion of Test Case ID CM-CR-32.3.
	Given Launch Browser
    When User open URL "https://bkc-qa.guidingcare.com/Portal/Account/Login"
    Then UserentersUserID as "autocarecoord" and Password "Welcome@1234"
    Then clickonLogin button
    When User select identified memberID from the searchbox
    Then Enter MemberID
    Then Click on Search button
    Then click Acknowledge
    Then Click Care Team
    Then Select External Care Team in the Care Team drop-down list
    Then Click Add button
    Then Enter the Provider details
    Then Click Save Button 
    Then Close browser