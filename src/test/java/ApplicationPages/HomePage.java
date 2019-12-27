package ApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver ldriver){
		
		this.driver = ldriver;
		
	}
	
    @FindBy(xpath = "//span[text()=' Log In']") 
    WebElement logInLink;
    
    @FindBy(xpath = "//span[text()='My Account']") 
    WebElement myAccountLink;
    
    @FindBy(xpath = "//span[text()='My Cart']") 
    WebElement myCartLink;
    
    @FindBy(xpath = "//span[@class='hidden-xs'][text()='Home']") 
    WebElement homePageLink;
    
    @FindBy(xpath = "//span[text()='Wishlist']") 
    WebElement wishLisLink;
    
    public void clickOnLoginLink(){
    	logInLink.click();
    	}
    
    
    public void clickOnMyAccountLink(){
    	myAccountLink.click();
    	}
    
    
    public void clickOnMyCartLink(){
    	myCartLink.click();
    	}
    
    
    public void clickOnHomePageLink(){
    	homePageLink.click();
    	}
    
    
    public void clickOnWishListLink(){
    	wishLisLink.click();
    	}
    
    public String getApplicationTitle(){
    	
    	return (driver.getTitle());
    }

}
