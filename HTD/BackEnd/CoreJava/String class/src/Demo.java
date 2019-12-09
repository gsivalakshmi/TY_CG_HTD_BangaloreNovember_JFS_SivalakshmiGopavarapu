
public class Demo {
public static void main(String[] args) {
	String s1="shiva";
	System.out.println(s1.hashCode());
	String s2="lucky";
	
	s1="bujji";
	
	String s3="shiva";
	System.out.println(s1.hashCode());
	System.out.println(s3.hashCode());
}
}
