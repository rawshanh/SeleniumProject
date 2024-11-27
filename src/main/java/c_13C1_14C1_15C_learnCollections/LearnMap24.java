package c_13C1_14C1_15C_learnCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import com.google.common.collect.Multiset.Entry;



public class LearnMap24 {

	public static void main(String[] args) {
		
		//Map (2 dimension)
		
		//Create a map that is create object of LinkedHashMap class
		
		//Maintains Order of put/Insert
		Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
	     //Map<String, Integer> mp = new HashMap<String, Integer>();
		mp.put("Mamun", 112);
		mp.put("Touhid", 111);
		mp.put("Harun", 123);
		mp.put("Rumel", 682);
		mp.put("Sumaiya", 347);
		mp.put("Abc", 123);
		mp.put("Sumaiya", 444);
		mp.put("Daisy", 222);
		mp.put("Sayed", 555);
		mp.put("Touhid", 007);
		mp.put("Abc", 124);
		
	/*	 for (Entry<String, Integer> eachMP : mp.entrySet()) {
        	 System.out.println(eachMP.getKey() +" "+ eachMP.getValue());
     	
      	
		}
		
		*/
		mp.size();
		System.out.println(mp.size());
		
		System.out.println(".........................");   
        mp.get("Rumel");
        System.out.println(mp.get("Rumel"));
        System.out.println(mp.get("Abc"));
        mp.remove("Daisy");
        System.out.println(mp.size());
		mp.containsKey("Abc");
		System.out.println(mp.containsKey("Abc"));
       mp.containsValue(347);
       System.out.println(mp.containsValue(222));
		
		mp.clear();
		System.out.println(mp.size());
		
		
	/*		//Map (2 dimension)
			
			//Create a map that is create object of LinkedHashMap class
			
			//Maintains Order of put/Insert
	         Map<String, Integer> mp = new LinkedHashMap<String, Integer>(); // Result order depends on Implementation classes
			mp.put("Mamun", 112);
			mp.put("Touhid", 111);
			mp.put("Harun", 123);
			mp.put("Rumel", 682);
			mp.put("Sumaiya", 347);
			mp.put("Abc", 123);
			mp.put("Sumaiya", 444);
			mp.put("Daisy", 222);
			mp.put("Sayed", 555);
			mp.put("Touhid", 007);
			mp.put("Abc", 124);
			
			
			mp.size();
			
			  Syntax: for(datatype MapName : Collection){
	        		Sysout(MapName);
	        		}
	          
	       for (Entry<String, Integer> eachMP : mp.entrySet()) {
	        	 System.out.println(eachMP.getKey() +" "+ eachMP.getValue());
	     	
	      	
			}
	                        
	       // System.out.println(".........................");   
	        
	          // get count of Map entry -size()
	        System.out.println(mp.size());
	          
	        
	         System.out.println(".........................");
	          
	          //get();
	         mp.get("Sumaiya");
	     
	       System.out.println(mp.get("Sumaiya"));
	          
	        //Remove()-a particular item
	        mp.remove("Harun"); // just pass the Key
	          
	         
	         System.out.println(".........................");
	          
	          //after remove Size of Map
	        System.out.println(mp.size());
	          
	        for (Entry<String, Integer> eachMP : mp.entrySet()) {
	      	  System.out.println(eachMP.getKey() +"   "+ eachMP.getValue());
				
			}
	          //System.out.println(".........................");
	          
	          //ContainsKey()-Search by the Key
	       mp.containsKey("Sumaiya");
	        System.out.println(mp.containsKey("Sumaiya")); //true/false
	          
	          System.out.println(".........................");
	          
	          //ContainsValue- Search by Value
	         mp.containsValue(444);
	       // System.out.println(mp.containsValue(444));  //true/false
	          
	          //clear()- all map items
	        mp.clear(); //Removes all Map entry
	          
	          System.out.println(".........................");
	          
	         System.out.println(mp.size()); //size will be zero
	          
	          //System.out.println(".........................");
	          
	          System.out.println(mp.isEmpty()); //true/false
	        
	          System.out.println(".........................");
	          
	          for(Entry<String, Integer> eachMp : mp.entrySet()) {
	        	  System.out.println(eachMp.getKey() + "    " + eachMp.getValue());
	          } // result-Map entry will be nil
	          
	              
	          // for Each loop (Single dimension-List & Set)
	          
	         for(datatype VariableName : Collection) { // collection = List or Set
	        	  
	          }
	                 
	          
	          
	        /*  for(Entry<String, Integer> eachMp : mp.entrySet()) {
	        	  System.out.println(eachMp.getKey() + "   " + eachMp.getValue());
	          }

		}

	}

	2. TreeMap and HashMap 

	package learnCollections;


	import java.util.HashMap;
	import java.util.Map;
	import java.util.Map.Entry;
	import java.util.TreeMap;


	public class Map1 {

		public static void main(String[] args) {
			
			//Create a map that is create object of TreeMap class
			Map<String, String>	people = new TreeMap<String, String>();
			
			//Maintain Ascending order
			people.put("Bangladesh", "Dhaka");
			people.put("India", "New Delli");
			people.put("USA", "DC");
			people.put("UK", "London");
			
			System.out.println(people.size());
			
			people.get("UK");
			System.out.println(people.get("UK"));
			
			System.out.println(".........................");
			
			for(Entry<String, String> eachMp : people.entrySet()) {
	      	  System.out.println(eachMp.getKey() + "," + eachMp.getValue());
	        }
			
			System.out.println("..........................");
			
			//Create a map that is create object of HashMap class
			
			Map<String, String>	emp = new HashMap<String, String>();
			
			//Maintain Random order
			emp.put("Mohammed", "Amin");
			emp.put("Mahbuba", "Noor");
			emp.put("Sumaiya", "Chowdhury");
			emp.put("Kutub", "Uddin");
			emp.put("Sayed", "Ahmed");
			
			for(Entry<String, String> eachMp : emp.entrySet()) {
		      	  System.out.println(eachMp.getKey() + "," + eachMp.getValue());
		        }
			System.out.println(emp.size());
			
			people.get("Kutub");
			System.out.println(emp.get("Kutub"));
	*/
		}

}
