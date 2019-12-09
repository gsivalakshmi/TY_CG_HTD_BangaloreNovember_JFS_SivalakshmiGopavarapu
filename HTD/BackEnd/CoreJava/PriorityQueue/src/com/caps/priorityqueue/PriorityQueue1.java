package com.caps.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {
public static void main(String[] args) {
	Queue q1=new PriorityQueue();
	q1.offer(12);
	q1.offer(45);
	q1.offer(96);
	q1.offer(2);
	q1.peek();
	System.out.println(q1);
	System.out.println("......after polling...........");
	q1.poll();
	System.out.println(q1);
	System.out.println("......afer removing........");
	q1.remove();
	System.out.println(q1);
	System.out.println("........element..........");
	System.out.println(q1.element());
	for (Object object : q1) {
		System.out.println(object);
	}
}
}
