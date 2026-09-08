package io_programming;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderForObjectCreationExampleMain {

	public static void main(String[] args) {
		String filepath= "./src/resources/mobile_numbers.txt";

	try(	FileReader fr= new FileReader(filepath);
			 BufferedReader br=new  BufferedReader((fr));
			){
		while(true) {
			String line = br.readLine();
			if( line == null)
				break;
			String[]  tokens =line.split("-");
			String country_code=tokens[0];
			String mobile_num=tokens[1];
			MobileNumber mobnum = new MobileNumber(country_code,mobile_num);
			System.out.println(mobnum);
			
		}
	}
	catch (Exception ex) {
		ex.printStackTrace();
		}

	}
	
}
