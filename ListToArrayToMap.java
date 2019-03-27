package com.naveen.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToArrayToMap {
	
	static List<Integer> listInt;
	static Set<Integer> setInt;
	static Integer [] ar=new Integer[]{1,25,8,7,4564,12,5,6,1,1};
	static Map<Integer,String> map=new HashMap<>();

	public static void main(String[] args) {
		System.out.println("Entering main method");
		Arrays.sort(ar, Comparator.reverseOrder());
		for (Integer i : ar) {
			System.out.println(i);
		}
		listInt=Arrays.asList(ar).stream().distinct().collect(Collectors.toList());
		System.out.println(listInt);
		
		setInt=new HashSet<>(listInt);
		listInt=new ArrayList<>(setInt);
		System.out.println(listInt);
		Integer n=1;
		for (Integer integer : listInt) {
			System.out.println(integer);
			System.out.println(n);
			map.put(n++,integer.toString());
		}
		
		System.out.println(map);
		System.out.println("To iterate over map");
		
		for (Map.Entry<Integer, String> map : map.entrySet()) {
			System.out.println(map.getKey());
			System.out.println(map.getValue());
		}
		   // using keySet() for iteration over keys 
        for (Integer name : map.keySet())  
            System.out.println("key: " + name); 
          
        // using values() for iteration over keys 
        for (String url : map.values())  
            System.out.println("value: " + url); 
	
        // forEach(action) method to iterate map 
        map.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v));
	}

}
