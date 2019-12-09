import java.util.ArrayList;
import java.util.List;

public class List1 {
public static void main(String[] args) {
	List l=new ArrayList();
	
	l.add(0, 12);
	l.add(1, 13);
	l.add(2, 14);
	l.add(3, 15);
	l.add(4, 16);
	l.add(1, 13);
	System.out.println(l);
	l.remove(2);
	System.out.println(l);
	System.out.println(l.indexOf(13));
	l.add(13);
	System.out.println(l);
	System.out.println(l.lastIndexOf(13));
	System.out.println("...............................");
	for(int i=0;i<l.size();i++) {
		System.out.println(l.get(i));
	}
	List l2=new ArrayList();
	l2.add(45);
	l2.add(55);
	l2.add(66);
	List l3=new ArrayList();
	l3.add(45);
	l3.add(96);
	l3.add(66);
    l3.addAll(1, l2);
    System.out.println(l3);
    
    l2.set(1, 100);
    System.out.println(l2);
    
    List l6=new ArrayList();
	l6.add(45);
	l6.add(55);
	l6.add(66);
	List l7=l3.subList(0, 2);
	System.out.println(l7);
}
}
