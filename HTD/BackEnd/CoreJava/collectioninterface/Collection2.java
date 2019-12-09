import java.util.ArrayList;
import java.util.Collection;

public class Collection2 {
public static void main(String[] args) {
	Collection c1=new ArrayList();
	
	c1.add("shiva");
	System.out.println(c1);
	
	c1.remove("shiva");
	System.out.println(c1);
	
	System.out.println(c1.size());
	
	System.out.println(c1.isEmpty());
	c1.add("shiv");
	System.out.println(c1);
	Collection c=new ArrayList();
	c.add("shiv");
	c.add("litts");
	System.out.println(c);
	Collection c2=new ArrayList();
	c2.add("lucky");
	c2.add("shiv");
	
	System.out.println("-------------addall-------");
	c2.addAll(c1);
	System.out.println(c2);
	System.out.println(".........remove all..........");
	System.out.println(c2.removeAll(c2));
	Collection c4=new ArrayList();
	c4.add("chandu");
	c4.add("bujji");
	
	System.out.println(c4);
	Collection c5=new ArrayList();
	c5.add("honey");
	c5.add("chinnu");
	
	System.out.println(c5);
	
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
	c6.add("shiva");
	c6.add("chandu");
	Object a[]=c6.toArray();
	for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
	}
}
}
