import java.util.ArrayList;
import java.util.Collection;

public class Collection3 {
public static void main(String[] args) {
	Collection c=new ArrayList();
	c.add(12);
	c.add(24);
	c.add(13);
	c.add(23);
	System.out.println(c);
	Collection c1=new ArrayList();
	c1.add(86);
	c1.add(24);
	c1.add(23);
	c1.add(93);
	System.out.println("-------------addall-------");
	c.addAll(c1);
	System.out.println(c);
	System.out.println(".........remove all..........");
	System.out.println(c1.removeAll(c1));
	Collection c4=new ArrayList();
	c4.add(12);
	c4.add(24);
	c4.add(13);
	c4.add(23);
	System.out.println(c4);
	Collection c5=new ArrayList();
	c5.add(12);
	c5.add(24);
	c5.add(83);
	c5.add(93);
	System.out.println(c4);
	
	c4.retainAll(c5);
	System.out.println("...............retain all..........");
	System.out.println(c4);
	
	System.out.println(".........contains all.........");
	System.out.println(c4.containsAll(c5));
	
	System.out.println(c4);
	System.out.println("..clear...");
	c4.clear();
	System.out.println(c4);
	
	Collection c6=new ArrayList();
	c6.add(12);
	c6.add(24);
	Object a[]=c6.toArray();
	for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
	}
	
	
	
	
}
}
