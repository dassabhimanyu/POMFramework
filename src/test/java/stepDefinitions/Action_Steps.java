package stepDefinitions;



import PageObject.ActionPage;
import io.cucumber.java.en.*;
import utilities.AppTestControl;

public class Action_Steps {
	AppTestControl _appTestControl;
	public ActionPage action;
	
	public Action_Steps (AppTestControl appTestControl){
		_appTestControl = appTestControl;
		action = _appTestControl.getAppPagesMaster().AppActionPage();
	}
	
	@When("Click on Action")
	public void click_on_Action() {
	   action.ClickActionLink();
	}

	@Then("Add Activity")
	public void add_Activity() {
	    action.ClickAddActivityLik();
	}

	@Then("Select Type as Scheduled")
	public void select_Type_as_Scheduled() {
	  //action.SelectTypeDropdownlist();
	}

	@Then("Select Activity type as Program Referral")
	public void select_Activity_type_as_Program_Referral() {
	  action.SelectActivityTypeDropdownlist();
	}

	@Then("Enter Due Date")
	public void enter_Due_Date() {
	    action.SelectDueDate();
	}

	@Then("Click on Work Queue Activity check-box")
	public void click_on_Work_Queue_Activity_check_box() {
	   action.ClickonWorkQueueActivityCheckbox();
	}

	@Then("Select appropriate Work Queue")
	public void select_appropriate_Work_Queue() {
	    action.ClickonWorkQueueCheckbox();
	}
	@Then("Click on careStaff")
	public void Click_on_careStaff() {
	  //  action.ClickonCareStaff();
	}
	@Then("Enter Comments\\/Reason")
	public void enter_Comments_Reason() {
	    action.EnterComments();
	}
	@Then("Click Add and Close")
	public void click_Add_and_Close() {
	    action.ClickAddClosebutton();
	}
	@Then("Click on Activity Record")
	public void click_on_Activity_Record() {
	    action.ClickonActivityRecordButton();
	}
	@Then("Click on Activity Summary link")
	public void click_on_Activity_Summary_link() {
	 action.lnkActivitySummaryTab();   
	}

	@Then("Click on Required Activities")
	public void click_on_Required_Activities() {
	    action.lnkProgramActivitiesTab();
	}

	@Then("Click on Outstanding Activities")
	public void click_on_Outstanding_Activities() {
	    action.lnkOutstandingActivitiesTab();
	}

	@Then("Click on Documents")
	public void click_on_Documents() {
	    action.lnkDocumentsTab();
	}

	@Then("Click on Articles")
	public void click_on_Articles() {
	   action.lnkArticlesTab();
	}

	@Then("Click on Consent forms")
	public void click_on_Consent_forms() {
	    action.lnkConsentFormsTab();
	}

	@Then("Call Log Registry")
	public void call_Log_Registry() {
	    action.lnkCallLogRegistryTab();
	}

	@Then("Click On guidelines")
	public void click_On_guidelines() {
	   action.lnkMCGuidelineTab();
	}
	@Then("Click on Notes")
	public void click_on_Notes() {
	  action.lnkNotesTab();
	}

	}
