package asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserts
{
	@Test
	public void test1()
	{
		Assert.assertEquals(12, 13);
	}
	@Test
	public void test2()
	{
		System.out.println("Test case started");
		Assert.assertEquals(12, 13,"Drop down count doesnot match.Check with developer");
		System.out.println("Test case2 completed");
	}
	@Test
	public void test3()
	{
		System.out.println("Test case started");
		Assert.assertEquals("Hello", "Hello","Words doesnot match.raise a bug");
		System.out.println("Test case3 completed");
	}
	

}
