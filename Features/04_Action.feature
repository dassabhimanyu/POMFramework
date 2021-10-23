Feature: Action 

Scenario: Add Activity
		Given Launch Browser
    	When User open URL "https://bkc-qa.guidingcare.com/Portal/Account/Login"
    	Then UserentersUserID as "OptumAutomation" and Password "OptumAutomation!12"
    	Then clickonLogin button
    	When User select identified memberID from the searchbox
    	Then Enter MemberID
    	Then Click on Search button  
    	When Click on Action
    	Then Add Activity
    	Then Select Type as Scheduled
    	Then Select Activity type as Program Referral
       	Then Enter Due Date
    	Then Click on Work Queue Activity check-box 
    	Then Select appropriate Work Queue
    	Then Click on careStaff 
    	Then Enter Comments/Reason
    	Then Click Add and Close 
    	Then Click on Activity Record
    	Then Click on Activity Summary link
    	Then Click on Required Activities
    	Then Click on Outstanding Activities
    	Then Click on Documents
    	Then Click on Articles
    	Then Click on Consent forms
    	Then Call Log Registry
    	Then Click On guidelines
    	Then Click on Notes
    	Then Close browser
    	
     
    	
 
