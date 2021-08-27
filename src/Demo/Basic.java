package Demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Basic {

/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
*/
	@Test
	public void Demo()
	{
		System.out.println("Mahesh");
	}
	@Test(dataProvider="getData") // calling the get data method in to the test case by using dataProvider annotation
	public void PracticeDataProviderAnnotation(String username, String password) // Passing the attributes
	{
		System.out.println("Practice Data Provider Annotation");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider()
	public Object[][] getData()
	{
	
	// 1. Combination- user name password good credit history  
	// 2. Combination- user name password no credit history
	// 3. Combination- user name password fraud data
	
	//Providing Data to set by using multiple array list
	Object[][] data= new Object[3][2];
	
	// 1st set
	data[0][0]="firstusername";
	data[0][1]="firstpassword";
	
	// 2nd set
	data[1][0]="secondusername";
	data[1][1]="secondpassword";
	
	// 3rd set
	data[2][0]="thirdusername";
	data[2][1]="thirdpassword";
	return data;					// move cursor and change return type to object 
	
	
		
	}
	
}
