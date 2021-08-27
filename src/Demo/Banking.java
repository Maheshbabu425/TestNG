package Demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Banking {

	@Test(enabled=false)
	public void personalA()
	{
		System.out.println("Personal A");
	}
	
	@Test
	public void personalB()
	{
		System.out.println("Personal B");
		
	}
	@Test
	
	public void personalC()
	{
		System.out.println("Personal C");
	}
		@AfterTest
	public void afterTest()
	{
		System.out.println("AfterTest Print this one");
	}
	
	//@Test(dependsOnMethods= {"HomeB","HomeC"})
	public void HomeA()
	{
		System.out.println("Home A");
	}
	@Test
	public void HomeB()
	{
		System.out.println("Home B");
	}
	@Test(groups= {"groupname"})
	public void HomeC()
	{
		System.out.println("Home C");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test print this one");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite print this one");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite print this one");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
	
}
