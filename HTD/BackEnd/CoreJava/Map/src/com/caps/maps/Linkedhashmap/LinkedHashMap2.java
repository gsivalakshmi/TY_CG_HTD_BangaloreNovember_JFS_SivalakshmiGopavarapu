package com.caps.maps.Linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap2 {

public static void main(String[] args) {
	LinkedHashMap<Integer,Employee> h1=new LinkedHashMap<Integer,Employee>();
	h1.put(34, new Employee(22,"mummy"));
	h1.put(35, new Employee(45,"daddy"));
	h1.put(37, new Employee(27,"annagadu"));
	System.out.println(h1.isEmpty());
	System.out.println(h1.size());
	System.out.println(h1.get(37));
	
	
	Set<Map.Entry<Integer,Employee>> s1=h1.entrySet();
	for (Map.Entry<Integer, Employee> entry : s1) {
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
		System.out.println("...................................");
	}
	System.out.println(h1.containsKey(34));
	System.out.println(h1.containsValue(new Employee(27,"annagadu")));
	
}
}
