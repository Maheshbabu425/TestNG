package Demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CarLoan {

	@Test
	public void webCarLoan()
	{
		System.out.println("Web Car Loan");
	}
	@Test(groups= {"groupname"})
	public void mobileCarLoan()
	{
		System.out.println("Mobile Car Loan");
	}
	@Test
	public void apiCarLoan()
	{
		System.out.println("API Car Loan");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("For Every Method print first");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("For Every Method print last");
	}

	}


