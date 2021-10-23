package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

//program Name- DM Diabetes StartDate- 13april2020 enddate-15apr2020, pending, pending, rishstratification

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Program {
	public WebDriver idriver;
	public Program (WebDriver rdriver)
	{
		idriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id = "btnAddMemberProgram")
	WebElement Addnewprogram;
	
	@FindBy(id = "ddlProgramAC_0_0")
	WebElement enterprogramname;
	
	@FindBy (id = "txtProgramStartDate_0_0")
	WebElement startdate;
	
	@FindBy (id = "txtProgramEndDate_0_0")
	WebElement enddate;
	
	@FindBy (id = "ddlProgramStatusName_0_0")
	WebElement status;
	
	@FindBy (id = "ddlProgramClosureReason_0_0")
	WebElement statusdescription;
	
	@FindBy (id = "ddlReferralType_0_0")
	WebElement referralsource;
	
	@FindBy (id = "btnSavePrograms")
	WebElement savebutton;
	
	//Perform Action Method
	
	public void clickAddProgramsButton() {

		Addnewprogram.click();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Addprogram() {
		
		enterprogramname.clear();
		enterprogramname.sendKeys("DM Diabetes");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement selectedList=idriver.findElement(By.xpath("//*[@id=\"ddlProgramAC_0_0_listbox\"]/li[1]"));
		selectedList.click();
		//enterprogramname.sendKeys(Keys.TAB);
	}
		public void selectstartdate() {
			startdate.sendKeys("4/13/2020");
			startdate.sendKeys(Keys.TAB);
			
		}
		public void selectenddate() {
			enddate.sendKeys("05/04/2020");
			enddate.sendKeys(Keys.TAB);
		}
		public void selectstatus() {
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Select statusDD = new Select(status);
			statusDD.selectByVisibleText("Pending");
		}
		public void selectstatusdescription() {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Select statusdescriptionDD = new Select(statusdescription);
			statusdescriptionDD.selectByVisibleText("Pending");
		}
		public void selectreferralsource() {
			Select referralsourceDD = new Select(referralsource);
			referralsourceDD.selectByVisibleText("Risk Stratification");
		}
		public void clickSAVEbutton() {
			savebutton.click();
			
		}
	
		}
	
	
	
	

