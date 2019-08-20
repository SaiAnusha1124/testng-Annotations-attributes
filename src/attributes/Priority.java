package attributes;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Priority
{
	@Test(priority = 1, description = "This test case will verify login functionality")
	public void loginapplication()
	{
		System.out.println("First TestNG script");
		Assert.assertEquals(12, 13);
	}
	@Test(priority = 1, description = "This test case will verify Select functionality")
	public void select() 
	{
		System.out.println("Item Selected");
	}
	@Test(priority = 1, description = "This test case will verify Chectout functionality")
	public void checkout()
	{
		System.out.println("Checking Item");
	}
}
