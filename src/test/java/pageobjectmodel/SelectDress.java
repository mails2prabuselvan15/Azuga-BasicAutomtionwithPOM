package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectDress {
	
	WebDriver driver;

	By tshirts = By.xpath("(//li//a[text()='T-shirts'])[2]");
	
	
	public SelectDress(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void click() {
		driver.findElement(tshirts).click();
	}

}
