
package utilities;



import org.openqa.selenium.WebDriver;

import PageObject.ActionPage;
import PageObject.CMCR29;
import PageObject.CMCR30;
import PageObject.CMCR31;
import PageObject.CMCR32;
import PageObject.CMCR33;
import PageObject.LoginPage;
import PageObject.Program;
import PageObject.SearchMemberID;


public class AppPagesMaster {
	
	private WebDriver _driver;
	private LoginPage _loginPage;
	private Program _program;
	private SearchMemberID _memberid;
	private ActionPage _action;
	private CMCR29 _cmcr29;
	private CMCR30 _cmcr30;
	private CMCR31 _cmcr31;
	private CMCR32 _cmcr32;
	private CMCR33 _cmcr33;
	
	public AppPagesMaster(WebDriver driver) {
		_driver = driver;
	}
	
	public LoginPage AppLoginPage() {
		return (_loginPage == null)? new LoginPage(_driver) : _loginPage;
	} 
	
	public Program AppProgramPage() {
		return (_program == null)? new Program(_driver) : _program;
	} 
	
	public SearchMemberID AppSearchMemberPage() {
		return (_memberid == null)? new SearchMemberID(_driver) : _memberid;
	} 
	
	public ActionPage AppActionPage() {
		return (_action == null) ? new ActionPage(_driver) : _action;
	} 
	public CMCR29 AppCMCR29() {
		return (_cmcr29 == null) ? new CMCR29 (_driver) : _cmcr29;
	}
	public CMCR30 AppCMCR30() {
		return (_cmcr30 == null) ? new CMCR30 (_driver) : _cmcr30;
	}
	public CMCR31 AppCMCR31() {
		return (_cmcr31 == null) ? new CMCR31 (_driver) : _cmcr31;
	}
	public CMCR32 AppCMCR32() {
		return (_cmcr32 == null) ? new CMCR32 (_driver) : _cmcr32;
	}
	public CMCR33 AppCMCR33() {
		return (_cmcr33 == null) ? new CMCR33 (_driver) : _cmcr33;
	}
	
}
