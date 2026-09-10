package java_8_Feature;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApiExample {

	public static void main(String[] args) {
		List<String> names = List.of("Rohit", "gaurav", "adi", "atharv", "master");
		Stream<String> nameStream =	names.stream();
		Consumer<String> myConsumer = myName-> System.out.println(myName.toUpperCase());
		nameStream.forEach(myConsumer);
		System.out.println("==================================");
		List<Integer> no = List.of(45,60,55 ,52 , 78);
//		Stream<Integer>	noStream=no.stream();
//		Predicate<Integer> pr = num -> num % 2== 0;
//		Stream<Integer>	evenNumber=noStream.filter(pr);
//		Consumer<Integer> Cons = num-> System.out.println(num);
		
		no.stream().filter (num -> num % 2== 0).
		forEach(num-> System.out.println(num));
		
	}

}
