package javaDemo;

public class ForLoopIterationInJava {

	public static void main(String[] args) {
	
		/*Syntax of for Loop 
		
		//for(initialization; condition; increment){
		statements(s)
	    }*/
		
		for(int i=1; i<=10; i=i+2) {
			System.out.println(i);
		} 
		System.out.println("******************");
		
		for(int j=1; j<=50; j=j+2) {
			System.out.println(j);
		}
		System.out.println("///////////////");
		
		//print all the values from below Arrays (obj)by using for loop
		String obj[] = new String[6];
		
		obj[0] = "Shewlee";
		obj[1] = "Ekram";
		obj[2] = "Rinky";
		obj[3] = "Wadud";
		obj[4] = "Rumi";
		obj[5] = "Mama";
		
	}

}
