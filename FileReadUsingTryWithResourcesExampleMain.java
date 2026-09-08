package io_programming;

import java.io.FileInputStream;

public class FileReadUsingTryWithResourcesExampleMain {

	public static void main(String[] args) {
		String filepath= "./src/resources/cartoons.txt";
		
		try(  
				FileInputStream	fin = new FileInputStream(filepath);)
		{
			while(true) {
				int charValue= fin.read();
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
