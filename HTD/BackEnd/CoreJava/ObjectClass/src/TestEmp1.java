
public class TestEmp1 {
public static void main(String[] args) {
	Emp1 e1=new Emp1(333,"shiv");
	Emp1 e2=new Emp1(333,"shiv");
	System.out.println(e1.equals(e2));
	System.out.println(e1.hashCode());
	System.out.println(e2.hashCode());
}
}
