package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class TypesafeCollectionExampleMain {

	public static void main(String[] args) {
		List<String> cities = new ArrayList<>();
		cities.add("New Dhlhi");
		cities.add("mumbai");
		cities.add("benglore");
		cities.add("chennai");
		//cities.add(100, null);
		
	for(String city:cities) {
		System.out.println(city.toUpperCase());
	}
	
}
}

	
	

