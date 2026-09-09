package collection_framework;
import java.util.*;

import io_programming.Person;
public class StackExampleMain {

	public static void main(String[] args) {
		Stack dataValue= new Stack();
		dataValue.add("Welcome to Collection");
		dataValue.add("Ai is Bomming");
		dataValue.add(new Person("amitabh", " bachchan",85));
		int myMark=345;
		dataValue.add(myMark);
		float myPercentage = 86.23f;
		dataValue.add(myPercentage);
		boolean pass= true;
		dataValue.add(pass);
		
		int size =dataValue.size();
		for(int index=0;index<size;index++) {
		Object val=	dataValue.get(index);
		System.out.println(val);
		}
		System.out.println("============================================");
		for(Object Obj :dataValue)
			System.out.println(Obj);
	}

}
