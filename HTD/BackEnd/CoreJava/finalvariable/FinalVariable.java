
public class FinalVariable {
 final double PI;
 int a;
 public FinalVariable(double PI) {
	 this.PI=PI;
 }
 public FinalVariable(int a, double PI) {
	 this.PI=PI;
	 this.a=a;
 }
 void piValue()
 {
	 System.out.println(PI);
	 System.out.println(a);
 }
}
