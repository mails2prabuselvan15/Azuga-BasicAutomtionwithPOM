package automationtests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjectmodel.AddToCart;
import pageobjectmodel.CreateAccount;
import pageobjectmodel.HomePage;
import pageobjectmodel.SelectDress;
import pageobjectmodel.UserInformation;

public class LoginFlow {
	
	public WebDriver driver;
	public HomePage home;
	public CreateAccount createAcc;
	public UserInformation userinfo;
	public SelectDress tshirts ;
	public  AddToCart addToCart;
	@BeforeTest
	public void launchBrowser() {
//		System.setProperty("webdriver.chrome.driver", "/Users/prabuselvan/Downloads/chromedriver 5");
		System.setProperty("webdriver.chrome.driver", "/Users/prabuselvan/Documents/Eclipse-Workspace-Projects/AzugaAutomationPractice/drivers/chrome/chromedriver");
		 driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		System.out.println("Launched the browser");
	}
	
	@Test
	public void addingproductsinCart() throws InterruptedException, IOException {
		String title = driver.getTitle();
		Assert.assertEquals(title, "My Store");
		home = new HomePage(driver);;
		home.clickSignInBtn();
		createAcc = new CreateAccount(driver);
		createAcc.enterEmailaddress("prabu10022@gmail.com");
		userinfo = new UserInformation(driver);
		userinfo.EnterInformation("PrabuSelvanB", "SelvanTestB", "Test@123", "SelvanPrabu", "Welcome street", "Testing", "Test123", "Alaska", "99524", "97381121111");
		tshirts= new SelectDress(driver);
		tshirts.click();
		addToCart = new AddToCart(driver);
		addToCart.clickAddToCart("$18.51");
		TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(SrcFile, new File("/Users/prabuselvan/Documents/Eclipse-Workspace-Projects/AzugaAutomationPractice/screenshots/lastpage.png"));


		
	}
	
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
		System.out.println("Successfully Closed the browser");
	}

}
