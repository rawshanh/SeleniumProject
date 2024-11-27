package learnCollectins;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
    
	//1.1	Set<Integer> obj = new HashSet<Integer>();
	//2.2   Set<Integer> obj = new TreeSet<Integer>();
	Set<Integer> obj = new LinkedHashSet<Integer>();
		
		//1. add items in Set - use add()
		
		obj.add(100);
		obj.add(124);
		obj.add(101);
		obj.add(136);
		obj.add(198);
		obj.add(200);
		obj.add(201);
		obj.add(202);
   //2. get count of set-use size()
   System.out.println(obj.size());
   System.out.println("***********");
		
	//3. print/display all items in the set -use foreach
   
		for (Integer eachInt : obj) {
		System.out.println(eachInt);	
		}
		
		System.out.println("------------");
		// 4. check particular item from set-use contains-output -true/false
		
		System.out.println(obj.contains(200));
		System.out.println();
		
		//5.delete item from Set - use remove(item)
		obj.remove(100);
		for (Integer eachInt : obj) {
			System.out.println(eachInt);	
			}
		
		//After remove
		System.out.println(obj.contains(100));
		System.out.println("++++++++++");
		
		System.out.println(obj.size());
//before use clear() check set is Empty or not -use isEmpty()- output- true/false 
		System.out.println(obj.isEmpty());
		
		System.out.println("...........");
		
		//6. Remove all item from Set -use obj.clear()
		obj.clear();
		// 7. After use clear () Confirm set is EMpty or not-use isEmpty() -output - true/false
		
		System.out.println(obj.isEmpty());
		
		
		
	}

}
