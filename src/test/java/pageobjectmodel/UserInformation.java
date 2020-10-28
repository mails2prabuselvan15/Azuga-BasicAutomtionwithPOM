package pageobjectmodel;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UserInformation {
	
	public WebDriver driver;
	
	By title = By.id("id_gender1");
	By firstname = By.id("customer_firstname");
	By lastname = By.id("customer_lastname");
	By passwd = By.id("passwd");
	By daydpdown =By.id("days");
//	By day =By.xpath("select[@id='days']//option");
	By monthdpdown=By.id("months");
//	By  month =By.xpath("//select[@id='months']//option");
	By yeardpdown=By.id("years");
//	By  year =By.xpath("//select[@id='years']//option");
	By firstname1 = By.id("firstname");
	By lastname1 = By.id("lastname");
	By company = By.id("company");
	By address =By.id("address1");
	By City =By.id("city");
	By clickState =By.name("id_state");
//	By  states =By.xpath("//select[@id='id_state']//option");
	By zipcode = By.name("postcode");
	By phone =By.id("phone");
	
	By registerBtn =By.name("submitAccount");
	
	
	public  UserInformation(WebDriver driver) {
		this.driver=driver;
	}
	
	public void EnterInformation(String fname, String lname, String pwd, String fname1,String lname1, String comp, String add, String city, String postalCode, String phoneNum) throws InterruptedException {
		
		driver.findElement(title).click();
		driver.findElement(firstname).sendKeys(fname);
		driver.findElement(lastname).sendKeys(lname);
		driver.findElement(passwd).sendKeys(pwd);
		
		Select s1 = new Select(driver.findElement(daydpdown));
		s1.selectByValue("10");
		Select s2 = new Select(driver.findElement(monthdpdown));
		s2.selectByValue("6");
		
		Select s3 = new Select(driver.findElement(yeardpdown));
		s3.selectByValue("2018");
//		driver.findElement(daydpdown).click();
//		List<WebElement> findElements = driver.findElements(day);
//		Iterator<WebElement> iterator = findElements.iterator();
//		while(iterator.hasNext()) {
//			WebElement next = iterator.next();
//			String text = next.getText();
//			if (text.equalsIgnoreCase("10")) {
//				next.click();
//		}
//
//		}
//		driver.findElement(monthdpdown).click();
//		List<WebElement> findElements1 = driver.findElements(month);
//		Iterator<WebElement> iterator1 = findElements1.iterator();
//		while(iterator.hasNext()) {
//			WebElement next = iterator1.next();
//			String text = next.getText();
//			if (text.equalsIgnoreCase("12")) {
//				next.click();
//		}
//
//		}
//
//		
//		driver.findElement(yeardpdown).click();
//		List<WebElement> findElements2 = driver.findElements(year);
//		Iterator<WebElement> iterator2 = findElements2.iterator();
//		while(iterator.hasNext()) {
//			WebElement next = iterator2.next();
//			String text = next.getText();
//			if (text.equalsIgnoreCase("2010")) {
//				next.click();
//		}
//
//		}
//		
		driver.findElement(firstname1).sendKeys(fname1);
		driver.findElement(lastname1).sendKeys(lname1);
		driver.findElement(company).sendKeys(comp);
		driver.findElement(address).sendKeys(add);
		driver.findElement(City).sendKeys(city);
		Select s4 = new Select(driver.findElement(clickState));
		s4.selectByValue("10");
//		
//		
//		driver.findElement(clickState).click();
//		List<WebElement> findElements3 = driver.findElements(states);
//		Iterator<WebElement> iterator3 = findElements3.iterator();
//		while(iterator.hasNext()) {
//			WebElement next = iterator3.next();
//			String text = next.getText();
//			if (text.equalsIgnoreCase("Arizona")) {
//				next.click();
//		}
//
//		}
//		
		
		driver.findElement(zipcode).sendKeys(postalCode);
		driver.findElement(phone).sendKeys(phoneNum);
		driver.findElement(registerBtn).click();
		
		

		
		
	}
	
	

}
