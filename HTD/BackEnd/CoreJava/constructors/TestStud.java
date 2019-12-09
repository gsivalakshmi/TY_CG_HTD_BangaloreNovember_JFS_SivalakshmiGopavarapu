
public class TestStud {
public static void main(String[] args) {
	Stud s1=new Stud();
	System.out.println("name is:"+s1.name);
	System.out.println("age is:"+s1.age);
	
	Stud s2=new Stud("shiva",21);
	System.out.println(s2.name);
	System.out.println(s2.age);
}
}
