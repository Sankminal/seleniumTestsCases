package TestNGprograms;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import TestNGprograms.Listners.Test_Listner;

@Listeners(Test_Listner.class)
public class CrossBrowser_Test {
	 public WebDriver driver;
	 @Test 
	  public void login() {
			WebElement Login = driver.findElement(By.xpath("//input[@id='email']"));
			WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
			WebElement Loginbtn = driver.findElement(By.xpath("//button[@name='login']"));
			Login.sendKeys("Sanket");
			pass.sendKeys("321456");
			Loginbtn.click();		
	     }
		@Test
	  public void checktitle() {
			String expectedTitle = "Facebook – log in or sign up";
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
		}
	   @Test 
	   public void teardown() {
		   driver.close();
	   }
	
	  @Parameters("browser")
	  @BeforeClass                    // We have taken BrowserSelection code in Beforeclass annotation.....
	  public void beforeClass(String browser) {
		  if(browser.equalsIgnoreCase("chrome")) {
			  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\SHRI\\eclipse-workspace\\Selenium_svs\\Binary\\chromedriver.exe");
			  driver = new ChromeDriver();
		   } else if(browser.equalsIgnoreCase("edge")){
			   System.setProperty("webdriver.edge.driver", "C:\\Users\\SHRI\\eclipse-workspace\\Selenium_svs\\Binary\\msedgedriver.exe" );
			   driver = new EdgeDriver();
		   }
		     
		      driver.get("https://www.facebook.com/");     // Single URL for both the browsers.....
		      System.out.println("Thread Id"+ Thread.currentThread().getId());  // for Parallel Testing  it will run parallely in two id's those are 
	  }																			// id18 and id19....			
	 
}			//If in XML file if parallel = "false" is given then browser will run sequntially , giving the SAME ID one after another...
