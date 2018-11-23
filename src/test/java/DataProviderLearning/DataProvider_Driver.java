package DataProviderLearning;

import java.util.Map;

import org.testng.annotations.Test;

public class DataProvider_Driver 
{
	@Test(dataProvider = "dp_Add", dataProviderClass = DataProvider_Add.class)
	public void testAdd(Map<String,String> add)
	{
		String s1 = add.get("s1");
		String s2 = add.get("s2");
		String result = add.get("Result");
		
		double num1 = Double.parseDouble(s1);
		double num2 = Double.parseDouble(s2);
		double exP_result = Double.parseDouble(result);
		
		double actual_Result = num1+num2;
		
		if(exP_result == actual_Result) 
		{
			System.out.println("Passed");
		}
		else
			System.out.println("Failed");
				
		
	}

}
