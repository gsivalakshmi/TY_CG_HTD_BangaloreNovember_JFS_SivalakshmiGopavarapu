package ExceptionPropagation;

public class B {
static void n() {
	try {
		C.m();
	}catch(ArithmeticException ae) {
		System.out.println("B class"+ae.getMessage());
	}
	
}
}
