
public class TestCrush {
public static void main(String[] args) {
	Crush c1=new Crush();
	
	BasicSet bs=new BasicSet();
	Oppo o=new Oppo();
	OnePlus op=new OnePlus();
	Apple a=new Apple();
	c1.receive(bs);
	c1.receive(o);
	c1.receive(op);
	c1.receive(a);
	c1.receive(null);
}
}
