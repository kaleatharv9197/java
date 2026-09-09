package collection_framework;

import java.util.HashSet;
import java.util.Set;

public class HashSetExampleMain {

	public static void main(String[] args) {
		Set<String> countries = new HashSet<>();
		countries.add("india");
		countries.add("usaa");
		countries.add("japan");
		countries.add("germany");
		countries.add("france");
		countries.add("india");
		countries.add("india");
		System.out.println("size:-"+countries.size());
		for(String country:countries) {
			System.out.println(country);

	}

}
}
