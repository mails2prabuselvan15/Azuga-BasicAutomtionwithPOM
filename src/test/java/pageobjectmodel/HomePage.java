package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	By Signin = By.xpath("//div[@class='header_user_info']//a");
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickSignInBtn() {
		driver.findElement(Signin).click();
		System.out.println("Clicked on Sign in button");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
