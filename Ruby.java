package com.naveen.practise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ruby {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
			String s=sc.next();
			System.out.println(solve(s));
		}

	}

	private static int solve(String s) {
	String s1="";
	int i;
	int count=0;
	int size=s.length();
	System.out.println(size);
			for ( i = 0; i < size; i++) {
				
				if(s.charAt(i)!='*')
				{
				s1=s1+s.charAt(i);
				System.out.println(s1);
				}
			}	
			int len=s1.length();
	for (i = 0; i < s1.length()/2; i++) {
		/*if((s1.charAt(i)=='{'&&s1.charAt(i+1)=='}')||(s1.charAt(i)=='{'&&s1.charAt(i+2)=='}'))
		{
			count++;
			
		}*/
		if(s1.charAt(i)=='{'&&s1.charAt(len-1)=='}')
		{
			len--;
			count++;
		}
	}
		
		
		return count;
	}

}
