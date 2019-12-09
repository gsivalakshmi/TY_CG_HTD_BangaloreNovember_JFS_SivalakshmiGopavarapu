

public class ExceptionA {
void exception(int a,String b) {
	try {
		System.out.println(500/a);
		System.out.println(b.length());
	}catch(ArithmeticException ae) {
		System.out.println("dont deal with o");
	}catch (NullPointerException n) {
		System.out.println("dont deal with null");
	}
}
}
