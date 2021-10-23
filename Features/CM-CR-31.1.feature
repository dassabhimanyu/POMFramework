Feature: CM-CR31.1
 
 Scenario: CM-CR31.1 Complete general Activity
	Given Launch Browser
    When User open URL "https://bkc-qa.guidingcare.com/Portal/Account/Login"
    Then UserentersUserID as "autocarecoord" and Password "Welcome@1234"
    Then clickonLogin button
    When User select identified memberID from the searchbox
    Then Enter MemberID
    Then Click on Search button
    Then click Acknowledge
    Then Click the Health tab
    Then Click Visits
    Then Select Manual in the Search By drop-down list as Manual
    Then Click Add
    Then Select Visit Type
    Then Enter Service From and Service To date
    Then Enter Chief Complaint Reason for Visit in the free text field
    Then Enter Provider Code. If Provider Code is unknown, click the Find Provider Code hyperlink for search
    Then Enter the Diagnosis Code. If the Diagnosis Code is unknown, click the Find ICD Code hyperlink
    Then Enter Procedure Code. If the Procedure Code is unknown, click the Find CPT Code hyperlink
    Then Enter Total Charge
    Then Select Eligibility detail
    Then Click Add2 
    Then Close browser