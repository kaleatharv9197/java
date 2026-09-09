package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class TypeUnsafeCollectionExampleMain {

	public static void main(String[] args) {
		List cities = new ArrayList();
		cities.add("pune");
		cities.add("mumbai");
		cities.add("nashik");
		cities.add("khlohapur");
		cities.add("solapur");
	
		for(Object Obj:cities) {
			String city=(String)Obj;
			System.out.println(city.toUpperCase());
			
		}
			
		
	}

}
