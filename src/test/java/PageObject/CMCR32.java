package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CMCR32 {
	public WebDriver idriver;
	public CMCR32 (WebDriver rdriver)
	{
		idriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
//CM-CR-32.1
	@FindBy(id = "lnkCareGivers")
	WebElement Caregiver;
	
	@FindBy(id = "BtnAdd")
	WebElement ClickAddCG;
	
	@FindBy(id = "txtEditDtaPCPFirstName1")
	WebElement EnterFirstName;
	
	@FindBy(id = "txtEditDtaPCPLastName1")
	WebElement EnterLastName;
	
	@FindBy(id = "ddlEditDtaPCGGender1")
	WebElement SelectGender;
	
	@FindBy(id = "ddlEditDtaPCGRelationship1")
	WebElement SelectRelationship;
	
	@FindBy(id = "btnDtaSavePCP1")
	WebElement ClickSave;
//CM-CR 32.2
	
	@FindBy(xpath = "/html/body/div[16]/div[2]/div[1]/table/tbody/tr[5]/td/div[5]/div[2]/div/div/div/div/div[8]/div/form/div[2]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[1]/input")
	WebElement ClickChckbox;
		
	@FindBy(id = "BtnEdit")
	WebElement ClickEditbtn;
	
	@FindBy(id = "btnDtaEditPCP1")
	WebElement ClickUpdatetbtn;
	
//CM-CR 32.3
	@FindBy(id = "careTeamTab")
	WebElement CareTeam;
	
	@FindBy(id = "ddlSearchCareTeamType")
	WebElement SelectExternalCareTeam;
	
	@FindBy(id = "btnCareTeamAdd")
	WebElement ClickAddbtnCT;
	
	@FindBy(id = "ddlExtCrTmRole")
	WebElement SelectProviderType;
	
	@FindBy(id = "btnExternalCTProvSearch")
	WebElement ClickSearchbtnforPC;
	
	@FindBy(id = "btnSearch")
	WebElement ClickSearchbtnPC;
	
	@FindBy(name = "chkgvProviderGrid")
	WebElement ClickCheckboxPC;
	
	@FindBy(id = "ddlExtCrTmRoleForMember")
	WebElement SelectProviderRoll;
	
	@FindBy(id = "txtExtCrTmFromDate")
	WebElement StartDateCT;	
	
	@FindBy(id = "txtExtCrToDate")
	WebElement ENdDateCT;	
	
	@FindBy(id = "ddlExtCrTmState")
	WebElement SelectStateProvin;
	
	//@FindBy(id = "txtExtCrTmZip")
	//WebElement EnterZIPPostalCode;
	
	@FindBy(id = "btnExCrTmSave")
	WebElement ClickSavebtnCT;
	
	
//CM-CR-32.1
public void Caregiver() {
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Caregiver.click();
}
public void ClickAddCG() {
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ClickAddCG.click();
}
public void EnterFirstName() {
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	EnterFirstName.sendKeys("Testing");
}
public void EnterLastName() {
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	EnterLastName.sendKeys("Automation");
}
public void SelectGender() {
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Select gender = new Select(SelectGender);
	gender.selectByVisibleText("Male");
}
public void SelectRelationship() {
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Select relationship = new Select(SelectRelationship);
	relationship.selectByVisibleText("Friend");
}
public void ClickSaveCG() {
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ClickSave.click();
}
//CM-CR 32.2
public void ClickChckbox() {
	ClickChckbox.click();
}
public void ClickEditbtn() {
	ClickEditbtn.click();
}
public void ClickUpdatetbtn() {
	ClickUpdatetbtn.click();
}
//CM-CR 32.3
public void CareTeam() {
	CareTeam.click();
}
public void SelectExternalCareTeam() {
	SelectExternalCareTeam.click();
}
public void ClickAddbtnCT() {
	ClickAddbtnCT.click();
}
public void SelectProviderType() {
	SelectProviderType.clear();
}
public void ClickSearchbtnforPC() {
	ClickSearchbtnforPC.click();
}
public void ClickCheckboxPC() {
	ClickCheckboxPC.click();
}
public void SelectProviderRoll() {
	SelectProviderRoll.click();
}
public void StartDateCT() {
	StartDateCT.click();
}
public void ENdDateCT() {
	ENdDateCT.click();
}
public void SelectStateProvin() {
	SelectStateProvin.click();
}
public void ClickSavebtnCT() {
	ClickSavebtnCT.click();
}
}