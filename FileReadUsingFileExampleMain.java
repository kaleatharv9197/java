package io_programming;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadUsingFileExampleMain {

	public static void main(String[] args) {
		String filepath= "./src/resources/cartoons.txt";
		File file = new File(filepath);
		if (file.isFile()&& file.exists()) {
			long filesize = file.length();
			byte[] data = new byte [(int)filesize];
			try (FileInputStream	fin = new FileInputStream(file);
					BufferedInputStream bin = new BufferedInputStream(fin))
			{
				bin.read(data);
				String fileData = new String(data);
				System.out.println(fileData);
			} 
			catch (Exception ex) {
				ex.printStackTrace();
			}
			
			
		}
		else 
			System.out.println(" unable to procees bcz the given path is invalid ");
	}

}
