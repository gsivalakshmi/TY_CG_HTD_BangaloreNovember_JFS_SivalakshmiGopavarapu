import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {
public static void main(String[] args) {
	TreeSet<Student> t=new TreeSet<Student>();
	t.add(new Student("oops",45));
	t.add(new Student("ram",22));
	t.add(new Student("cherry",32));
	t.add(new Student("oops",45));
	
	Iterator itr=t.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
