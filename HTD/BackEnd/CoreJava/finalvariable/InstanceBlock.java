
public class InstanceBlock {
	final int MAXIMUM;
	static final double PI;
	int a;
	public InstanceBlock() {
		System.out.println("constructor is called");
	}
	public InstanceBlock(int a)
	{
		this.a=a;
		System.out.println("constructor overloaded");
	}

	{
		System.out.println("instance initialiser block");
		this.MAXIMUM=3000;
	}
	static {
		System.out.println("static block executes");
		PI=3.142;
	}
}
