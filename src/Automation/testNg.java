package Automation;

import org.testng.annotations.Test;

public class testNg {

	@Test(priority=1)
	public void demo()
	{
		System.out.println("hello");

	}
	@Test(priority=0)
	public void demo1()
	{
		System.out.println("hello gm");
	}
		
}
