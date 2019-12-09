import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
public static void main(String[] args) {
	LinkedHashSet h1=new LinkedHashSet();
	h1.add(12);
	h1.add(44);
	h1.add(22);
	h1.add(44);
	h1.add(null);
	Iterator itr=h1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}

LinkedHashSet<Integer> l1=new LinkedHashSet<Integer>();
l1.add(45);
l1.add(56);
l1.add(45);
l1.add(null);
Iterator itr1=l1.iterator();
while(itr1.hasNext()) {
	System.out.println(itr1.next());
}
}
}
