package com.caps.map.hashmap;

import java.util.Collection;
import java.util.HashMap;

public class HashMap2 {
public static void main(String[] args) {
	HashMap<Integer,Student> h1=new HashMap<Integer,Student>();
	h1.put(22, new Student(22,"shiva"));
	h1.put(23, new Student(24,"gvnr"));
	h1.put(null, null);
	h1.put(null, new Student(36,"subbi"));
	h1.isEmpty();
	System.out.println(h1);
	Collection<Student> c=h1.values();
	for (Student s1 : c) {
		System.out.println(s1);
	}
	System.out.println(h1.containsKey(22));
	System.out.println(h1.containsValue(new Student(22,"shiva")));
}
}
