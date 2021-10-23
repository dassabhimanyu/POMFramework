package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ActionPage {

	public WebDriver idriver;
	public ActionPage (WebDriver rdriver)
	{
		idriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"divAction\"]/div") //Click on Action
	WebElement actionlink;
	
	@FindBy(id = "lnkAddActivity") //Add Activity
	WebElement addActivity;
	
	@FindBy(id = "selectScheduledType") //Select Type- as Scheduled
	WebElement selectType;
	
	@FindBy(xpath = "//*[@id=\"divActivityType\"]/span/span/span[1]") //Select Activity type as Program Referral
	WebElement selecactivityType;
	
	@FindBy(id = "DueDate") //Enter Due Date
	WebElement dueDate;
	
	@FindBy(xpath = "//*[@id=\"divGroupActivity\"]/div/span") //Click on Work Queue Activity check-box
	WebElement queueActivity;
	
	@FindBy(id = "ddlDepartment") //Select appropriate Work Queue
	WebElement workQueue;
	
	@FindBy(id = "ddlStaffIdsIdval") // Click on careStaff
	WebElement CareStaff;
		
	@FindBy(id = "Comments") //Enter Comments/Reason
	WebElement enterComment;
	
	@FindBy(id = "btnCloseActivityForm") //AddandClose button
	WebElement addClosebutton;
	
	@FindBy(id = "btnClickActivityRecord") //Click on Activity button for check added record
	WebElement activityRecord;
	
	@FindBy(id = "lnkActivitySummaryTab")
	WebElement ClickActivitySummaryTab;  //Click on ActivitySummary Tab
	
	@FindBy(id = "lnkProgramActivitiesTab")
	WebElement ClickRequiredActivitiesTab;  //Click on Required activityTab Tab
	
	@FindBy(id = "lnkOutstandingActivitiesTab")
	WebElement ClickOutstandingActivitiesTab;  //Click on Outstanding activityTab 
	
	@FindBy(id = "lnkDocumentsTab")
	WebElement ClickDocumentsActivitiesTab;  //Click on Documents activityTab Tab
	
	@FindBy(id = "lnkArticlesTab")
	WebElement ClickArticlesActivitiesTab;  //Click on Articles activityTab Tab
	
	@FindBy(id = "lnkConsentFormsTab")
	WebElement ClickConsentFormsTab;  //Click on ConsentForms activityTab Tab
	
	@FindBy(id = "lnkCallLogRegistryTab")
	WebElement ClickCallLogRegistryTab;  //Click on CallLogRegistryTab activityTab 
	
	@FindBy(id = "lnkMCGuidelineTab")
	WebElement ClickGuidingTab;  //Click on GuidingTab activityTab Tab
	
	@FindBy(id = "lnkNotesTab")
	WebElement ClickNotesTab;  //Click on NotesTab activityTab Tab
		
	// Perform Action method

public void ClickActionLink() {
	
	try {
		Thread.sleep(9000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	actionlink.click();
}
public void ClickAddActivityLik() {
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	addActivity.click();
}
public void SelectTypeDropdownlist() {
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public void SelectActivityTypeDropdownlist() {
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	JavascriptExecutor js = (JavascriptExecutor) idriver;
	js.executeScript("arguments[0].innerHTML='" + "Program Referral" + "'", selecactivityType);
	js.executeScript("document.getElementById('selectActivityType').value='126'");	
}
public void SelectDueDate() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	dueDate.sendKeys("05/04/2020 01:50 PM");
	dueDate.sendKeys(Keys.TAB);
}
public void ClickonWorkQueueActivityCheckbox() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	queueActivity.click();
}
public void ClickonWorkQueueCheckbox() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Actions actions = new Actions(idriver);
	actions.moveToElement(workQueue).click().perform();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	actions.moveToElement((idriver.findElement(By.xpath("//DIV[@id=\"ddlDepartmentIdspn\" and contains(@title, 'Disease Management')]")))).click().perform();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public void ClickonCareStaff() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	CareStaff.click();
}
public void EnterComments() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	enterComment.sendKeys("For testing only");
}
public void ClickAddClosebutton() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	addClosebutton.click();
}
public void ClickonActivityRecordButton() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	activityRecord.click();
}
public void lnkActivitySummaryTab() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ClickActivitySummaryTab.click();
}
public void lnkProgramActivitiesTab() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ClickRequiredActivitiesTab.click();
}
public void lnkOutstandingActivitiesTab() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ClickOutstandingActivitiesTab.click();
}
public void lnkDocumentsTab() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ClickDocumentsActivitiesTab.click();
}
public void lnkArticlesTab() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ClickArticlesActivitiesTab.click();
}
public void lnkConsentFormsTab() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ClickConsentFormsTab.click();
}
public void lnkCallLogRegistryTab() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ClickCallLogRegistryTab.click();
}
public void lnkMCGuidelineTab() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ClickGuidingTab.click();
}

public void lnkNotesTab() {
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ClickNotesTab.click();
}
}




