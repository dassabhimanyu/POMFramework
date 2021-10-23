package stepDefinitions;


import PageObject.CMCR32;
import io.cucumber.java.en.*;
import utilities.AppTestControl;

public class CMCR32_Steps {
	AppTestControl _appTestControl;
	public CMCR32 TC32;
	
	public CMCR32_Steps(AppTestControl appTestControl) {
		_appTestControl = appTestControl;
		TC32 = _appTestControl.getAppPagesMaster().AppCMCR32();
	}
	
//CM-CR32.1
	@Then("Click Caregivers")
	public void click_Caregivers() {
		 TC32.Caregiver();
	}
	@Then("Click AddCG")
	public void click_AddCG() {
	    TC32.ClickAddCG();
	}

	@Then("Enter Caregiver detail")
	public void enter_Caregiver_detail() {
	    TC32.EnterFirstName();
	    TC32.EnterLastName();
	    TC32.SelectGender();
	    TC32.SelectRelationship();
	}
	@Then("Click Save")
	public void click_Save() {
		TC32.ClickSaveCG();
	}
//CM-CR 32.2
	@Then("Click the checkbox next to the applicable Caregiver")
	public void click_the_checkbox_next_to_the_applicable_Caregiver() {
	    TC32.ClickChckbox();
	}

	@Then("Click Edit")
	public void click_Edit() {
	    TC32.ClickEditbtn();
	}

	@Then("Update the Caregivers details")
	public void update_the_Caregivers_details() {
	    
	}

	@Then("Click Update")
	public void click_Update() {
	    TC32.ClickUpdatetbtn();
	}
	//CM-CR 32.3
	@Then("Click Care Team")
	public void click_Care_Team() {
	    
	}

	@Then("Select External Care Team in the Care Team drop-down list")
	public void select_External_Care_Team_in_the_Care_Team_drop_down_list() {
	    
	}

	@Then("Click Add button")
	public void click_Add_button() {
	    
	}

	@Then("Enter the Provider details")
	public void enter_the_Provider_details() {
	    
	}

	@Then("Click Save Button")
	public void click_Save_Button() {
	    
	}
//CM-CR32.4
	@Then("Click the checkbox next to the applicable Care Team member")
	public void click_the_checkbox_next_to_the_applicable_Care_Team_member() {
	   
	}

	@Then("Update the External Care Team details")
	public void update_the_External_Care_Team_details() {
	    
	}

	@Then("Click the PCP Medical Home checkbox")
	public void click_the_PCP_Medical_Home_checkbox() {
	    
	}

	@Then("Validate the PCP column displays Yes for the External Care Team member")
	public void validate_the_PCP_column_displays_Yes_for_the_External_Care_Team_member() {
	    
	}



}
