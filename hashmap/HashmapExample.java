package com.demo.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> certificationCost =new HashMap<>(); //map is interface 
		certificationCost.put("ISTQB", 7000);
		certificationCost.put("CSTE", 11000);
		certificationCost.put("OCJB", 18000);
		certificationCost.put("NSE", 2000);
		certificationCost.put("Agile", 17000);
		
		

		//lets try to remove element from hashmap using map.remve(object key) method, this will not work
		Set<String> setOfCertifications = certificationCost.keySet();
		//map before removing the mapping syso ("before" +certificationcost)

		Iterator<String> iterator = certificationCost.keySet().iterator();
		while(iterator.hasNext()) {
			String Certification = iterator.next();
			if (Certification.contains("S")) {
				iterator.remove();
			}

		}
		System.out.println("after:" + certificationCost);
//associate specific value with specific key
		
		HashMap<Integer,String> hash_map = new HashMap<Integer, String>();
		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");
		System.out.println("The size of hahmap is "+hash_map.size());
		
		for (Map.Entry x:hash_map.entrySet()) {
			System.out.println(x.getKey()+ " "+x.getValue());
		}
		
		/*---------copy from one map to another map------------------------------------------------*/

		HashMap <Integer,String> hash_map1 = new HashMap <Integer,String> ();
		HashMap <Integer,String> hash_map2 = new HashMap <Integer,String> ();
		// populate hash maps
		hash_map1.put(1, "Red");
		hash_map1.put(2, "Green");
		hash_map1.put(3, "Black");
		System.out.println("\nValues in first map: " + hash_map1);
		hash_map2.put(4, "White");
		hash_map2.put(5, "Blue");
		hash_map2.put(6, "Orange");
		System.out.println("\nValues in second map: " + hash_map2);

		// put all values in secondmap
		hash_map2.putAll(hash_map1);
		System.out.println("\nNow values in second map: " + hash_map2);
		hash_map2.clear(); // To clear all the mapping from hashmap
		System.out.println("size of second map: " + hash_map2);
		// check if map is empty
		boolean result = hash_map2.isEmpty();// to check whether hashmap is empty or not
		// check the result
		System.out.println("Is hash map empty: " + result);
		
		/*--------------------------------------Create a set view of the mapping---------------*/
		HashMap < Integer, String > hash_mapSet = new HashMap < Integer, String > ();
		hash_mapSet.put(1, "Red");
		hash_mapSet.put(2, "Green");
		hash_mapSet.put(3, "Black");
		hash_mapSet.put(4, "White");
		hash_mapSet.put(5, "Blue");
		// create set view for the map
		Set set = hash_mapSet.entrySet();
		// check set values
		System.out.println("Set values: " + set);
		/*----------------------------------value of Specified key-----------------------*/
		HashMap<Integer,String> hash_mapSP= new HashMap<Integer,String>();  
		hash_mapSP.put(1,"Red");
		hash_mapSP.put(2,"Green");
		hash_mapSP.put(3,"Black");
		hash_mapSP.put(4,"White");
		hash_mapSP.put(5,"Blue");
		// get value of key 3
		String val=(String)hash_mapSP.get(3); 
		// check the value
		System.out.println("Value for key 3 is: " + val);
		// checking collection view of the map
		 System.out.println("Collection view is: "+ hash_mapSP.values());
		 
		 
		 /*--------------------------------------Create a set view of the mapping---------------*/
			HashMap < Integer, String > hash_mapSet = new HashMap < Integer, String > ();
			hash_mapSet.put(1, "Red");
			hash_mapSet.put(2, "Green");
			hash_mapSet.put(3, "Black");
			hash_mapSet.put(4, "White");
			hash_mapSet.put(5, "Blue");
			// create set view for the map
			Set set = hash_mapSet.entrySet();
			// check set values
			System.out.println("Set values: " + set);
			/*----------------------------------value of Specified key-----------------------*/
			HashMap<Integer,String> hash_mapSP= new HashMap<Integer,String>();  
			hash_mapSP.put(1,"Red");
			hash_mapSP.put(2,"Green");
			hash_mapSP.put(3,"Black");
			hash_mapSP.put(4,"White");
			hash_mapSP.put(5,"Blue");
			// get value of key 3
			String val=(String)hash_mapSP.get(3); 
			// check the value
			System.out.println("Value for key 3 is: " + val);
			// checking collection view of the map
			 System.out.println("Collection view is: "+ hash_mapSP.values());
		} 
	}

	} 
}


	
	


