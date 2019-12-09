
public class TestCalculator {
public static void main(String[] args) {
	Calculator c1=new Calculator();
	System.out.println(c1.add(12));
	System.out.println(c1);               //it shows the address 
	Calculator c2=new Calculator();
	int r2=c2.add(15, 2020);
	System.out.println(r2);
	Calculator c3=new Calculator();
	double r3=c3.add(12.45);
	System.out.println(r3);
	
	Calculator.mul(15);
	Calculator.mul(12.5);
	Calculator.mul(12, 2);
}
}
