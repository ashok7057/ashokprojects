package com.ashok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AshokString {
	
	public static void main(String[] args) {
		
		System.out.println("Hello Reddy good to see you after a long time");
		
		List<String> al=new ArrayList<String>();
		al.add("reddy");
		al.add("ashok");
		al.add("sravani");
		al.add("arjun");
		al.add("ravi");
		al.add("malli");
		Iterator<String> ite=al.iterator();
		while(ite.hasNext()) {
			System.out.print(ite.next()+" ");
		}
		Collections.sort(al);
		
		System.out.println();
		System.out.println("----------------------");
		for(String s1: al) {
			System.out.print(s1+" ");
		}
		
	}
}
