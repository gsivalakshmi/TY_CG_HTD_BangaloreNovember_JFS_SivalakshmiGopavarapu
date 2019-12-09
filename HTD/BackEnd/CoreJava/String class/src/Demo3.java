
public class Demo3 {
public static void main(String[] args) {
	String s1="shivac";
	
	System.out.println(s1.toLowerCase());
	System.out.println(s1.toUpperCase());
	System.out.println(s1.length());
	
	String s2="       shiva    chandu        ";
	System.out.println(s2.trim());
	
	String s4=s1.substring(3);
	System.out.println(s4);
	
	String s5="bujji";
	System.out.println(s5.substring(1, 4));
	
	System.out.println(s5.isEmpty());
	
	String s6="shivshiv";
	System.out.println(s6.charAt(3));
	
	System.out.println(s6.indexOf('h'));
	System.out.println(s6.indexOf("iv"));
	System.out.println(s6.indexOf("iv", 4));
	System.out.println(s6.indexOf('h', 4));
}
}
