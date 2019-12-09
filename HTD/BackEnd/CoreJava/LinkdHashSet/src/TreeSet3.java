import java.util.TreeSet;

public class TreeSet3 {
public static void main(String[] args) {
	Employee23name e1=new Employee23name();
	Employee23age e2=new Employee23age();
	Employee23sal e3=new Employee23sal();

	
	TreeSet<Employee23> ts=new TreeSet<Employee23>(e1);
	ts.add(new Employee23(24,34000,"shiv"));
	ts.add(new Employee23(22,14000,"litts") );
	ts.add(new Employee23(25,38000,"chandu"));
	
	for (Employee23 employee23 : ts) {
	System.out.println("emp name is:"+employee23.name);
	System.out.println("emp age is:"+employee23.age);
	System.out.println("emp sal is:"+employee23.sal);
	System.out.println("................................");
	}

}
}
