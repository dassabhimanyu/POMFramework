package stepDefinitions;

import PageObject.CMCR30;
import io.cucumber.java.en.*;
import utilities.AppTestControl;

public class CMCR30_Steps {

	AppTestControl _appTestControl;
	public CMCR30 TC30;
	
	public CMCR30_Steps(AppTestControl appTestControl) {
		_appTestControl = appTestControl;
		TC30 = _appTestControl.getAppPagesMaster().AppCMCR30();
	}

////CM-CR-30.1
@Then("Hover over the Manage icon and click Worklog Manager")
public void hover_over_the_Manage_icon_and_click_Worklog_Manager() {
    TC30.clickManageButton();
    TC30.clickWorkflowManagerLink();
	
}

@Then("Validate the Accepted and Pending Acceptance activities display as expected")
public void validate_the_Accepted_and_Pending_Acceptance_activities_display_as_expected() {
	
}

@Then("Validate the Assigned By and Activity Assigned To displays and functions as expected")
public void validate_the_Assigned_By_and_Activity_Assigned_To_displays_and_functions_as_expected() {
    
}

@Then("Click the WQ icon to validate the Work Queue Activity Participants grid displays")
public void click_the_WQ_icon_to_validate_the_Work_Queue_Activity_Participants_grid_displays() {
	TC30.clickWQicon();
}
//CM-CR-30.2
@Then("Click the blue thumb next to the applicable CM Activity")
public void click_the_blue_thumb_next_to_the_applicable_CM_Activity() {
	TC30.ClickThubIcon();
}

@Then("Enter General Activity Outcome details and click Complete")
public void enter_General_Activity_Outcome_details_and_click_Complete() {
    TC30.ActivityOutcompltdropdownbtn();
    TC30.SelectstatusActivityOutcmtl();
    //TC30.ClickCompletebtn();
}
//CM-CR-30.3
@Then("Click the checkbox next to the applicable CM Activity")
public void click_the_checkbox_next_to_the_applicable_CM_Activity() {
    TC30.Clickthecheckboxnext();
}

@Then("Click Refer")
public void click_Refer() {
    TC30.ClickReferbtn();
}

@Then("click on Refer TO checkbox")
public void click_on_Refer_TO_checkbox() {
    //TC30.ClickReferTOcheckbox();
}

@Then("Select WorkQue dropdown")
public void select_WorkQue_dropdown() {
    //TC30.SelectWorkQueDropdownlist();
}

@Then("Select a Care Staff member in the Care Staff field")
public void select_a_Care_Staff_member_in_the_Care_Staff_field() {
    
}
@Then("Click Refer2")
public void click_Refer2() {
    TC30.ClickReferbtn2();
}

@Then("Validate the Activity no longer displays on the Worklog Manager grid")
public void validate_the_Activity_no_longer_displays_on_the_Worklog_Manager_grid() {
    
}
}
