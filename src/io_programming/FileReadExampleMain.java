package io_programming;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadExampleMain {

	public static void main(String[] args) {
		String filepath= "./src/resources/cartoons.txt";
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(filepath);
			while(true) {
				int charValue= fin.read();
				if (charValue == -1)
					break;
				char ch = (char)charValue;
				System.out.print(ch);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fin.close();
				
			}catch(IOException e ) {
				e.printStackTrace();
			}
			
		}
	}

}
