package com.ashok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortingTechniques {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("ashok", "reddy");
		map.put("arjun", "badam");
		map.put("murali", "sharma");
		map.put("ravindra", "shetti");
		map.put("sunil", "sharma");
		map.put("kumar", "reddy");
		map.put("anil", "bro");
		map.put("ravu", "ramesh");
		map.put("sunil", "shetty");
		map.put("kumar", "varma");

		List<Entry<String, String>> al = new ArrayList<>(map.entrySet());

		
		  Collections.sort(al,new Comparator<Entry<String,String>>() {
		  
		  @Override public int compare(Entry<String, String> o1, Entry<String, String>
		  o2) { // TODO Auto-generated method stub
		  //o1.getKey().compareTo(o2.getKey()); return
			  return o1.getValue().compareTo(o2.getValue()); }
		  
		  });
		 
		Collections.sort(al, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
		Collections.sort(al, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
		for (Entry<String, String> entry : al) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
