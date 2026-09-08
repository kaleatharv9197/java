package io_programming;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PersonSerializableExampleMain {

	public static void main(String[] args) {
	String filepath="./src/resources/person.txt";
	
	try(
		FileOutputStream fout =new 	FileOutputStream(filepath);
			ObjectOutputStream out = new ObjectOutputStream(fout)
			){
		Person PersonObj = new Person("smriti"," mandhna", 30);
		out.writeObject(PersonObj);
		System.out.println("person object is serilized");
	}
catch( Exception ex) {
	ex.printStackTrace();
}
	}

}
