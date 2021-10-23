package PageObject;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class CMCR30 {

	public WebDriver idriver;
	public CMCR30 (WebDriver rdriver)
	{
		idriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
// CM-CR-30.1
	@FindBy (xpath = "//*[@id=\"divManage\"]/div/input")
	WebElement ClickManageButton;
	
	@FindBy (xpath = "//*[@id=\"divManage\"]/div/ul/li[11]/a")
	WebElement ClickWorkflowManagerLink;
	
	
	@FindBy (xpath = "//*[@id=\"CMPendingActivitiesGrid\"]/div[2]/table/tbody/tr[1]/td[30]/img")
	WebElement ClickWQicon;
	
	// CM-CR-30.2
	@FindBy (name = "btnRRun")
	WebElement ClickThubIcon;
	
	@FindBy (xpath = "//*[@id=\"selectActivityOutcome-list\"]/span/input")
	WebElement ActivityOutcompltdropdownbtn;
	
	@FindBy (xpath = "//*[@id=\"selectActivityOutcome-list\"]/span/input")
	WebElement SelectstatusActivityOutcmtl;
	
	@FindBy (id = "btnCompleteActivityOC")
	WebElement ClickCompletebtn;
	
	// CM-CR-30.3
	
	@FindBy (xpath = "//input[starts-with(@id,'chkCMPendingActivitiesGrid_')]")
	WebElement Clickthecheckboxnext;
	
	@FindBy (id = "btnPARefer")
	WebElement ClickReferbtn;
	
	@FindBy (id = "chkCMGroupActivity")
	WebElement ClickReferTOcheckbox;
	
	@FindBy (xpath = "//*[@id=\"trwlWorkQue\"]/td[2]/div/span/span/span[1]")
	WebElement SelectWorkQueDropdownlist;
	
	@FindBy (id = "btnCMPABulkRefer")
	WebElement ClickReferbtn2;

	// CM-CR-30.1
public void clickManageButton()
{
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ClickManageButton.click();
}
public void clickWorkflowManagerLink() {
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	ClickWorkflowManagerLink.click();
}
public void clickWQicon() {
	try {
		Thread.sleep(15000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ClickWQicon.click();
}
//CM-CR-30.2
public void ClickThubIcon() {
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ClickThubIcon.click();
	}
public void ActivityOutcompltdropdownbtn() {
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//ActivityOutcompltdropdownbtn.click();
	//ActivityOutcompltdropdownbtn.sendKeys("Activity Completed");
	
	//JavascriptExecutor js = (JavascriptExecutor) idriver;
	//js.executeScript("arguments[0].innerHTML='" + "Activity Completed" + "'", ActivityOutcompltdropdownbtn);
	//js.executeScript("document.getElementById('ActivityOutcompltdropdownbtn').value='0'");
	//Select statusDD = new Select(ActivityOutcompltdropdownbtn);
	//statusDD.selectByVisibleText("Activity Completed");
	}
public void SelectstatusActivityOutcmtl() {
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//ActivityOutcompltdropdownbtn.click();
	SelectstatusActivityOutcmtl.click();
	SelectstatusActivityOutcmtl.sendKeys("Activity Completed");
	//JavascriptExecutor js = (JavascriptExecutor) idriver;
	//js.executeScript("arguments[0].innerHTML='" + "Activity Completed" + "'", SelectstatusActivityOutcmtl);
	//js.executeScript("document.getElementById('SelectstatusActivityOutcmtl').value='1'");
	
	//ActivityOutcompltdropdownbtn.sendKeys("ActivityOutcompltdropdownbtn");
	//Actions actions = new Actions(idriver);
	//actions.moveToElement(SelectstatusActivityOutcmtl).click().perform();
	//actions.click();
	//actions.click(SelectstatusActivityOutcmtl).perform();
	//actions.moveToElement((idriver.findElement(By.xpath("//DIV[@id=\"ddlDepartmentIdspn\" and contains(@title, 'Disease Management')]")))).click().perform();
	//actions.moveToElement((idriver.findElement(By.xpath("//*[@id=\\\"divActivityOutcome\\\"]/span[1]/span/span[1]" and contains(@title, 'Activity Completed')]")))).click().perform();
	Select statusDD = new Select(SelectstatusActivityOutcmtl);
	statusDD.selectByVisibleText("Activity Completed");
}
public void ClickCompletebtn() {
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ClickCompletebtn.click();
}
//CM-CR-30.3
public void Clickthecheckboxnext() {
	try {
		Thread.sleep(9000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Clickthecheckboxnext.click();
}
public void ClickReferbtn() {
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ClickReferbtn.click();
}
public void ClickReferTOcheckbox() {
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ClickReferTOcheckbox.click();
}
public void SelectWorkQueDropdownlist() {
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//SelectWorkQueDropdownlist.click();
	Actions actions = new Actions(idriver);
	actions.moveToElement(SelectWorkQueDropdownlist).click().perform();
	actions.click();
	
	//*[@id="ddlWLCMWQId_listbox"]/li[4]
	
	//*[@id="ddlWLCMWQId_listbox"]/li and contains(text(), 'Admin')

	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	actions.moveToElement((idriver.findElement(By.xpath("//*[@id=\"ddlWLCMWQId_listbox\"]/li[contains(text(), 'Admin')]")))).click().perform();
}
public void ClickReferbtn2() {
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ClickReferbtn2.click();
}
}
