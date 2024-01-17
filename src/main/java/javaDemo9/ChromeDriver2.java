package javaDemo9;

public class ChromeDriver2 {

	public static void main(String[] args) {
		
		google();
		
		ChromeDriver2 obj = new ChromeDriver2();
		obj.yahoo();
		obj.search();
		obj.exe();
		
		
	
		
	}
	public static  void google() {
		
		System.out.println("google is comfortable to me");
		
	}
	private void yahoo() {
		
	System.out.println("without yahoo we cant search");
	}
	void search() {
		System.out.println("Search engene is helpful");
	}
    protected void exe() {
    	System.out.println("chrome exe is needed for driver");
    }
}
