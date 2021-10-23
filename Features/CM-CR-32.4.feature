Feature: CM-CR32.4
 
 Scenario: CM-CR32.4 Prerequisite: Completion of Test Case ID CM-CR-32.3.
	Given Launch Browser
    When User open URL "https://bkc-qa.guidingcare.com/Portal/Account/Login"
    Then UserentersUserID as "autocarecoord" and Password "Welcome@1234"
    Then clickonLogin button
    When User select identified memberID from the searchbox
    Then Enter MemberID
    Then Click on Search button
    Then click Acknowledge
    Then Click Care Team
    Then Click the checkbox next to the applicable Care Team member
    Then Click Edit
    Then Update the External Care Team details
    Then Click the PCP Medical Home checkbox
    Then Click Update
    Then Validate the PCP column displays Yes for the External Care Team member 
    Then Close browser