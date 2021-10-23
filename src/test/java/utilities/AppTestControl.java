package utilities;

public class AppTestControl {
	
	AppWebDriver appWebDriver;
	AppPagesMaster appPagesMaster;
	
	public AppTestControl() {
		
		appWebDriver = new AppWebDriver();
	    appPagesMaster = new AppPagesMaster(appWebDriver.GetDriver());
	}
	
	public AppWebDriver getAppWebDriver() {
		return appWebDriver;
	}
	
	public AppPagesMaster getAppPagesMaster() {
		return appPagesMaster;
	}

}
