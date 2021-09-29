package JavaFolder;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Working_with_Excel {
	
	public static void main(String[] args) throws IOException {
		
		File fpath = new File("C:\\Users\\Surya Chowdary\\Desktop\\Surya.xlsx");
		
		FileInputStream input = new FileInputStream(fpath);
		
		XSSFWorkbook wb= new XSSFWorkbook(input);
		
		XSSFSheet sheet = wb.getSheet("Testing");
		
		int a= sheet.getLastRowNum();//no of rows
		int b = sheet.getRow(a).getLastCellNum();//number of columns in each row
		
		for (int i=0;i<=a;i++) {
			
		XSSFRow row2 = sheet.getRow(i);
		for(int j=0;j<=b-1;j++) {// b=4 but we have 0-3 so we need to make it as b-1
		XSSFCell celldata = row2.getCell(j);
		
		System.out.print(celldata.getStringCellValue()+"\t");
		}
		System.out.println(" ");
		}
		
		
		
		
		
		
		
	}

}
