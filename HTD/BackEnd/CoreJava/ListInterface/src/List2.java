import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List2 {
public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<Integer>();
	a1.add(12);
	a1.add(35);
	a1.add(38);
	System.out.println(a1);
	a1.remove(1);
	System.out.println(a1);
	System.out.println("..........fo loop............");
	for (int i = 0; i < a1.size(); i++) {
		System.out.println(a1.get(i));
	}
	System.out.println(".......for each.......");
	for(Integer i1:a1) {
		System.out.println(i1);
	}
	System.out.println(".............Listiterator method.........");
	ListIterator<Integer> itr1=a1.listIterator(a1.size());
	while(itr1.hasPrevious()) {
		System.out.println(itr1.previous());
	}
	System.out.println(".............iterator method.........");
	Iterator<Integer> itr=a1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	ArrayList<Integer> a2=new ArrayList<Integer>();
	a2.add(23);
	a2.add(24);
	System.out.println(a2);
	a2.remove(new Integer(23));
	System.out.println(a2);
}
}
