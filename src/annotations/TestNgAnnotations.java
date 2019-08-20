package annotations;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations 
{
		@BeforeSuite
		public void beforeSuite()
		{
		System.out.println("Start TestNG");
		}
		@BeforeTest
		public void beforeTest() 
		{
			System.out.println("Start TestNG Execution");
		}
		@BeforeClass
		public void beforeClass()
		{
			System.out.println("Initialise the Selenium");
		}
		@BeforeMethod
		public void beforeMethod() 
		{
			System.out.println("Opening Testing Browser");
		}
		@Test
		public void FirstCase()
		{
			System.out.println("Testing case 1");
		}
		@Test
		public void secondCase()
		{
			System.out.println("Testing case 2");
		}
		@AfterMethod
		public void afterMethod()
		{
			System.out.println("Closing Testing Browser");
		}
		@AfterClass
		public void afterClass() 
		{
			System.out.println("Destory the Selenium");
		}
		@AfterTest
		public void afterTest()
		{
			System.out.println("Stop TestNG Execution");
		}		
		@AfterSuite
		public void afterSuite()
		{
			System.out.println("Stop TestNG");
		}
}
