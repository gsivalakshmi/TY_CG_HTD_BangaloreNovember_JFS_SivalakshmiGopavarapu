package com.caps.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {
public static void main(String[] args) {
	HashMap<Integer,String> h1=new HashMap<Integer,String>();
	h1.put(2, "shiva");
	h1.put(4, "chandu");
	h1.put(45, "mummy");
	h1.put(1,"bujji");
	h1.put(5, "honey");
	h1.put(null, null);
	Set<Map.Entry<Integer,String>> s1=h1.entrySet();
	for (Entry<Integer, String> e1 : s1) {
		System.out.println(e1.getKey());
		System.out.println(e1.getValue());
	}
	
}
}
