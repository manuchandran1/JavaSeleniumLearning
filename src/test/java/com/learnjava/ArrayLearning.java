package com.learnjava;

public class ArrayLearning 
{
	public static void main(String[] args) 
	{
		String[] arr1 = new String[5];
		
		arr1[0] = "123";
		arr1[1] = "xyz";
		arr1[2] = "abc";
		
		System.out.println(arr1[1]);
		
		String x = "Hello World Good Morning";
		String[] split1 = x.split(" ");
		
		System.out.println(split1[0]);
		String temp = "";
		String strReversed = "";
		
		for (int i=x.length(); i>0; i--)
		{
			strReversed += x.charAt(i-1);
		}
		
		
		System.out.println(strReversed);
	}

}
