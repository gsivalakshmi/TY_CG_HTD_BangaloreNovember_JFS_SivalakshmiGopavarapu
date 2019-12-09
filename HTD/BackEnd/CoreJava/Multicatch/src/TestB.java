
public class TestB {
	public static void main(String[] args) {
		System.out.println(".....main starts...");
		ExceptionA e=new ExceptionA();
		e.exception(2, "bema");
		e.exception(1, null);
		e.exception(0, null);
		System.out.println("....main ends...");
	}
}
