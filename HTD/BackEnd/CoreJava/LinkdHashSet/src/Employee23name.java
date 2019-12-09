import java.util.Comparator;

public class Employee23name implements Comparator<Employee23> {

	@Override
	public int compare(Employee23 o1, Employee23 o2) {
		return o1.name.compareTo(o2.name);
	}

	
}
