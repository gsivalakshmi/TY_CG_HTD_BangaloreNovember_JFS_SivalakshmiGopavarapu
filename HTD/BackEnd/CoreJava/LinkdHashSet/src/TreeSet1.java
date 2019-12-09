import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(12);
		t.add(44);
		t.add(78);
		
		t.add(87);
		System.out.println(t);
		t.remove(87);
		System.out.println(t);
		for (Integer o1 : t) {
			System.out.println(o1);
		}
	}
}
