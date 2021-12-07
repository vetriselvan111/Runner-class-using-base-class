package Maven_Project.com.Mini_Project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Mini_Project.Base_class;

import pom.Home_Page;
import pom.Login_Page;
import pom.Page1;
import pom.Page2;
import pom.Page3;
import pom.Page4;
import pom.Page5;
import pom.Page6;
import pom.Page7;
import pom.Page8;
import pom.Page9;



public class RunnerClass extends Base_class {
	
	public static WebDriver driver=getBrowser("Chrome");
	public static Home_Page hp = new Home_Page(driver);
	public static Login_Page Login = new Login_Page(driver);
	public static Page1 pg1 = new Page1(driver);
	public static Page2 pg2 = new Page2(driver);
	public static Page3 pg3 = new Page3(driver);
	public static Page4 pg4 = new Page4(driver);
	public static Page5 pg5 = new Page5(driver);
	public static Page6 pg6 = new Page6(driver);
	public static Page7 pg7 = new Page7(driver);
	public static Page8 pg8 = new Page8(driver);
	public static Page9 pg9 = new Page9(driver);
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		URL("http://automationpractice.com/index.php");
		
		clickOnElement(hp.getLogin());
		
		sendKeysElement(Login.getEmail(), "talentedvetri@gmail.com");
		 
		sendKeysElement(Login.getPassword(), "Mithun@123");
		
		clickOnElement(Login.getSubmit_login());
		
		clickOnElement(pg1.getTshirt());
		
		actionsPerform("moveToElement", pg2.getImage());
		
		implicityWait(5, TimeUnit.SECONDS);
		
		actionsPerform("click", pg2.getImg_click());
	
		frames("element", null, pg3.getFrame());
		
		clickOnElement(pg3.getAddtocart());
		
		frames("defaultContent", null, null);
		
		explicityWait("visibilityOfElement", 20,pg4.getPtcheckout());
		
		actionsPerform("moveToElement",pg4.getPtcheckout());
		
		actionsPerform("click", pg4.getPtcheckout());
		
        scroll("scrollBy", "window.scrollBy(0,500);", null);
        
        implicityWait(5, TimeUnit.SECONDS);
		
		clickOnElement(pg5.getPtcheckout1());
		
	    scroll("scrollBy", "window.scrollBy(0,500);", null);
	    
	    implicityWait(5, TimeUnit.SECONDS);
	    
	    clickOnElement(pg6.getPtcheckout2());
	    
	    implicityWait(5, TimeUnit.SECONDS);
	    
	    clickOnElement(pg7.getCheckbox());
	    
	    actionsPerform("click", pg7.getPtcheckout3());
	    
	    scroll("scrollBy", "window.scrollBy(0,500);", null);
	    
	    actionsPerform("click", pg8.getCheque());
	    
	    scroll("scrollBy", "window.scrollBy(0,300);", null);
	    
	    actionsPerform("click", pg9.getConfirm());
	    
	    scroll("scrollBy", "window.scrollBy(0,300);", null);
	    
	    implicityWait(5, TimeUnit.SECONDS);
	    
	    screenShot("./Screenshots/project6.png");
	    	    
	}
}
