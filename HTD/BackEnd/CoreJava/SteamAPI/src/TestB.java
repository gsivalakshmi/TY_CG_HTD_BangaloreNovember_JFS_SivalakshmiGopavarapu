import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestB {
public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<Integer>();
	a1.add(12);
	a1.add(15);
	a1.add(16);
	a1.add(19);
	a1.add(18);
	a1.add(20);
	List l1=a1.stream().filter(i -> i%2 != 0).collect(Collectors.toList());
	System.out.println(l1);
	
	List<Integer> l2=a1.stream().map(i -> i*100).collect(Collectors.toList());
	System.out.println(l2);
	
	Optional<Integer> a=a1.stream().max((i,j)->i.compareTo(j));
	System.out.println(a);
	
	System.out.println(a1.stream().count());
}
}
