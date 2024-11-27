package c_13C1_14C1_15C_learnCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet24 {

	public static void main(String[] args) {

		Set<Integer> obj = new HashSet<Integer>();
		//Set<Integer> obj = new TreeSet<Integer>();
		//Set<Integer> obj = new LinkedHashSet<Integer>();

		//1.add method
		
		obj.add(100);
		obj.add(124);
		obj.add(101);
		obj.add(125);
		obj.add(721);
		obj.add(123);
		obj.add(456);
		obj.add(101112);
		obj.add(789);
		obj.add(100);
		System.out.println("------------"); 
		
		// 2. Get count of Set - use size()
		System.out.println(obj.size());

		obj.add(10101);
		
		System.out.println("------------");
		
		System.out.println(obj.size());  

		// 3.print/display all item in the Set - use foreach

		for (Integer eachobj : obj) {
			System.out.println(eachobj);
		}

		System.out.println("**************");

		// 4. check particular item from Set - use contains()- output - true/false

		System.out.println(obj.contains(126));

		// 5. delete item from set - use remove (item)
		
		obj.remove(789);

		System.out.println(obj.contains(789));

		System.out.println(obj.isEmpty());
		System.out.println("------------");
		
		// 6. Remove all items from Set-use obj.clear method
		
		obj.clear();
		System.out.println(obj.isEmpty());
		
		System.out.println("------------");
		
		//7. After use clear () confirm set is Empty or not- use isEmpty(0- output-true/false
		System.out.println(obj.isEmpty());
		
		
		
		
		
		
		
		

	}

}
