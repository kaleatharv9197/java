package io_programming;

import java.io.FileOutputStream;

public class FileWriteExampleMain {

	public static void main(String[] args) {
		String filepath= "./src/resources/game.txt";
		try(FileOutputStream fout = new FileOutputStream(filepath,true)){
			String gameData="\n8.badmintion\n7. hocky";
		byte[] data =gameData.getBytes();
		fout.write(data);
		System.out.println("Data is Written to file Sucessful..");
		}
		catch (Exception ex) {
			ex.printStackTrace();
		
		}
	
	}
	
}


