package com.learnjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapLearning 
{
	
	public static void main(String[] args)
	{
		Map<String, String> hmap = new HashMap<String,String>();
		
		hmap.put("C1", "JAPAN");
		hmap.put("C2", "INDIA");
		hmap.put("C3", "China");
		hmap.put("C4", "INDIA");
		
		System.out.println(hmap);
		
		Set<Entry<String, String>> entrySet = hmap.entrySet();
		
		System.out.println(entrySet);
		
		
		
		
	}
	
	
	
	

}
