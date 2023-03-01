package TestNGprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Hard_Default {
	public WebDriver driver;		// if Webdriver is called publically  outside the Test THEN NO NEED TO CALL IN THE TEST AGAIN
	
  @Test
  public void chromeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRI\\eclipse-workspace\\Selenium_svs\\Binary\\chromedriver.exe");
		 driver = new ChromeDriver();    // hence hear ... Webdriver driver = new chromedriver() is not called ......
		driver.get("https://kite.zerodha.com/");
		String expectedTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);   // When Strings are Equal , this method is used
		//Assert.assertNotEquals(actualTitle, expectedTitle); //when the strings are not equal this method is used....
		WebElement KiteLogo = driver.findElement(By.xpath ("//img[contains(@src,'kite-logo.svg')]"));
		Assert.assertTrue(KiteLogo.isDisplayed());
		System.out.println(KiteLogo.isDisplayed());
		
  }
  @Test
  public void edgeTest() {
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\SHRI\\eclipse-workspace\\Selenium_svs\\Binary\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		String expectedTitle = "Facebook – log in or sign up";
		String Actualtitle = driver.getTitle();
		Assert.assertEquals(Actualtitle, expectedTitle); 
  }
}
