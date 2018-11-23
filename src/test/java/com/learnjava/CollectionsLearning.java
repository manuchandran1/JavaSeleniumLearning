package com.learnjava;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionsLearning 

{
	
	public static void main(String[] args) 
	{
		Map<String, String> m = new HashMap<String, String>();
		
		//List<String> list2= new CopyOnWriteArrayList<String>();
		List<String> list2= new ArrayList<String>();
		list2.add("123");
		list2.add("345");
		list2.add("789");
		
		Iterator<String> it2 = list2.iterator();
		while(it2.hasNext()) 
		{
			System.out.println(it2.next());
			list2.remove(0);
			System.out.println(list2);
			System.out.println("-------------");

		}
		
		System.out.println(list2);
		
		
		
//		m.put("c1", "Japan");
//		m.put("c2","China");
//		m.put("c2","India");
//		//m.remove("c2");
//		
//		
//		
//		System.out.println(m.get("c1"));
//		System.out.println(m.get("c2"));
//		System.out.println(m.get("c3"));
//		
//		Set<String> keySet = m.keySet();
//		
//		System.out.println(keySet);	
//		
//		int hashCode = m.hashCode();
//System.out.println(hashCode);

		
	}
	
	
	

}
