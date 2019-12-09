
public class TestB {
void write() {
	String s=null;
	try {
	System.out.println("length of string is"+s.length());
	}catch(NullPointerException e) {
		System.out.println("do done wid null");
	}
}
public static void main(String[] args) {
	System.out.println("started");
	TestB tb=new TestB();
	tb.write();
	System.out.println("ended");
}
}
