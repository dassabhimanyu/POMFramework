package stepDefinitions;

import PageObject.LoginPage;
import io.cucumber.java.en.*;
import utilities.AppTestControl;

public class Login_Steps {

	AppTestControl _appTestControl;
	public LoginPage ip;
	
	public Login_Steps(AppTestControl appTestControl) {
		_appTestControl = appTestControl;
		ip = _appTestControl.getAppPagesMaster().AppLoginPage();
	}
	
	@Given("Launch Browser")
	public void launch_Browser() {
		
	}
	
	
	@When("open URL and click on SIGNIN for user login")
	public void open_URL_and_click_on_SIGNIN_for_user_login() {
		ip.signin();
	    
	}
	
	
	@Then("UserentersUserID as {string} then Click on Continue then Enter Password {string}")
	public void userentersuserid_as_then_Click_on_Continue_then_Enter_Password(String username, String password) {
		 ip.enterUsername(username);
		 ip.ClickonContinue();   
		 ip.enterPassword(password);
	}

	@Then("clickonLogin button")
	public void clickonlogin_button() throws InterruptedException {
	    ip.clickLogin();
	    Thread.sleep(3000);
	}


	@Then("Close browser")
	public void Close_browser() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		_appTestControl.getAppWebDriver().closeDriver();
	}
}








