package CheckedException;

public class ExceptionB {
public static void main(String[] args) {
	Student s1=new Student();
	
	try {
		Object o=s1.clone();
		System.out.println("object is cloned");
		Class c1=Class.forName("CheckedException.Student");
		System.out.println("class found....");
	} catch (ClassNotFoundException e) {
		System.out.println("class not found");
	}
	catch (CloneNotSupportedException e1) {
		System.out.println("clone not supported");
	}
	System.out.println("main ended");
	
}

}
