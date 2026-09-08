package io_programming;

import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileExampleMain {

	public static void main(String[] args) {
		String filepath= "./src/resources/mobile_numbers.txt";
	try
	(RandomAccessFile rf = new RandomAccessFile ( filepath, "r")){
		long filesize = rf.length();
		long midPosition = filesize / 2;
		rf.seek(midPosition);
		while(true) {
			int charValue= rf.read();
			if (charValue == -1)
				break;
			char ch = (char)charValue;
			System.out.print(ch);
		}
	}
	catch ( Exception ex) {
		ex.printStackTrace();
	}
	}

}
