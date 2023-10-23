package magento_lap;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sgin_up_test {
	
	WebDriver driver = new ChromeDriver();

	Random rand = new Random();

	String URL = "https://magento.softwaretestingboard.com/customer/account/create/";
	String FirstName = "Donis";
	String lastName = "Adel";
	String Email = "asaqa";
	String Domain = "@gmail.com";
	String Password = "ASDasd123!@#";
	
    @BeforeTest 
	
	public void Home_page()  {
		
    	driver.get(URL);
		
		
			
    }
    
    @Test(invocationCount = 10) 
    public void sgin_up() {
    	
    	int myNewIDForTheEmail = rand.nextInt(10000);
		// define all the webelement that will be used
    	
    	
		WebElement FirstNameInputField = driver.findElement(By.id("firstname"));
		WebElement LastNameInputField = driver.findElement(By.id("lastname"));
		WebElement EmailInputField = driver.findElement(By.id("email_address"));
		WebElement PasswordInputField = driver.findElement(By.id("password"));
		WebElement PasswordConfirmationField = driver.findElement(By.id("password-confirmation"));

		// interact with webelements
		
		
		FirstNameInputField.sendKeys(FirstName);
		LastNameInputField.sendKeys(lastName);
		EmailInputField.sendKeys(Email + myNewIDForTheEmail + Domain);
		PasswordInputField.sendKeys(Password);
		PasswordConfirmationField.sendKeys(Password);

	}
    
    
     @AfterTest
	
	public void sgin_up_test() {}
	
	
	
	
	
	

}
