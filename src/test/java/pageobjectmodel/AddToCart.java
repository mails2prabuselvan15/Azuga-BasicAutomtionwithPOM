package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddToCart {

	
	WebDriver driver;

	By firstimg =By.xpath("(//div[@class='product-image-container']//a)[1]");
	By addToCart = By.xpath("//button//span[text()='Add to cart']");
	By proceed = By.xpath("//a[@title='Proceed to checkout']//span");
	By proceed2= By.xpath("(//a[@title='Proceed to checkout']//span)[2]");
	By proceed3= By.xpath("//button[@name='processAddress']");
	By agree = By.name("cgv");
	By proceed4=By.xpath("//button[@name='processCarrier']//span");
	By price = By.xpath("//td[@id='total_price_container']/span");
	
	
	public AddToCart(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickAddToCart(String expPrice) {
		driver.findElement(firstimg).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(addToCart).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(proceed).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(proceed2).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(proceed3).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(agree).click();
		driver.findElement(proceed4).click();
		String priceVal = driver.findElement(price).getText();
		Assert.assertEquals(priceVal,expPrice);
		
	}
	
	
}
