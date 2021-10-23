package stepDefinitions;

import PageObject.SearchMemberID;
import io.cucumber.java.en.*;
import utilities.AppTestControl;

public class SearchmemberID_Steps {
	
	AppTestControl _appTestControl;
	public SearchMemberID memberid;
	
	public SearchmemberID_Steps(AppTestControl appTestControl) {
		_appTestControl = appTestControl;
		memberid = _appTestControl.getAppPagesMaster().AppSearchMemberPage();
	}
		
	@When("User select identified memberID from the searchbox")
	public void user_select_identified_memberID_from_the_searchbox() throws InterruptedException {
	    memberid.selectMemberID();
	}

	@Then("Enter MemberID")
	public void enter_MemberID() {
	    memberid.enterMemberID();
	}

	@Then("Click on Search button")
	public void click_on_Search_button() {
	    memberid.clickSearchbutton();
	}

	@Then("Check Caregivers records")
	public void check_Caregivers_records() {
	    memberid.clicklnkCareGiversTab();
	}

	@Then("Check CareTeam records")
	public void check_CareTeam_records() {
	   memberid.clickcareTeamTab();
	}

	@Then("Check Program records")
	public void check_Program_records() {
	    memberid.clicklnkProgramsTab();
	}

	@Then("Check Clinical Program records")
	public void check_Clinical_Program_records() {
	    memberid.clicklnkClinicalProgramsTab();
	}

	@Then("Check Eligibilitys")
	public void check_Eligibilitys() {
	   memberid.clicklnkMemberEligibilityTab();
	}
}
