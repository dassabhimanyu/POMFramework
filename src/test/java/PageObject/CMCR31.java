package PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CMCR31 {
	public WebDriver idriver;
	public CMCR31 (WebDriver rdriver)
	{
		idriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
// CM-CR-31
	@FindBy(id = "btnAlertsAcknowledge")
	WebElement clickAcknowledgebtn;
	
	@FindBy(id = "btnClickHealth")
	WebElement clickHealthTab;
	
	@FindBy(id = "HealthVisitsTab")
	WebElement clickVisitTab;
	
	@FindBy(id = "ddlEMR")
	WebElement SelectSearchBy;
	
	@FindBy(id = "btnAddVisit")
	WebElement ClickAddbtn;
	
	@FindBy(id = "ddlTypeOfVisit")
	WebElement SelectVisitType;
	
	@FindBy(id = "txtDateOfService")
	WebElement ServiceFromDate;
	
	@FindBy(id = "txtServiceToDate")
	WebElement ServiceTODate;
	
	@FindBy(id = "txtDescription")
	WebElement ReasonForVisit;	
	
	@FindBy(id = "btnSearchProviderCode")
	WebElement FindProviderCode;	
	
	@FindBy(id = "btnSearch")
	WebElement ClickSearchbtn;
	
	@FindBy(name = "chkgvProviderGrid")
	WebElement ClickRadiobtnForSlectProvider;
	
	@FindBy(id = "btnSearchICDCode")
	WebElement FindICDCode;
	
	@FindBy(id = "patientVisitSearchICDs")
	WebElement SelectSearchICD;
	
	@FindBy(xpath = "/html/body/div[3]/div[4]/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/input")
	WebElement ClickCheckBoxForICDCode;
	
	@FindBy(id = "btnIcdMultiSelect")
	WebElement ClickSelectbtn;
	
	@FindBy(id = "btnSearchCPTCode")
	WebElement FindCPTCode;
	
	@FindBy(id = "btnCptPatientVisitCode")
	WebElement SelectSearchCPT;
	
	@FindBy(id = "btnCptMultiSelect")
	WebElement ClickSelectbtnCPT;
		
	@FindBy(xpath = "/html/body/div[3]/div[4]/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/input")
	WebElement ClickCheckBoxForCPTCode;
	
	@FindBy(id = "txtTotalCharge")
	WebElement EnterTotalChange;
	
	//@FindBy(xpath = "//*[@id=\"memberEligibiltyFullView\"]")
	//WebElement ClickViewEligibility;
	
	//@FindBy(id = "btnOkMemberEligibilityPopup")
	//WebElement ClickOKbtn;
	
	@FindBy(id = "btnAddService")
	WebElement ClickAddButn2;
	
//CM-CR-31
	public void clickAcknowledgebutton() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickAcknowledgebtn.click();
	}
	public void clickHealthTab() {
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickHealthTab.click();
	}
	public void clickVisitTab() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickVisitTab.click();
	}
	public void SelectSearchBy() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select statusDD = new Select(SelectSearchBy);
		statusDD.selectByVisibleText("Manual");
		
		//SelectSearchBy.click();
	}
	public void ClickAddbtn() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ClickAddbtn.click();
	}
	public void SelectVisitType() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select statusDDD = new Select(SelectVisitType);
		statusDDD.selectByVisibleText("InPatient");
		
		//SelectVisitType.click();
	}
	public void ServiceFromDate() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ServiceFromDate.sendKeys("5/05/2020");
		ServiceFromDate.sendKeys(Keys.TAB);
		
		//ServiceFromDate.click();
	}
	public void ServiceTODate() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ServiceTODate.sendKeys("5/07/2020");
		ServiceTODate.sendKeys(Keys.TAB);
		//ServiceTODate.click();
	}
	public void ReasonForVisit() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ReasonForVisit.sendKeys("Health Issues");
		
	}
	public void FindProviderCode() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FindProviderCode.click();
	}
	public void ClickSearchbtn() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ClickSearchbtn.click();
	}
	public void ClickRadiobtnForSlectProvider() {
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ClickRadiobtnForSlectProvider.click();
	}
	public void FindICDCode() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FindICDCode.click();
	}
	public void SelectSearchICD() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		SelectSearchICD.click();
	}
	public void ClickCheckBoxForICDCode() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		ClickCheckBoxForICDCode.click();
	}
	public void ClickSelectbtn() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ClickSelectbtn.click();
	}
	public void FindCPTCode() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FindCPTCode.click();
	}
	public void SelectSearchCPT() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SelectSearchCPT.click();
	}
	public void ClickCheckBoxForCPTCode() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ClickCheckBoxForCPTCode.click();
	}
	public void ClickSelectbtnCPT() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ClickSelectbtnCPT.click();
	}
	public void EnterTotalChange() {
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EnterTotalChange.sendKeys("1000");
	}
	public void ClickViewEligibility() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//ClickViewEligibility.click();
	}
	public void ClickOKbtn() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//ClickOKbtn.click();
	}
	public void ClickAddButn2() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ClickAddButn2.click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}}
