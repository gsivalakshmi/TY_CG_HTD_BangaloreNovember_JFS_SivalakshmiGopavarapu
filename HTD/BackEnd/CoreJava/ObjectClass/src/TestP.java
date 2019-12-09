
public class TestP {
public static void main(String[] args) throws Throwable {
	System.out.println(".......main starts.....");
	Person p1=new Person("shiv");
	p1.finalize();
	p1=null;
	System.gc();
	System.out.println(".....main end......");
}
}
               