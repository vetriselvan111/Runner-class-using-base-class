package Maven_Project.com.Mini_Project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class RunnerClass extends Base_class {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		driver = getBrowser("Chrome");
		
		URL("http://automationpractice.com/index.php");
		
		WebElement Login = driver.findElement(By.xpath("//a[@class='login']"));
		
		clickOnElement(Login);
		
		WebElement Email = driver.findElement(By.xpath("(//input[@name='email'][1])"));
		
		sendKeysElement(Email, "talentedvetri@gmail.com");
		
		WebElement Password = driver.findElement(By.xpath("(//input[@name='passwd'][1])"));
		 
		sendKeysElement(Password, "Mithun@123");
		
		WebElement Submit_login = driver.findElement(By.id("SubmitLogin"));
		
		clickOnElement(Submit_login);
		
		clickOnElement(driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]")));
				
		actionsPerform("moveToElement", driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']")));
		
		implicityWait(5, TimeUnit.SECONDS);
		
		actionsPerform("click", driver.findElement(By.xpath("//a[@class='quick-view']")));
		
		implicityWait(5, TimeUnit.SECONDS);
		
		WebElement addtocart = driver.findElement(By.xpath("//iframe[@vspace='0']"));
		
		frames("element", null, addtocart);
		
		clickOnElement(driver.findElement(By.xpath("//button[@class='exclusive']")));
		
		frames("defaultContent", null, null);
		
		explicityWait("visibilityOfElement", 20, (By.xpath("//a[@title='Proceed to checkout']")));
		
		WebElement ptcheckout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		
		actionsPerform("moveToElement",ptcheckout);
		
		actionsPerform("click", ptcheckout);
		
        scroll("scrollBy", "window.scrollBy(0,500);", null);
        
        implicityWait(5, TimeUnit.SECONDS);
		
		clickOnElement(driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")));
		
	    scroll("scrollBy", "window.scrollBy(0,500);", null);
	    
	    implicityWait(5, TimeUnit.SECONDS);
	    
	    clickOnElement(driver.findElement(By.xpath("(//button[@type='submit'])[2]")));
	    
	    implicityWait(5, TimeUnit.SECONDS);
	    
	    clickOnElement(driver.findElement(By.id("cgv")));
	    
	    actionsPerform("click", driver.findElement(By.xpath("//button[@name='processCarrier']")));
	    
	    scroll("scrollBy", "window.scrollBy(0,500);", null);
	    
	    actionsPerform("click", driver.findElement(By.xpath("//a[@class='cheque']")));
	    
	    scroll("scrollBy", "window.scrollBy(0,300);", null);
	    
	    actionsPerform("click", driver.findElement(By.xpath("//span[text()='I confirm my order']")));
	    
	    scroll("scrollBy", "window.scrollBy(0,300);", null);
	    
	    implicityWait(5, TimeUnit.SECONDS);
	    
	    screenShot("./Screenshots/project5.png");
	    	    
	}
}
