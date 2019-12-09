import java.util.LinkedList;

public class LinkedList3 {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add(22);
	l1.add(45);
	l1.add(64);
	l1.add(85);
	System.out.println(".............peek &peek first & peek last................");
	System.out.println(l1.peek());
	System.out.println(l1.peekFirst());
	System.out.println(l1.peekLast());
	System.out.println(l1);
	
	System.out.println("................poll & pollfirst & polllast............");
	System.out.println(l1.poll());
	System.out.println(l1);
	System.out.println(l1.pollFirst());
	System.out.println(l1);
	System.out.println(l1.pollLast());
	System.out.println(l1);
	
	System.out.println("..............offer offer first & offer last..................");
	LinkedList l2=new LinkedList();
	l2.add(23);
	l2.add(45);
	l2.add(63);
	l2.add(78);
	System.out.println(l2);
	l2.offer(75);
	System.out.println(l2);
	l2.offerFirst(89);
	System.out.println(l2);
	l2.offerLast(57);
	System.out.println(l2);
}
}
