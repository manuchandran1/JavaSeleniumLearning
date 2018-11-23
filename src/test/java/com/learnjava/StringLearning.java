package com.learnjava;

public class StringLearning 
{
	
	public static void main(String[] args) 
	{
		
		String str1 = "000test.000000999000000......";
		//String str2 = str1.replaceAll("(['.','0'])", "");
		String str2 = str1.replaceFirst("0", "");
		str2 = "HelloGoodmorningandGoodevening";
		String[] split = str2.split("o",5);
		for(int i=0;i<split.length;i++) 
		{
			System.out.println(split[i]);
		}
//		int length = str1.length();
//		System.out.println(length);
//		
//		String result="";
//		
//		for (int i=0;i<length; i++) 
//		{
//			if(str1.charAt(i)=='0' || str1.charAt(i) == '.') 
//			{
//				str1.replace(target, replacement)
//			}
//		}
		
//		
	}
	

}
