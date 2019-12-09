import java.util.Comparator;

	public class Employee23sal implements Comparator<Employee23> {

		@Override
		public int compare(Employee23 o1, Employee23 o2) {
			if(o1.sal>o2.sal) {
				return 1;
			}else if(o1.sal<o2.sal) {
				return -1;
			}else {
				return 0;
			}
		}

}
