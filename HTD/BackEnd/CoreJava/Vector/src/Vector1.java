import java.util.Vector;

public class Vector1 {
public static void main(String[] args) {
	Vector v=new Vector();
	v.add(35);
	v.add(86);
	v.add(69);
	v.add(75);
	System.out.println(v);
	v.remove(new Integer(69));
	System.out.println(v);
	v.set(1, 3);
	System.out.println(v);
	System.out.println("........for loop........");
	for (int i = 0; i < v.size(); i++) {
		System.out.println(v.get(i));
	}
}
}
