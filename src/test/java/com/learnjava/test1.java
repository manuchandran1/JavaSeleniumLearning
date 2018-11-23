package com.learnjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class test1 
{
	public static void main(String[] args)
	{
	
		int y=0 ;
		String[] a;
		for(int i=0;i<3;i++) 
		{
			y+=i;
		}
		a = new String[y];
		
		a[0] = "1";
		a[1] = "2";
		a[2] = "3";
		System.out.println(a.length);

		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
		}
		
		
		
		Map<String, String> map = new HashMap<String,String>();
		 
		 map.put("1", "abc");
		 map.put("2", "xyz");
		 map.put("3", "qrt");
		 
		 for(String x:map.values()) 
		 {
			 System.out.println(x);
		 }

	}
}
