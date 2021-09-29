package JavaFolder;

import java.io.File;
import java.io.IOException;

public class FileHandiling_creatingew {

	public static void main(String[] args) throws IOException  { 
	
	File New = new File("C:\\Users\\Surya Chowdary\\Desktop\\Surya.txt");
//	New.createNewFile();
	if(New.exists()) { 
		System.out.println("The file exists");
		System.out.println(New.getName());
		System.out.println(New.getAbsolutePath());
		System.out.println(New.length());
		}
	else {
		System.out.println("Sorry the file not found in the location");
	}

	}
}
