package DataProviderLearning;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

public class DataProvider_Add
{
	@DataProvider(name="dp_Add")
	public static Iterator<Object[]> getTestData() throws IOException 
	{
		ExcelRW xl = new ExcelRW("/Users/shify/Documents/Workspace/Framework/DataProviderAdd.xlsx");
		
		int rowCount = xl.getRow("SheetName1");
		
		System.out.println("Row Count:"+rowCount);
		int colCount = xl.getColumn("SheetName1");
		System.out.println("Column Count: "+ colCount);
		
		
		List<Object[]> arr_list = new ArrayList<Object[]>();
		
		for(int i=1;i<=rowCount;i++)
		{
			Object[] x = new Object[1];
			Map<String,String> dMap = new HashMap<String, String>();
			
			for(int j=0; j<colCount;j++)
			{
				String Skey = xl.readCell("SheetName1", 0, j);
				String Value = xl.readCell("SheetName1", i, j);
				dMap.put(Skey, Value);
			}
			
			x[0] = dMap;
			arr_list.add(x);
			
		} // end of outer for loop
		
		return arr_list.iterator();
		
	}
}
