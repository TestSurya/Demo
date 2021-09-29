package JavaFolder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DeleteFile {

	public static void main(String[] args)  {

		File Np = new File("C:\\Users\\Surya Chowdary\\Desktop\\Book1.xlsx");
		Np.delete();
		if(Np.exists()) {
			System.out.println("File not deleted");
		}
		else {
			System.out.println("File Deleted");
		}
	
	}

}
