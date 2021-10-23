Feature: CM-CR32.1
 
 Scenario: CM-CR32.1 Caregiver- Prerequisite: Completion of Test Case ID CM-CR-32.1.
	Given Launch Browser
    When User open URL "https://bkc-qa.guidingcare.com/Portal/Account/Login"
    Then UserentersUserID as "autocarecoord" and Password "Welcome@1234"
    Then clickonLogin button
    When User select identified memberID from the searchbox
    Then Enter MemberID
    Then Click on Search button
    Then click Acknowledge
    Then Click Caregivers
    Then Click AddCG
    Then Enter Caregiver detail
    Then Click Save
    
    Then Close browser