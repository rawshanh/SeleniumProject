package javaDemo;

import java.util.ArrayList;
import java.util.List;

public class List_Collections {

	public static void main(String[] args) {
		
		
		List<Integer> id = new ArrayList<Integer>();
		
		id.add(10);
		id.add(20);
		id.add(30);
		id.add(40);
		id.add(40);
		id.add(50);
		id.add(70);
		id.add(60);
		id.add(80);
		System.out.println(id);
		System.out.println("*******");
		
		for (Integer eachId : id) {
			System.out.println(eachId);
		}
	    id.add(70);
	    System.out.println("*******");
		System.out.println(id.size());
		
		//id.get(6);
		System.out.println(id.get(6));
		
		//remove
		id.remove(4);
		System.out.println(id);
		
		System.out.println(id.contains(70));
		
		id.remove(6);
		System.out.println(id);
		System.out.println(id.contains(60));
		
		System.out.println("***********");
		
		id.clear();
		//id.isEmpty();
		System.out.println(id.isEmpty());
				
	}

}
