Feature: CM-CR29.3
 
   Scenario: CM-CR 29.3FEP Direct external link
   Given Launch Browser
    When User open URL "https://bkc-qa.guidingcare.com/Portal/Account/Login"
    Then UserentersUserID as "autocarecoord" and Password "Welcome@1234"
    Then clickonLogin button
       Then Hover over the Know drop-down list
    Then Click External Links
    Then Click FEP Direct external link
        Then Close browser
 