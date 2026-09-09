package collection_framework;

import java.util.HashSet;
import java.util.Set;

public class HashSetWithCountryExampleMain {

	public static void main(String[] args) {
		Set<country> countries = new HashSet<>();
		country ind = new country();
		country ud= new country("usa","wishigton");
		country jpn = new country("japn","tokoy");
		country ger= new country("germny","berlin");
		country far= new country("france","parise");
		
		countries.add(ind);
		countries.add(ud);
		countries.add(jpn);
		countries.add(ger);
		countries.add(far);
		
		
		for( country ctr:countries) {
			System.out.println(ctr);


		}


	}
}