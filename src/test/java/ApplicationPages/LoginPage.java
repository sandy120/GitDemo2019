package ApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {
	
    WebDriver driver;
	
	public LoginPage(WebDriver ldriver){
		
		this.driver = ldriver;
		
	}
	
	@FindBy(id="account_sign_in_form_email_id")
	WebElement username;
	
	@FindBy(name="passwd")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Log In']")
	WebElement login;
	
	@FindBy(xpath="//a[text()=' Dashboard ']//following::div[2]")
	WebElement dashboardtitle;
	
	public void loginApplication(String uname, String pass){
		
		username.sendKeys(uname);
		password.sendKeys(pass);
		login.click();
	}

	public void verifyDashboardTitle(){
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(dashboardtitle));
		
		String text = ele.getText();
		
		Assert.assertEquals(text, "Account Dashboard View","Dashboard title not verified properly.");
	}
}
