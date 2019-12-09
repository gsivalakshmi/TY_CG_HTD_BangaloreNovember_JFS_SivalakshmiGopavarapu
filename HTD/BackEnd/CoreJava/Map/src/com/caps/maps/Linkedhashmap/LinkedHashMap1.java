package com.caps.maps.Linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap1 {
public static void main(String[] args) {
	LinkedHashMap<String,Integer> l1=new LinkedHashMap<String,Integer>();
	l1.put("BTM", 342786);
	l1.put("OAR", 560098);
	l1.put("BTR", 516003);
	l1.put(null, 1);
	l1.put(null, null);
	l1.remove("OAR");
	System.out.println("...............is empty............");
	System.out.println(l1.isEmpty());
	System.out.println(l1.size());
	Set<Map.Entry<String,Integer>> s1=l1.entrySet();
	
	for (Entry<String, Integer> e1 : s1) {
		System.out.println(e1.getKey());
		System.out.println(e1.getValue());
		System.out.println(".......................");
	}
	System.out.println(l1.containsKey("BTM"));
	System.out.println(l1.containsValue(342786));
}
}
