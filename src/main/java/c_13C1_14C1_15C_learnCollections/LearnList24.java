package c_13C1_14C1_15C_learnCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LearnList24 {

	public static void main(String[] args) {
	/*	List<String> lst1 = new ArrayList<String>(); 
		
		  lst1.add("Shamim");
		  lst1.add("Mamun"); 
		  lst1.add("Yousuf");
		  lst1.add("Limon"); 
		  lst1.add("Shihab");
		  lst1.add("Touhid"); 
		  lst1.add("Gopi"); 
		  lst1.add("Jewel"); 
		  lst1.add("Shahnaz");
		  lst1.add("Farah");

		  //Get the count of the list 
		  System.out.println(lst1.size());
          
System.out.println("...............................................");
		  
		  lst1.add("shihab"); 
		  System.out.println(lst1.size());
		  System.out.println("...............................................");
		  
		  //Print all items inside the list 
		  for(int i = 0; i < lst1.size(); i++) {
		  System.out.println(lst1.get(i));
		  
		  }
		  
		  System.out.println("...............................................");
		  //Delete the item from the list lst.remove(0);
		  
		  //again Print all items inside the list
		  
		  for(int i = 0; i <lst1.size(); i++) { 
			  System.out.println(lst1.get(i));
		  
		  } System.out.println("...............................................");
		  
		  System.out.println(lst1.contains("abc"));
		  
		  System.out.println("...............................................");
		  
		  System.out.println(lst1.contains("Yousuf"));
		  
		  System.out.println("...............................................");
		  lst1.clear();
		  
		  System.out.println(lst1.isEmpty());
		  System.out.println("...............................................");

		  */
		  
	//	List<String> names = new LinkedList<String>();
		// 2. List-> LinkedList
		List<String> names = new LinkedList<String>();
	
		names.add("Wadud");
		names.add("Sumayia");
		names.add("Touhid");
		names.add("Daisy");
		names.add("Tushar");
		System.out.println(names);
		
		System.out.println(names.size());
		
		System.out.println("------------");
		 
		names.add("Hussain");
		 
		 System.out.println(names);
		
		  System.out.println(names.size());
		  System.out.println("...............................................");
		  
		  //Print all items inside the list 
		for(String eachNames : names) { 
			  System.out.println(eachNames);
		  
		  }
		  
		  System.out.println("...............................................");
	  //Delete the item from the list- names.remove(0);
		  names.remove(1);
		  //again Print all items inside the list
		
		  for(String eachNames : names) { 
			  System.out.println(eachNames);
		  
		  } 
		  System.out.println("...............................................");
		  
		  System.out.println(names.contains("abc"));
	
		  System.out.println("...............................................");
		  
		  System.out.println(names.contains("Daisy"));
		  
		  System.out.println("...............................................");
		  names.clear();
		  
		  System.out.println(names.isEmpty());
		  System.out.println("...............................................");
		 
	}
	}
