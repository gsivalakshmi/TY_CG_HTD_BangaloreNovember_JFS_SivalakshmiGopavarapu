package customChecked;

public class Person {
public static void main(String[] args) {
	Election e=new Election();
	try {
	e.vote(19);
	}catch(AgeLimitException e1) {
	System.out.println(e1.getMessage());
	}
}
}
