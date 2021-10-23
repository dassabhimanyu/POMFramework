package PageObject;
//9cc9c1bafd801e212d9785df484ab1f5
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver idriver;
	  
public LoginPage(WebDriver rdriver)
{
	idriver = rdriver;
	PageFactory.initElements(rdriver, this);
}

@FindBy(id = "ap_email")
WebElement textuserid;

@FindBy(xpath = "//*[@id=\"continue\"]")
WebElement ClickonContinue;

@FindBy(id = "ap_password")
WebElement textPassword;

@FindBy(xpath = "//*[@id=\"nav-link-accountList-nav-line-1\"]")
WebElement signin;

@FindBy (id = "signInSubmit")
WebElement btnLogin;

//Perform Action Method
public void openUrl (String url) 
{
	idriver.get(url);
}

public void enterUsername (String uname) 
{
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	textuserid.clear();
	textuserid.sendKeys(uname);
}

public void ClickonContinue()
{
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ClickonContinue.click();
}

public void enterPassword(String pwd) 
{
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	textPassword.clear();
	textPassword.sendKeys(pwd);
}

public void signin() 
{
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	signin.click();
	
}
public void clickLogin()
{
	btnLogin.click();	

}

}

  