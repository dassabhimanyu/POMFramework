package stepDefinitions;

import PageObject.CMCR29;
import io.cucumber.java.en.*;
import utilities.AppTestControl;

public class CMCR29_Steps {
	
	AppTestControl _appTestControl;
	public CMCR29 TC29;
	
	public CMCR29_Steps(AppTestControl appTestControl) {
		_appTestControl = appTestControl;
		TC29 = _appTestControl.getAppPagesMaster().AppCMCR29();
	}
// CM-CR 29.1
@Then("Hover over the Know drop-down list")
public void hover_over_the_Know_drop_down_list() {
    TC29.KNOWdropdownList();
}

@Then("Click External Links")
public void click_External_Links() {
    TC29.ExternalLinkClick();
}

@Then("Click the CMDM American Heart Association external link")
public void click_the_CMDM_American_Heart_Association_external_link() {
 TC29.CMDMAmericanAssociationexternallink();
}
//CM-CR 29.2

@Then("validate it's displaying and functioning as expected")
public void validate_it_s_displaying_and_functioning_as_expected() {
}
@Then("Click CMDM US Preventative Health Services Task Force external link")
public void click_CMDM_US_Preventative_Health_Services_Task_Force_external_link() {
    TC29.CMDMUSPreventativeHealth();
}
// CM-CR 29.3
@Then("Click FEP Direct external link")
public void click_FEP_Direct_external_link() {
	TC29.FEPDirect();
}
//CM-CR 29.4
@Then("Click BlueKC Member360 Tool  external link")
public void click_BlueKC_Member360_Tool_external_link() {
    TC29.BlueKCMember360Tool();
}
//CM-CR 29.5
@Then("Click on Nextpage")
public void click_on_Nextpage() {
    TC29.clickonNextPage();
}
@Then("Click PerceptiveTestEnvironment external link")
public void click_PerceptiveTestEnvironment_external_link() {
    TC29.PerceptiveTestEnvironment();
}
}
