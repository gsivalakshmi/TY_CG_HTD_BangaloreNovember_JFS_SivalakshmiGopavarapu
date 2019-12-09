package com.caps.maps.Treemap;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap3 {
public static void main(String[] args) {
	TreeMap<String,ArrayList<Student1>> t1=new TreeMap<String,ArrayList<Student1>>();

	ArrayList<Student1> al=new ArrayList<Student1>();
    al.add(new Student1(22,"shiva"));
	al.add(new Student1(22,"anna"));
	al.add(new Student1(22,"chandu"));
	t1.put("B.Tech 2nd year",al);
	System.out.println(t1.get("B.Tech 2nd year"));
	Set<Map.Entry<String, ArrayList<Student1>>> s1=t1.entrySet();
	for (Map.Entry<String, ArrayList<Student1>> e1 : s1) {
		System.out.println(e1.getKey());
		System.out.println(e1.getValue());
		System.out.println(t1.containsKey("B.Tech 2nd year"));
		System.out.println(t1.containsValue(new Student1(22,"shiva")));
		//System.out.println(t1.containsKey("B.tech 2nd year"));
		//System.out.println(t1.containsValue(new Student1(22,"chandu")));
	}
	
}
}
