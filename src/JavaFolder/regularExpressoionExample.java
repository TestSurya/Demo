package JavaFolder;

import java.util.regex.Pattern;

public class regularExpressoionExample {

	public static void main(String[] args) {
		String Name="Surya";
		System.out.println(Pattern.matches("....a", Name));//true
		
		String Name1="Selenium";
		System.out.println(Pattern.matches("..l", Name1));//false
		
		

	}

}
