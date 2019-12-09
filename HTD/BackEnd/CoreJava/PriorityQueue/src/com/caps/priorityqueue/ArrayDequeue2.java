package com.caps.priorityqueue;

import java.util.ArrayDeque;

public class ArrayDequeue2 {
public static void main(String[] args) {
	ArrayDeque<String> ad=new ArrayDeque<String>();
	ad.add("shiva");
	ad.add("shiva");
	ad.add("lakshmi");
	ad.addFirst("gopavarapu");
	ad.addLast("reddy");
	ad.add("reddy");
	System.out.println(ad);
	System.out.println("getfirst...........");
	System.out.println(ad.getFirst());
	System.out.println("...........get last...........");
	System.out.println(ad.getLast());
	System.out.println(".......remove.....");
	ad.remove();
	System.out.println(ad);
	System.out.println("remove first............");
	ad.removeFirst();
	System.out.println(ad);
	System.out.println("....remove last.............");
	ad.removeLast();
	System.out.println(ad);
	System.out.println(".....first occurrance.....");
	ad.removeFirstOccurrence("shiva");
	System.out.println(ad);
	System.out.println(".....last occurrance..........");
	ad.removeLastOccurrence("reddy");
	System.out.println(ad);
	System.out.println("..................peek.........");
	ad.peek();
	System.out.println(ad);
	ad.offer("mummy");
	ad.offer("pappa");
	ad.offer("bujji");
	System.out.println("........peek first........");
	
	System.out.println(ad.peekFirst());
	System.out.println("........peek last.......");
	System.out.println(ad.peekLast());
	System.out.println("....offer first..................");
	ad.offerFirst("chand");
	System.out.println(ad);
	ad.offerLast("bujji");
	System.out.println(ad);
	System.out.println(".............poll............");
	System.out.println(ad.poll());
	System.out.println(ad.pollFirst());
	System.out.println(ad.pollLast());
	System.out.println("..............puh.......................");
	ad.push("hemakukka");
	System.out.println(ad);
	System.out.println(ad.pop());
	System.out.println(ad.element());
}
}
