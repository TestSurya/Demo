package JavaFolder;

import java.io.FileWriter;
import java.io.IOException;

public class Writedatato_file {

	public static void main(String[] args) throws IOException {
	
		FileWriter Npwrite = new FileWriter("C:\\Users\\Surya Chowdary\\Desktop\\Surya.txt");
		
		Npwrite.write("Hello you are going good"+"\n"+"Avengers"+"\t"+"Assemble");
	
		Npwrite.close();
		

	
	}

}
