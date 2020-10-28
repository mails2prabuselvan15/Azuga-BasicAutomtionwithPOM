package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccount {
	
	public WebDriver driver;
	
	By Emailadd = By.name("email_create");
	By CreateAccBtn =By.name("SubmitCreate");
	
	public CreateAccount(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterEmailaddress(String email) {
		
		driver.findElement(Emailadd).sendKeys(email);
		System.out.println("Entered the email address ");
		driver.findElement(CreateAccBtn).click();
		System.out.println("Clicked on Create Account button");
	}
	

}
