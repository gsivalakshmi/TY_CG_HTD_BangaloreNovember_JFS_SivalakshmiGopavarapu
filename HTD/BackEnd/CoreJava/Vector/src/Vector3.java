import java.util.Vector;

public class Vector3 {
public static void main(String[] args) {
	Vector v=new Vector();
	v.addElement(25);
	v.addElement(36);
	v.addElement(96);
	v.add(89);
	System.out.println(v);
	v.removeElement(new Integer(25));
	System.out.println(".......remove element......");
	System.out.println(v);
	System.out.println("...........remove element based on index.............");
	v.removeElementAt(2);
	System.out.println(v);
	Object[] o1=new Object[v.size()];
	System.out.println("...........copy into............");
	v.copyInto(o1);
	for (int i = 0; i < o1.length; i++) {
		System.out.println(o1[i]);
	}
	System.out.println(",,,,,,,,,,remove all elements.........");
	v.removeAllElements();
	System.out.println(v);
	
	Vector v2=new Vector();
	v2.addElement(34);
	v2.addElement(56);
	System.out.println("...............size...........");
	System.out.println(v2.size());
	System.out.println("...............capacity...............");
	System.out.println(v2.capacity());
	System.out.println("...........trimm size...........");
	v2.trimToSize();
	System.out.println(v2.size());
	System.out.println(v2.capacity());
	System.out.println("...........ensure capacity...........");
	v2.ensureCapacity(6);
	System.out.println("........set size...........");
	v2.setSize(8);
	System.out.println(v2.size());
	System.out.println(v2.capacity());
	System.out.println(v2);
}
}
