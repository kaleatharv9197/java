package io_programming;
import java.io. BufferedInputStream;
import java.io.FileInputStream;

public class BufferedIInputStreamExampleMain {

	public static void main(String[] args) {
		String filepath= "./src/resources/cartoons.txt";
		
		try(  
				FileInputStream	fin = new FileInputStream(filepath);
			BufferedInputStream bin = new BufferedInputStream(fin))
		{
			while(true) {
				int charValue= bin.read();
				if (charValue == -1)
					break;
				char ch = (char)charValue;
				System.out.print(ch);
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
