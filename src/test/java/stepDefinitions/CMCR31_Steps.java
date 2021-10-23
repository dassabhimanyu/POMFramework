package stepDefinitions;

import PageObject.CMCR31;
import utilities.AppTestControl;
import io.cucumber.java.en.*;

public class CMCR31_Steps {
	AppTestControl _appTestControl;
	public CMCR31 TC31;
	
	public CMCR31_Steps(AppTestControl appTestControl) {
		_appTestControl = appTestControl;
		TC31 = _appTestControl.getAppPagesMaster().AppCMCR31();
	}
//CM-CR-31
	@Then("click Acknowledge")
	public void click_Acknowledge() {
	    TC31.clickAcknowledgebutton();
	}
	@Then("Click the Health tab")
	public void click_the_Health_tab() {
	    TC31.clickHealthTab();
	}

	@Then("Click Visits")
	public void click_Visits() {
	   TC31.clickVisitTab();
	}
	@Then("Select Manual in the Search By drop-down list as Manual")
	public void select_Manual_in_the_Search_By_drop_down_list_as_Manual() {
	    TC31.SelectSearchBy();
	}

	@Then("Click Add")
	public void click_Add() {
	    TC31.ClickAddbtn();
	}

	@Then("Select Visit Type")
	public void select_Visit_Type() {
	    TC31.SelectVisitType();
	}

	@Then("Enter Service From and Service To date")
	public void enter_Service_From_and_Service_To_date() {
	    TC31.ServiceFromDate();
	    TC31.ServiceTODate();
	}

	@Then("Enter Chief Complaint Reason for Visit in the free text field")
	public void enter_Chief_Complaint_Reason_for_Visit_in_the_free_text_field() {
	    TC31.ReasonForVisit();
	}

	@Then("Enter Provider Code. If Provider Code is unknown, click the Find Provider Code hyperlink for search")
	public void enter_Provider_Code_If_Provider_Code_is_unknown_click_the_Find_Provider_Code_hyperlink_for_search() {
	    TC31.FindProviderCode();
	    TC31.ClickSearchbtn();
	    TC31.ClickRadiobtnForSlectProvider();
	}

	@Then("Enter the Diagnosis Code. If the Diagnosis Code is unknown, click the Find ICD Code hyperlink")
	public void enter_the_Diagnosis_Code_If_the_Diagnosis_Code_is_unknown_click_the_Find_ICD_Code_hyperlink() {
	    TC31.FindICDCode();
	    TC31.SelectSearchICD();
	    TC31.ClickCheckBoxForICDCode();
	    TC31.ClickSelectbtn();
	}

	@Then("Enter Procedure Code. If the Procedure Code is unknown, click the Find CPT Code hyperlink")
	public void enter_Procedure_Code_If_the_Procedure_Code_is_unknown_click_the_Find_CPT_Code_hyperlink() {
	    TC31.FindCPTCode();
	    TC31.SelectSearchCPT();
	    TC31.ClickCheckBoxForCPTCode();
	    TC31.ClickSelectbtnCPT();
	}

	@Then("Enter Total Charge")
	public void enter_Total_Charge() {
	    TC31.EnterTotalChange();
	}

	@Then("Select Eligibility detail")
	public void select_Eligibility_detail() {
	    //TC31.ClickViewEligibility();
	    //TC31.ClickOKbtn();
	}

	@Then("Click Add2")
	public void click_Add2() {
	   TC31.ClickAddButn2();
	}
}
