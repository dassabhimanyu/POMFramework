package stepDefinitions;

import PageObject.Program;
import io.cucumber.java.en.*;
import utilities.AppTestControl;

public class Program_Steps {
	
	AppTestControl _appTestControl;
	public Program addprogram;
	
	public Program_Steps(AppTestControl appTestControl) {
		_appTestControl = appTestControl;
		addprogram = _appTestControl.getAppPagesMaster().AppProgramPage();
	}
	
	@When("Click Add New Program")
	public void click_Add_New_Program() {
		addprogram.clickAddProgramsButton();
		
		}
	@Then("Enter Program Name")
	public void enter_Program_Name() {
	   addprogram.Addprogram();
	   
	}

	@Then("Enter Start Date")
	public void enter_Start_Date() {
	   addprogram.selectstartdate();
	}

	@Then("Enter End Date")
	public void enter_End_Date() {
		addprogram.selectenddate();
	}

	@Then("Select status as Pending")
	public void select_status_as_Pending() {
		addprogram.selectstatus();
	}
	@Then("Select status description as pending")
	public void select_starus_description_as_pending() {
		addprogram.selectstatusdescription();
	}
	@Then("Click Referral Source drop-down list as Risk Stratification")
	public void click_Referral_Source_drop_down_list_as_Risk_Stratification() {
		addprogram.selectreferralsource();
	}
	@Then("Click Save button")
	public void click_Save_button() { 
		addprogram.clickSAVEbutton();
	}


}
