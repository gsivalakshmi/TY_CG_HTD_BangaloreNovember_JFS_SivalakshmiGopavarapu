import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet2 {
public static void main(String[] args) {
	LinkedHashSet<Employee> hs=new LinkedHashSet<Employee>();
	hs.add(new Employee("shiva",22));
	hs.add(new Employee("chandu",24));
	hs.add(new Employee("shiva",22));
	
	Iterator<Employee> itr=hs.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
