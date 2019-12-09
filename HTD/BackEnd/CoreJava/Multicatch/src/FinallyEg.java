
public class FinallyEg {
public static void main(String[] args) {
	System.out.println("....main starts....");
	try {
		System.out.println(10/0);
	}catch (ArithmeticException ae) {
		System.out.println("dont deal with 0");
	}finally {
		System.out.println("finally block called....");
	}
	System.out.println("...main ends....");
}
}
