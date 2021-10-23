package stepDefinitions;

import PageObject.CMCR33;
//import io.cucumber.java.en.*;
import utilities.AppTestControl;

public class CMCR33_Steps {
	AppTestControl _appTestControl;
	public CMCR33 TC33;
	
	public CMCR33_Steps(AppTestControl appTestControl) {
		_appTestControl = appTestControl;
		TC33 = _appTestControl.getAppPagesMaster().AppCMCR33();
	}
	
}
