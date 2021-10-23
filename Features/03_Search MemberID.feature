Feature: Search Member Details 

Scenario: Search MemberID
	Given Launch Browser
    When User open URL "https://bkc-qa.guidingcare.com/Portal/Account/Login"
    Then UserentersUserID as "OptumAutomation" and Password "OptumAutomation!12"
    Then clickonLogin button
    When User select identified memberID from the searchbox
    Then Enter MemberID
    Then Click on Search button
    Then Check Caregivers records
    Then Check CareTeam records
    Then Check Program records
    Then Check Clinical Program records
    Then Check Eligibilitys
    Then Close browser 
 
   
    