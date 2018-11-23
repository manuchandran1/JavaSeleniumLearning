package com.learnjava;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling 
{

	public static void main(String[] args) throws Exception 
	{
		try{
			testException(20);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Finally");			
		}
	}
	
	public static void testException(int i) throws Exception
	{
		if(i < 0)
		{
			Exception myexception1 = new Exception("My Own Exception: Because i ="+ i);
			throw myexception1;
//			FileNotFoundException myException = new FileNotFoundException("Negative Integer "+i);
//			throw myException;
		}
		else if(i > 10)
		{
			throw new Exception("Another Exception : Bcause i>10");
			//throw new IOException("Only supported for index 0 to 10");
		}
		else
		{
			System.out.println("PASSED");
		}

	}
	
}