package collection_framework;

import java.io.FileInputStream;
import java.util.Properties;

import javax.swing.JFrame;

public class PropertiesFileExampleMain {

	public static void main(String[] args) {
		Properties winprops= new Properties();
		String filepath="./src/resources/Window.properties";
		try(
			FileInputStream fin= new FileInputStream(filepath);
				){
				winprops.load(fin);
		String title= winprops.getProperty("window.title");
		String height = winprops.getProperty("window.hight");
		String width= winprops.getProperty("window.width");
			System.out.println(title);
			System.out.println(height);
			System.out.println(width);
			int wt =Integer.parseInt(width);
			int ht= Integer.parseInt(height);
			JFrame appFrame = new JFrame();
			appFrame.setTitle(title);
			appFrame.setSize(wt, ht);
			appFrame.setVisible(true);
			
			
		}
		catch(Exception e) {
		e.printStackTrace();
	}

	}
	
}
