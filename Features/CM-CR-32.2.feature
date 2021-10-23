Feature: CM-CR32.2
 
 Scenario: CM-CR32.2 Prerequisite: Completion of Test Case ID CM-CR-32.1.
	Given Launch Browser
    When User open URL "https://bkc-qa.guidingcare.com/Portal/Account/Login"
    Then UserentersUserID as "autocarecoord" and Password "Welcome@1234"
    Then clickonLogin button
    When User select identified memberID from the searchbox
    Then Enter MemberID
    Then Click on Search button
    Then click Acknowledge
    Then Click Caregivers
    Then Click the checkbox next to the applicable Caregiver
    Then Click Edit
    Then Update the Caregivers details
    Then Click Update
     Then Close browser