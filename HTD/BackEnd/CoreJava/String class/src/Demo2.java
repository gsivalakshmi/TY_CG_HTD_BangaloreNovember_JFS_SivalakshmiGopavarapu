
public class Demo2 {
public static void main(String[] args) {
	String s1=new String("shiva");
	System.out.println(s1.hashCode());
	String s2=new String("chandu");
	String s3=new String("shiva");
	s1=new String("bujji");
	System.out.println(s1.hashCode());
	System.out.println(s3.hashCode());
	System.out.println(s2.hashCode());
}
}
