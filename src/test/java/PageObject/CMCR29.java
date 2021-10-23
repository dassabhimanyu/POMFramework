package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CMCR29 {
	public WebDriver idriver;
	public CMCR29 (WebDriver rdriver)
	{
		idriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
// CM-CR-29.1  add something
	@FindBy (xpath = "//*[@id=\"divKnowledge Library\"]/div")
	WebElement clickKnow;
	
	@FindBy (xpath = "//*[@id=\"divKnowledge Library\"]/div/ul/li[1]/a")
	WebElement clickExternalLink;
	
	@FindBy (xpath = "//*[@id=\"grdExternalLinkSearch\"]/div[2]/table/tbody/tr[9]/td/a")
	WebElement AmericanAssociationexternallink;
	// CM-CR-29.2	
	@FindBy (xpath = "//*[@id=\"grdExternalLinkSearch\"]/div[2]/table/tbody/tr[10]/td/a")
	WebElement CMDMUSPreventativeHealthServices;
	// CM-CR-29.3
	@FindBy (xpath = "//*[@id=\"grdExternalLinkSearch\"]/div[2]/table/tbody/tr[13]/td/a")
	WebElement FEPDirectExternalLink;
	// CM-CR-29.4
	@FindBy (xpath = "//*[@id=\"grdExternalLinkSearch\"]/div[2]/table/tbody/tr[7]/td/a")
	WebElement BlueKC360Member;
	// CM-CR-29.5
	@FindBy (xpath = "//*[@id=\"grdExternalLinkSearch\"]/div[3]/ul/li[2]/a")
	WebElement NextPage;
	
	@FindBy (xpath = "//*[@id=\"grdExternalLinkSearch\"]/div[2]/table/tbody/tr[3]/td/a")
	WebElement PerceptiveTestEnvironment;
	
	//Perform Action

public void KNOWdropdownList()
{
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	clickKnow.click();	
}
public void ExternalLinkClick() 
{
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	clickExternalLink.click();
}
public void CMDMAmericanAssociationexternallink()
{
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	AmericanAssociationexternallink.click();
}
public void CMDMUSPreventativeHealth() {
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	CMDMUSPreventativeHealthServices.click();
}
public void FEPDirect()
{
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	FEPDirectExternalLink.click();
}

public void BlueKCMember360Tool() {
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	BlueKC360Member.click();
}
public void clickonNextPage() {
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	NextPage.click();
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void PerceptiveTestEnvironment() {
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	PerceptiveTestEnvironment.click();
}
}





