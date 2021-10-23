package PageObject;

//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.Select;

public class SearchMemberID {
	public WebDriver idriver;
	
	public SearchMemberID (WebDriver rdriver)
	{
		idriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id = "selectSearch")
	WebElement searchTypeSelected;
	
	@FindBy(xpath = "//*[@id=\"txtSearch\"]")
	WebElement txtSearch;
	
	@FindBy(xpath = "//*[@id=\"memberSerach\"]/div/div/div/div[3]/div[1]/input")
	WebElement clickSearchbutton;
	
	
	//@FindBy(id = "lnkCareGivers")
	@FindBy(xpath = "//*[@id=\"lnkCareGivers\"]")
	WebElement checklnkCareGivers;	
	
	@FindBy(id = "careTeamTab")
	WebElement checkcareTeamTab;
	
	@FindBy(id = "lnkPrograms")
	WebElement checklnkPrograms;
	
	@FindBy(id = "lnkClinicalPrograms")
	WebElement checklnkClinicalPrograms;
	
	@FindBy(id = "lnkMemberEligibility")
	WebElement checklnkMemberEligibility;

	// Perform Action Method
	
	public void selectMemberID () throws InterruptedException {
		
		JavascriptExecutor jse6 = (JavascriptExecutor) idriver;
		jse6.executeScript("document.getElementById('selectSearch').value='MEMBER_NAME'");	
	
	}
	public void enterMemberID() {
		txtSearch.clear();
		//txtSearch.sendKeys("9cc9c1bafd801e212d9785df484ab1f5");
		txtSearch.sendKeys("MFN_10000851");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clickSearchbutton() {
		clickSearchbutton.click();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clicklnkCareGiversTab() {
					
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		checklnkCareGivers.click();
	}
	public void clickcareTeamTab() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		checkcareTeamTab.click();
	}
	public void clicklnkProgramsTab() {
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		checklnkPrograms.click();
	}
	public void clicklnkClinicalProgramsTab() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		checklnkClinicalPrograms.click();
	}
	public void clicklnkMemberEligibilityTab() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		checklnkMemberEligibility.click();
	}
	
}	


