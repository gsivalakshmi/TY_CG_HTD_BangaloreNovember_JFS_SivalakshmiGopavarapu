package com.caps.maps.Treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 {
public static void main(String[] args) {
	TreeMap<Student,String> t=new TreeMap<Student,String>();
	t.put(new Student(10,"honey"), "6th Standard");
	t.put(new Student(18,"chinnu"), "12 standard");
	t.put(new Student(5,"littu"), "3rd standard");
	
	Set<Map.Entry<Student, String>> s1=t.entrySet();
	
	for (Map.Entry<Student, String> e1 : s1) {
		System.out.println(e1.getValue());
		System.out.println(e1.getKey());
		System.out.println(".................................................");
		System.out.println(t.get(new Student(5,"littu")));
		System.out.println(t.containsKey(new Student(10,"honey")));
		System.out.println(t.containsValue("6th standard"));
	}
}
}
