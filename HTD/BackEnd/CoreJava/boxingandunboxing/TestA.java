
public class TestA{
	public static void main(String args[]) {
		int i1=10;
		//BOXING
		Integer i2=new Integer(i1);
		//UNBOXING
		int i3=i2.intValue();
		double d1=2.36;
		//boxing
		Double d2=new Double(d1);
		//UNBOXING
		double d3=d2.doubleValue();
		System.out.println(i3);
		System.out.println(i2);
		System.out.println(i1);
	}
}
