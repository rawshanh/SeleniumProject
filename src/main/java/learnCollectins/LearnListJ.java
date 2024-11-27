package learnCollectins;

import java.util.ArrayList;
import java.util.List;

public class LearnListJ {

	public static void main(String[] args) {
		
		// 1. ArrayList- Step 1:- Create object for ArrayList class
		//Step 2: Use all List methods one by one
		
		//Syntax-List<Integer> lst = new ArrayList<Integer>();
		
		//List<Integer> id = new LinkedList<Integer>();
		//List<Integer> id = new ArrayList<Integer>();	
		List<Integer> id = new ArrayList<Integer>();
		
		id.add(20);
		id.add(30);
		id.add(40);
		id.add(50);
		id.add(60);
		id.add(70);
		id.add(80);
		id.add(90);
		
		System.out.println(id);
		
		System.out.println(id.size());
		
		System.out.println("***********");
		
		for (Integer eachId : id) {
			System.out.println(eachId);
		}
		
		List<String> Name = new ArrayList<String>();
		
		Name.add("Hussain");
		Name.add("Sir");
		Name.add("Rawshan");
		Name.add("Rai");
		Name.add("Lima");
		Name.add("Safa");
		Name.add("Yousuf");
		Name.add("Rai");
		Name.add("Rawshan");
		
		
		//Note: ArrayList allow duplicate value, for that we have inserted Rai and Rawshan multiple times.
		
		System.out.println(Name);
		//Get the count of list/Name	
		System.out.println(Name.size());
		System.out.println("...............................................");
		
		
		//Add new Item in the List
		Name.add("Bepul");
		for (String eachName : Name) {
			System.out.println(eachName);
		}
		
		
		
	}

}
