package io_programming;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AllPersonDeSerializableExampleMain {

	public static void main(String[] args) {
	String filepath="./src/resources/all_persons.txt";
	try(
		FileInputStream fin=new 	FileInputStream(filepath);
			ObjectInputStream in = new ObjectInputStream(fin)
			){
		Object Obj = in.readObject();
		Person[] allAvilablePersons=(Person[])Obj;
	for(Person currentPerson :allAvilablePersons )
		System.out.println(currentPerson);
	}
	
		
		
		
catch( Exception ex) {
	ex.printStackTrace();
}
	}}


