
public class ExceptionB {
	void exception(int a,String b) {
		try {
			System.out.println(10/0);
			try {
			System.out.println(500/a);
		}catch(ArithmeticException ae) {
			System.out.println("dont deal with o");
		}
		}catch (NullPointerException n) {
			System.out.println("dont deal with null");
		}
		}
	}


