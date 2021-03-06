package testng;

import org.testng.annotations.Test;

public class InvocationCountTest
{
	
	//i want to execute same testcase more than 10 times
	@Test(invocationCount = 10)
	public void sum()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Sum is : " +c);
	}
	
	@Test(timeOut = 2000) 
	public void infiteLoopTest()
	{
		int i=1;
		while(i==1)
		{
			System.out.println(i);
		}
	}
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void convertingDataTypeTest()
	{
		String x = "1000A";
		int i = Integer.valueOf(x);
	}
}

