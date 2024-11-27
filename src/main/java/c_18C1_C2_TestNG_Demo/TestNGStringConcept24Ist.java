package c_18C1_C2_TestNG_Demo;

import org.testng.annotations.Test;

public class TestNGStringConcept24Ist {
  @Test
  public void StringConcept() {
	
	
	//public static void main(String[] args) {
		
		String name = "Tanzima";
		String name1 = "Tanzima";
		System.out.println(name.equals(name1));
		
		String text = "String Concept";
		String text1 = "String Concept1";
		System.out.println(text);
		System.out.println(text1);
		
		//Find the memory location/address of this text/text1 variable
		System.out.println(System.identityHashCode(text1));
		System.out.println(System.identityHashCode(text));
		

		//String class Method
		//1. equals() -return true or false
        System.out.println(text.equals(text1));    //equals function compare the value of two different variable(text & text1)
        System.out.println("---------------");
        
        
      //compares memory address of String variable
        System.out.println(text == text1);
        
      //2. Length()- return count of String
        String text2 = "Learning String";
        System.out.println(text2.length());
        System.out.println(name.length());
        System.out.println("---------------");
        
      //"I am" + "Mamun"; I am Mamun
	  //3. Concat()- if you want to Concat (join more than one Strings) two String
        System.out.println(text.concat(text1));
		String num = "20";		
		int a = 24;
		int b = 22;
		System.out.println(num + a);
		System.out.println(a+b);
		System.out.println("---------------");
		
		//4. trim()- want to remove white space from both side of a String use- trim()
		String line = "   Java String Concept   ";
		System.out.println(line);
		System.out.println(line.length());
		System.out.println(line.trim());
		//After use - trim()
		System.out.println(line.trim().length());
		//Before trim()
		System.out.println(line.length());
		System.out.println("---------------");
		
		
		//5. toLowerCase()- convert all of the String as LowerCase()
		String text4 = "Compares String";
		System.out.println(text4.toLowerCase());
		
		//toUpperCase()- convert all of the String as UpperCase()
		String text5 = "Compares String s";
		System.out.println(text5.toUpperCase());
		System.out.println("---------------");
		
		//6.contains() -given String is available in entire String or not - return true/false
		String text6 = "I m learning Java";
		System.out.println(text6.contains("ea"));
		System.out.println(text6.contains("ji"));
		System.out.println("---------------");
			
		
	}

}
