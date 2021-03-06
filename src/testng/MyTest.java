package testng;

import org.testng.*;
import org.testng.annotations.Test;

public class MyTest 
{
	@Test
	public void test1()
	{
		Assert.assertEquals(false,true);  //1 fail 2 fail 3 fail -->fail
	}
	@Test
	public void test2()
	{
		Assert.assertEquals(true,true);  //1 pass 2 pass 3 pass -->pass
	}
}
