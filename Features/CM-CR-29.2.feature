Feature: CM-CR29.2

 Scenario: CM-CR 29.2CM/DM US Preventative Health Services Task Force external link
   Given Launch Browser
    When User open URL "https://bkc-qa.guidingcare.com/Portal/Account/Login"
    Then UserentersUserID as "autocarecoord" and Password "Welcome@1234"
    Then clickonLogin button
    Then Hover over the Know drop-down list
    Then Click External Links
    Then Click CMDM US Preventative Health Services Task Force external link
        Then Close browser
  