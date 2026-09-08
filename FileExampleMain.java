package io_programming;

import java.io.File;
import java.io.IOException;

public class FileExampleMain {

	public static void main(String[] args) {
	  String path1  = "./src/resources/games.txt";
	  String path2 = "./src/resources";
	  String path3  = "./src/resources/indoor_games.txt";
	  String path4  = "./src/resources/images";
	  
	  File f1 =new File (path1);
	  File f2 =new File (path2);
	  File f3 =new File (path3);
	  File f4 =new File (path4);
	 
	  System.out.println(path1+"available"+f1.exists());
	  System.out.println(path2+"available"+f2.exists());
	  System.out.println(path3+"available"+f3.exists());
	  System.out.println(path4+"available"+f4.exists());
	  System.out.println("================================");
	  System.out.println(path1+"file?:"+f1.isFile());
	  System.out.println(path1+"directory:"+f1.isDirectory());	 
	  System.out.println(path2+"file?:"+f2.isFile());
	  System.out.println(path2+"directory:"+f2.isDirectory());
	  System.out.println("================================");
	  try {
		 f3.createNewFile();
		 
	  }
	  catch( IOException e) {
		  e.printStackTrace();
	  }
	  f4.mkdir();
	}
	 

} 
