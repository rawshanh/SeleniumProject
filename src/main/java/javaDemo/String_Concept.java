package javaDemo;

public class String_Concept {

	public static void main(String[] args) {
	
		
	String text = "String Concept";	
		
	String text1 = "String Concept1";	
		
		
		System.out.println(text);
		System.out.println(text1);
		// for getting memory 
		
		System.out.println(System.identityHashCode(text));
		System.out.println(System.identityHashCode(text1));
		
		String text3 = "Learning String";
		String text4  = "Learning String";
		
		System.out.println(text3.length());
		
		System.out.println(text4.length());
		System.out.println(text3.concat(text4));
		// #3
		String num = "20";
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(num + a );
		System.out.println(a+b);
		//#4
	String line = "   Java String Concept   ";
	System.out.println(line.trim());
	//#5
	String text5 = "Compares String";
	//System.out.println(text5.toLowerCase());
	////6
	System.out.println(text5.toUpperCase());
	System.out.println(text5.contains("rin"));	
	}

}
