package io_programming;
import java.util.*;
import java.io.InputStream;

public class AcceptUserInputExampleMain {

	public static void main(String[] args) {
		InputStream KeyBord = System.in;
		try(
				
				Scanner scr = new Scanner(KeyBord)
				){
			System.out.println("Enter the name:-");
			String fullName= scr.nextLine();
			System.out.println("Enter the age:-");
			int age = scr.nextInt();
			System.out.println("Enter the weight (kg):-");
			float weight= scr.nextFloat();
			
			System.out.println("Here ahre the details ");
			System.out.println("full name :- "+fullName );
			System.out.println("Age:- "+ age+ "years");
			System.out.println("weight :- "+weight+"kg");
			
			
		}
		catch ( Exception ex) {
			ex.printStackTrace();
		}
		

	}

}
