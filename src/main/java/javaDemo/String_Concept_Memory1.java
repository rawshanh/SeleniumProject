package javaDemo;

import org.testng.annotations.Test;

public class String_Concept_Memory1 {

 // public static void main(String[] args) {
   @Test
   
   public void String_Concept_Memory1() {
	String Variable = "Congratulations to Elon musk";
		
		String Variable1 = "Congratulations to Elon musk incredible inventions";
		//if variable value is same so memory also same
		System.out.println(Variable);
		System.out.println(Variable1);
		
		System.out.println(System.identityHashCode(Variable));
		System.out.println(System.identityHashCode(Variable1));
		
		System.out.println("*************");
		
		//**** Equals(0- return (values)true or false i.e boolean
		System.out.println(Variable);
		System.out.println(Variable1);
		System.out.println(Variable.equals(Variable1));
		System.out.println("..........");
		
		//memory of loction address/location ame or not ==(operator)
		
		System.out.println(Variable == Variable1);
		System.out.println(System.identityHashCode(Variable1));
		System.out.println(System.identityHashCode(Variable));
		System.out.println("*****");
		 //**** 2# Length()= return count of String
		String Variable3 = "Congratulations to Elon musk team";
		System.out.println(Variable3.length());
		String Variable4 = "CongratulationstoElonmuskteam";
		System.out.println(Variable4.length());
		
		//If 2 values need to unite 
		//#3*** Concat
		System.out.println(Variable.concat(Variable1));
		
		String num = "20";
		 int a = 23;
		 int b = 47;
		 System.out.println(num + a);
		System.out.println(a + b);
		
		
		
		

	}

}
