import java.util.LinkedList;

public class LinkedList2 {
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add(12);
	l.add(23);
	System.out.println(l);
	l.addFirst(45);
	System.out.println(l);
	l.addLast(63);
	System.out.println(l);
	System.out.println("..............remove first & remove last...............");
	l.removeFirst();
	l.removeLast();
	System.out.println(l);
	
	LinkedList l2=new LinkedList();
	l2.add(23);
	l2.add(45);
	l2.add(58);
	l2.add(63);
	l2.add(45);
	System.out.println(l2);
	System.out.println("...............remove firstoccurance and last occurance..............");
	l2.removeFirstOccurrence(23);
	l2.removeLastOccurrence(45);
	System.out.println(l2);
	
	System.out.println("------------get first &get last-------------------");
	System.out.println(l2.getFirst());
	System.out.println(l2.getLast());
}
}
