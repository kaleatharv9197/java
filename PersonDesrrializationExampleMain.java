package io_programming;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class PersonDesrrializationExampleMain {

	public static void main(String[] args) {
		String filepath="./src/resources/person.txt";
		
		try(
			FileInputStream fin =new 	FileInputStream(filepath);
				ObjectInputStream in = new ObjectInputStream(fin)
				){
			Object Obj = in.readObject();
			
			System.out.println(Obj);
			Person pers=(Person)Obj;
			System.out.println(pers.getFirstname());
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
