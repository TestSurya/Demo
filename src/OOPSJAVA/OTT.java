package OOPSJAVA;

public class OTT implements Netflix, AmazonPrime{
	public void Movies() {
		System.out.println("OTT can access Netflix movies");
	}
	public void TVShows() {
	System.out.println("OTT can access Netflix TVShows");	
	}
	public void Sports() {
		System.out.println("OTT can access Amazon Sports");
	}
	public void Music() {
	System.out.println("OTT can access Amazon Music");	
		
	}
	public static void main(String[] args) {
		OTT obj = new OTT();
		obj.Movies();
		obj.Music();
		obj.Sports();
		obj.TVShows();

	}

}
