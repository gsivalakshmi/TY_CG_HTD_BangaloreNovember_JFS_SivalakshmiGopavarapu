
public class Son extends Father {
 Son(){
	 super("chan",34);
	 System.out.println("c");
 }
 Son(String name,int age){
	 this();
	 System.out.println("d");
 }
}
