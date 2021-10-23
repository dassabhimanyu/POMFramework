Feature: Program

Scenario: Add New program
	Given Launch Browser
    When User open URL "https://bkc-qa.guidingcare.com/Portal/Account/Login"
    Then UserentersUserID as "OptumAutomation" and Password "OptumAutomation!12"
    Then clickonLogin button
    When User select identified memberID from the searchbox
    Then Enter MemberID
    Then Click on Search button  
    Then Check Program records
    When Click Add New Program
    Then Enter Program Name
    Then Enter Start Date
    Then Enter End Date
    Then Select status as Pending
    Then Select status description as pending
    Then Click Referral Source drop-down list as Risk Stratification
    Then Click Save button
    Then Close browser 
    
    