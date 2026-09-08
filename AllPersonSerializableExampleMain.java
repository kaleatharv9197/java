package io_programming;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class AllPersonSerializableExampleMain {

	public static void main(String[] args) {
	String filepath="./src/resources/all_persons.txt";
	try(
		FileOutputStream fout =new 	FileOutputStream(filepath);
			ObjectOutputStream out = new ObjectOutputStream(fout)
			){
		Person p1  = new Person("smriti"," mandhna", 30);
		Person p2 = new Person("saina"," mandhna", 30);
		Person p3  = new Person("shrutoi"," mandhna", 30);
		Person p4 = new Person("soniytys"," mandhna", 30);
		Person p5  = new Person("ssalomni"," mandhna", 30);
		
		Person[] allPersons= {p1,p2,p3,p4,p5};
		out.writeObject(allPersons);
		System.out.println("alll Person serilaizwe");
	}
		
		
		
catch( Exception ex) {
	ex.printStackTrace();
}
	}}


