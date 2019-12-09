package com.caps.maps.Treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {
public static void main(String[] args) {
	TreeMap<Integer,String> t=new TreeMap<Integer,String>();
	t.put(45, "annagadu");
	t.put(2, "mammma");
	t.put(1, "papppaaaa");
	t.put(3, "shiva");
	System.out.println(t.get(1));
	
	
	Set<Map.Entry<Integer, String>> s1=t.entrySet();
	for (Entry<Integer, String> e1 : s1) {
		System.out.println(e1.getKey());
		System.out.println(e1.getValue());
		System.out.println(".....................................");
	}
	System.out.println(t.containsKey(45));
	System.out.println(t.containsValue("annagadu"));
	t.remove(3);
	System.out.println(t.isEmpty());
	System.out.println(t.size());
}

}
