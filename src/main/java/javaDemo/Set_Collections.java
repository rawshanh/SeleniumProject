package javaDemo;

import java.util.HashSet;
import java.util.Set;

public class Set_Collections {

	public static void main(String[] args) {
		
		//Set is not order based
		
		Set<Integer> id = new TreeSet<Integer>();
		id.add(10);
		id.add(15);
		id.add(20);
		id.add(25);
		id.add(30);
		id.add(35);
		System.out.println(id);
		System.out.println("*********");
		System.out.println(id.size());
		System.out.println("*********");
		
		id.add(45);
		for(Integer eachId : id) {
			System.out.println(eachId);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
