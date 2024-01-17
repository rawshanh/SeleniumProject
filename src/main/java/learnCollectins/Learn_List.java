package learnCollectins;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_List {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		//List<Integer> Id = new LinkList<Integer>();
		/* Methods of List Interface:-
		add(item)->	Add new Item in the List
		Size()->	Number/get count of List Items
		get(item(index))->Pick Particular Item in the List
		remove(item(index))->Remove the Item from the List 
		Contains(item)->Verifing Particular Item in the List-true/false
		clear()->	Clear the List (all item from the list)
		isEmpty()-> Confirms the List is Empty-true/false   */
		
		names.add("Ekram"); //add(item)->	Add new Item in the List
		names.add("Ekram");
		names.add("Shewly");
		names.add("Lovely");
		names.add("Musddek");
		names.add("Rinky");
		names.add("Rumi");
		names.add("Wadud");
		names.add("Rubel");
		System.out.println(names);
		System.out.println(names.size());//Size()->	Number/get count of List Items
	
		System.out.println("******************");
		names.get(6);
		System.out.println(names.get(6)); //get(item(index))->Pick Particular Item in the List
		
		System.out.println("******************");
		
		names.remove(4);
		System.out.println(names.remove(4)); //remove(item(index))->Remove the Item from the List
	
		System.out.println("******************");
		System.out.println(names.contains("Musaddek")); //Contains(item)->Verifing Particular Item in the List-true/false
		
		System.out.println("******************");
		for(String eachnames : names) {
			System.out.println(eachnames);
		}
		names.clear();
		
		System.out.println("******************");
		System.out.println(names.isEmpty());
		
		
		
		
		
		
		/*names.add("Neepa");
		names.add("Mahbub");
		names.add("Lovely");
		names.add("Ekram");
		names.add("Shewly"); 
		names.add("Rinky");
		names.add("Musaddik");
		names.add("Rubel");
		names.add("Rashid");
		System.out.println(names);
		System.out.println("******************");	
		System.out.println(names.size());
		System.out.println("**************");
		System.out.println(names.get(7));
		System.out.println("**************");
		names.add("MamunVai");
		System.out.println(names);
		System.out.println("*************");
		names.remove(5);
		System.out.println(names.remove(5));
		System.out.println(names.contains("Rinky"));
		for(String eachnames : names) {
			System.out.println(eachnames);
		}
		names.clear();
		names.isEmpty();	*/
		
		
		/* System.out.println("************");
		id.add(80);
		System.out.println(id);
		System.out.println(id.size());
		System.out.println("***************");
		id.get(5);
		System.out.println(id.get(5));
		System.out.println("*****************");
		id.remove(3);
		System.out.println(id);
		System.out.println("********************");
		System.out.println(id.contains(60));
		System.out.println("********************"); */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//WebDriver driver = new ChromeDriver();
		
	//	(Interface	obj	= new Class of Interface)
		
		
		
		
		/* List<Integer> id = new ArrayList<Integer>();
		
		//List(ctrl space)List<Integer> 
		
		id.add(20);
		id.add(30);
		id.add(40);
		id.add(40);
		id.add(50);
		id.add(50);
		id.add(60);
		
		System.out.println(id);
		System.out.println(id.size());
		System.out.println("************");
		id.add(80);
		System.out.println(id);
		System.out.println(id.size());
		System.out.println("***************");
		id.get(5);
		System.out.println(id.get(5));
		System.out.println("*****************");
		id.remove(3);
		System.out.println(id);
		System.out.println("********************");
		System.out.println(id.contains(60));
		System.out.println("********************");
		for(Integer eachId : id) {
			System.out.println(eachId);
		}
		System.out.println("********************");
		id.clear();
		id.isEmpty(); */
		
		

	}

}
