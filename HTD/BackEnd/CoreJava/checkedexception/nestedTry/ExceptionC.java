package nestedTry;

public class ExceptionC {
public static void main(String[] args) {
	System.out.println("main started.....");
	Employee e=new Employee();
	try {
	Object o=e.clone();
	try {
	Class c1=Class.forName("nestedTry.Employee");
	System.out.println("class is found");
	
	}
	catch(ClassNotFoundException e2) {
		System.out.println("class not found");}
	}catch(CloneNotSupportedException e1) {
		System.out.println("object not cloned");
	}
	System.out.println("main ended");
	}
}

