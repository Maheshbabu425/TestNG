package Demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PersonalLoan {

	
		@Test(groups= {"groupname"})
		public void webPersonalLoan()
		{
			System.out.println("Web Personal Loan");
		}
		@Test
		public void mobilePersonalLoan()
		{
			System.out.println("Mobile Personal Loan");
		}
		
		@Parameters({"URLYahoo"})
		@Test
		public void apiPersonalLoan(String urlname)
		{
			System.out.println("API Personal Loan");
			System.out.println(urlname);
		}

}
