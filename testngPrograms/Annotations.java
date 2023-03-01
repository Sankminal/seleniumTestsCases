package TestNGprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations 
{
  @Test
  public void f() 
   {
	  System.out.println("This is My First Method  ");
   }
  @Test
  public void g() 
   {
	  System.out.println("This is My 2nd Method for callig Annotations ");
   }
  @BeforeMethod
  public void beforeMethod() 
   {
	  System.out.println("Before Method is called before each Test Method");
   }

  @AfterMethod
  public void afterMethod() 
   {
	  System.out.println("After Method is called After each Test Method");
   } 

  @BeforeClass
  public void beforeClass() 
   {
	  System.out.println("Beforeclass is called after Test Method");
   }

  @AfterClass
  public void afterClass() 
   {
	  System.out.println("afterclass is called after all Test Methods");
   }

  @BeforeTest
  public void beforeTest() 
   {
	  System.out.println("BeforeTest is called Before Test Method");
   }

  @AfterTest
  public void afterTest() 
   {
	  System.out.println("AfterTest is called after all Test Method");
   }

  @BeforeSuite
  public void beforeSuite() 
   {
	  System.out.println("BeforeSuite is called at the Starting of any Method");
   }

  @AfterSuite
  public void afterSuite()
   {
	  System.out.println("AfterSuite is called at the Ending of all Methods in the Program");
   }

}
