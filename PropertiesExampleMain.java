package collection_framework;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesExampleMain {

	public static void main(String[] args) {
		//this program prints system proprtis...............................
		Properties sysPrpos =System.getProperties();
		Enumeration propNames=sysPrpos.propertyNames();
		while(propNames.hasMoreElements()) {
			String propName= (String)propNames.nextElement();
			String propValue=sysPrpos.getProperty(propName);
			System.out.println("Name:-"+propName );
			System.out.println("Value:-"+propValue);
			
		}
		
		
	}
		

}
