package com.demo.collection.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ArrayListExample implements Cloneable{



	public static void main(String[] args) {

		/*List<String> list_Strings= new ArrayList<>();

		//list_Strings.size();
		System.out.println();

        list_Strings.add("Red");
        list_Strings.add("Red");
        list_Strings.add("Blue");
        list_Strings.add("White");
        list_Strings.add("Black");
       // list_Strings.add(100);
        System.out.println(list_Strings);*/

		//-- Itreator list


		List<String> list_StringItr= new ArrayList<String>();

		//list_Strings.size();
		System.out.println();

		list_StringItr.add("Red");
		list_StringItr.add("Green");
		list_StringItr.add("Blue");
		list_StringItr.add("White");
		list_StringItr.add("Black");

		//print list
		for (String element : list_StringItr)
		{
			System.out.println(element);
		}


		// --Insert an element in first nad last option ---*

		List<String> list_StringPosition= new ArrayList<String>();

		//list_Strings.size();
		System.out.println();

		list_StringPosition.add("Red");
		list_StringPosition.add("Green");
		list_StringPosition.add("Blue");
		list_StringPosition.add("Orange");
		list_StringPosition.add("Black");
		//print list
		System.out.println(list_StringPosition);
		//now insert a colour at first and last position of list
		list_StringPosition.add(0, "Pink");
		list_StringPosition.add(5, "yellow");
		list_StringPosition.add(5, "yellow");

		//print the list 
		System.out.println(list_StringPosition);

		//to retrive the element--
		List<String> list_StringRetrive= new ArrayList<String>();

		list_StringRetrive.add("Red");
		list_StringRetrive.add("Green");
		list_StringRetrive.add("Blue");
		list_StringRetrive.add("Orange");
		list_StringRetrive.add("Black");
		//print list
		System.out.println(list_StringRetrive);
		//Retrive the first and third element

		String element = list_StringRetrive.get(0);
		System.out.println("First Element: " + element);

		element = list_StringRetrive.get(4);
		System.out.println("First Element: " + element);
		// To update the elements

		List<String> list_Stringupdate= new ArrayList<String>();

		list_Stringupdate.add("Red");
		list_Stringupdate.add("Green");
		list_Stringupdate.add("Blue");
		list_Stringupdate.add("Orange");
		list_Stringupdate.add("Black");
		//print list
		System.out.println(list_Stringupdate);
		// update the third element with yellow

		list_Stringupdate.set(2, "Yellow");

		//print the list again
		System.out.println(list_Stringupdate);
		// To remove the element
		List<String> list_StrigRemove= new ArrayList<String>();

		list_StrigRemove.add("Red");
		list_StrigRemove.add("Green");
		list_StrigRemove.add("Blue");
		list_StrigRemove.add("Orange");
		list_StrigRemove.add("Black");
		//print list
		System.out.println(list_StrigRemove);
		// update the third element with yellow

		list_StrigRemove.remove(2);

		//print the list again
		System.out.println("After removing the third element from the list: \n"+ list_StrigRemove);
		//Search in elements in list
		List<String> list_StrigSearch= new ArrayList<String>();

		list_StrigSearch.add("Red");
		list_StrigSearch.add("Green");
		list_StrigSearch.add("Blue");
		list_StrigSearch.add("Orange");
		list_StrigSearch.add("Black");

		//search the value

		if (list_StrigSearch.contains("Red")) {
			System.out.println("Found the list");}
		else {
			System.out.println("No such elements");
		}
		//Sort the list

		List<String> list_StrigSort= new ArrayList<String>();

		list_StrigSort.add("Red");
		list_StrigSort.add("Green");
		list_StrigSort.add("Blue");
		list_StrigSort.add("Orange");
		list_StrigSort.add("Black");
		System.out.println("List before sort:" +list_StrigSort);

		Collections.sort(list_StrigSort);

		System.out.println("List After sort:" +list_StrigSort);

		// copy list 1 to List2
		List<String> List1 = new ArrayList<String>();
		List1.add("1");
		List1.add("2");
		List1.add("3");
		List1.add("4");

		System.out.println("List1: " + List1);
		List<String> List2 = new ArrayList<String>();
		List1.add("A");
		List1.add("B");
		List1.add("C");
		List1.add("d");

		System.out.println("List2: " + List2);
		//copy list1 to list2

		Collections.copy(List1, List2);
		System.out.println("copy List to List2, \nAfter copy: " );
		System.out.println("List1: " + List1);
		System.out.println("List2: " + List2);

		//reverse the collection
		List<String> list_StrigReverse= new ArrayList<String>();

		list_StrigReverse.add("Red");
		list_StrigReverse.add("Green");
		list_StrigReverse.add("Blue");
		list_StrigReverse.add("Orange");
		list_StrigReverse.add("Black");
		System.out.println(" List before reversing: \n" +list_StrigReverse);
		Collections.reverse (list_StrigReverse);
		System.out.println(" List after reversing: \n" +list_StrigReverse);

		//Sub portion of the list
		List<String> list_StrigSubportion= new ArrayList<String>();
		list_StrigSubportion.add("Red");
		list_StrigSubportion.add("Green");
		list_StrigSubportion.add("Blue");
		list_StrigSubportion.add("Orange");
		list_StrigSubportion.add("Black");
		System.out.println("Original List: \n" +list_StrigSubportion);
		List<String> sub_List = list_StrigSubportion.subList(0, 3);
		System.out.println("List of the first three elements:" + sub_List);

		// Compare two arrays

		List<String> C1= new ArrayList<String>();
		C1.add("Red");
		C1.add("Green");
		C1.add("Blue");
		C1.add("Orange");
		C1.add("Black");

		List<String> C2= new ArrayList<String>();
		C2.add("Red");
		C2.add("Green");
		C2.add("Blue");
		C2.add("Orange");
		C2.add("Black");

		//Storing the comparison 
		ArrayList<String> C3 = new ArrayList<String>();
		for (String e : C1)
			C3.add(C2.contains(e) ? "yes" : "No");
		System.out.println(C3);

		////******Swap elements in array list

		List<String> s1= new ArrayList<String>();
		s1.add("Red");
		s1.add("Green");
		s1.add("Blue");
		s1.add("Orange");
		s1.add("Black");
		System.out.println("Array list before swap:");
		for (String a :s1) {
			System.out.println(a);
		}
		//Swapping 1st Index(index 0) elemnt with 3rd index(index2 ) elemnt

		Collections.swap(s1, 0, 2);

		System.out.println("Array List after swap");
		for (String b : s1) {
			System.out.println(b);
		}
		///*** Join the array list

		ArrayList<String> k1= new ArrayList<String>();
		k1.add("Red");
		k1.add("Green");
		k1.add("Blue");
		k1.add("Orange");
		k1.add("Black");
		System.out.println("List of the first array : " + k1);

		ArrayList<String> k2= new ArrayList<String>();
		k2.add("Red");
		k2.add("Green");
		k2.add("Blue");
		k2.add("Orange");
		k2.add("Black");
		System.out.println("List of the first array : " + k2);

		/// join the above 2 arrays

		ArrayList<String> a = new ArrayList<>();
		a.addAll(k1);
		a.addAll(k2);
		System.out.println("New aray :" + a);
		///clone the array list
		ArrayList<String> l1= new ArrayList<String>();
		l1.add("Red");
		l1.add("Green");
		l1.add("Blue");
		l1.add("Orange");
		l1.add("Black");
		System.out.println("Original array list : " + l1);
		ArrayList<String> newc1 = (ArrayList<String>)l1.clone();
		System.out.println("Clone array list :" + newc1);


		////** Empty Array LIst
		ArrayList<String> e1= new ArrayList<String>();
		e1.add("Red");
		e1.add("Green");
		e1.add("Blue");
		e1.add("Orange");
		e1.add("Black");
		System.out.println("Original array list : " + e1);
		e1.removeAll(e1);


		System.out.println("Array list afterremove all elemnts" +e1);
		if (e1.isEmpty()){
		System.out.println("Array list is empty");

	}else {
			System.out.println("Array list is NOT empty");

		//////////
			
			HashMap<Integer,String> hash_mapClone= new HashMap<Integer,String>();  
			hash_mapClone.put(1, "Red");
			hash_mapClone.put(2, "Green");
			hash_mapClone.put(3, "Black");
			hash_mapClone.put(4, "White");
			hash_mapClone.put(5, "Blue");
			// print the map
			System.out.println("The Original map: " + hash_mapClone);
			HashMap<Integer,String> new_hash_map= new HashMap<Integer,String>(); 
			new_hash_map = (HashMap)hash_mapClone.clone();     
			System.out.println("Cloned map: " + new_hash_map); 
			/*------------------------hashMap key mapping-------------------------------------------------  */ 
			HashMap < String, Integer > hash_mapKM = new HashMap < String, Integer > ();
			hash_mapKM.put("Red", 1);
			hash_mapKM.put("Green", 2);
			hash_mapKM.put("Black", 3);
			hash_mapKM.put("White", 4);
			hash_mapKM.put("Blue", 5);
			// print the map
			System.out.println("The Original map: " + hash_mapKM);
			System.out.println("1. Is key 'Green' exists?");
			if (hash_mapKM.containsKey("Green")) {
				//key exists
				System.out.println("Cloned map: " + new_hash_map); 
				/*------------------------hashMap key mapping-------------------------------------------------  */ 
				HashMap < String, Integer > hash_mapKM = new HashMap < String, Integer > ();
				hash_mapKM.put("Red", 1);
				hash_mapKM.put("Green", 2);
				hash_mapKM.put("Black", 3);
				hash_mapKM.put("White", 4);
				hash_mapKM.put("Blue", 5);
				// print the map
				System.out.println("The Original map: " + hash_mapKM);
				System.out.println("1. Is key 'Green' exists?");
				if (hash_mapKM.containsKey("Green")) {
					//key exists
					System.out.println("yes! - " + hash_mapKM.get("Green"));
				} else {
					//key does not exists
					System.out.println("no!");
				}

				System.out.println("\n2. Is key 'orange' exists?");
				if (hash_mapKM.containsKey("orange")) {
					System.out.println("yes! - " + hash_mapKM.get("orange"));
				} else {
					System.out.println("no!");
				}
				/*--------------------------------------Create a set view of the mapping---------------*/
			}

			}
			}
	
}

