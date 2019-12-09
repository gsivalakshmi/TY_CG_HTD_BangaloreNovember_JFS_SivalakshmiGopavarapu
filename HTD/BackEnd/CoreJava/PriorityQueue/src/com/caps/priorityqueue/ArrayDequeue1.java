package com.caps.priorityqueue;

import java.util.PriorityQueue;

public class ArrayDequeue1 {
	public static void main(String[] args) {
		PriorityQueue<Student> p1=new PriorityQueue<Student>();
		p1.offer(new Student(22,"shiva"));
		p1.offer(new Student(24,"chandu"));
		p1.offer(new Student(22,"shiva"));
		
		for (Object object : p1) {
			System.out.println(object);
		}
		
	}
}
