import java.util.HashSet;

public class HashSet1 {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add(12);
	hs.add(86);
	hs.add(23);
	hs.add(44);
	hs.add(null);
	for (Object object : hs) {
		System.out.println(object);
		
	}
	HashSet<String> hs1=new HashSet<String>();
	hs1.add("shiva");
	hs1.add("chandu");
	hs1.add("bujji");
	hs1.add(null);
	for (String string : hs1) {
		System.out.println(string);
	}
}
}
