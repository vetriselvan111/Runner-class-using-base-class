package Maven_Project.com.Mini_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner_Democlass extends Base_class {
	
public static void main(String[] args) {
	
	driver = getBrowser("Chrome");
	
	URL("https://www.facebook.com/");
	
    WebElement Email = driver.findElement(By.xpath("//input[@type='text']"));
    
    sendKeysElement(Email, "Billa vetri");
	
	WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
	
	sendKeysElement(Password, "mithun@1111");
	
	WebElement Login = driver.findElement(By.xpath("//button[@value='1']"));
	
	clickOnElement(Login);
	
	
}
}
