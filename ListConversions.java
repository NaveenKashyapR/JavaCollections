package com.naveen.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//To remove duplicates from list
public class ListConversions {

	static Integer [] ar= {1,2,3,1,2,3,5};
	static List<Integer> lInt;
	public static void main(String[] args) {
	
//When an array is created without elements it's size is 0 and cannot access elements
		
		lInt=Arrays.asList(ar);
		System.out.println("Coverting an array to list "+lInt);
		System.out.println("Now sorting an array by removing duplicates");
		lInt=lInt.stream().distinct().collect(Collectors.toList());
		System.out.println("Now list without duplicates using stream is "+lInt);
        Set<Integer> set=new HashSet<>(lInt);
        System.out.println("Converted list to set to remove duplicates");
        System.out.println("Set is as it does not allow duplicates "+set);
        lInt=new ArrayList<>(set);
        System.out.println("The list without duplicates using Set is "+lInt);
        System.out.println("To convert a list back to an array");
        ar= lInt.toArray(new Integer[0]);
        System.out.println("Array is "+ar.length);
        ar=lInt.stream().toArray(Integer[]::new);
        for (Integer integer : ar) {
			System.out.println("The values in array are "+integer);
			
		}
        set=new HashSet<>(Arrays.asList(ar));
        set.stream().map(x->x*5).forEach(System.out::println);
	
	}

}
