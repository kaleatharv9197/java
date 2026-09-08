package io_programming;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferdReaderExampleMain {

	public static void main(String[] args) {
		String filepath= "./src/resources/cartoons.txt";
		try(
				FileReader fr= new FileReader(filepath);
				 BufferedReader br=new  BufferedReader((fr));
				){
			while(true) {
				String line = br.readLine();
				if( line==null)
					break;
				System.out.println(line);
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
