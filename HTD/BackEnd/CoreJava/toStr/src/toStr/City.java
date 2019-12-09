package toStr;

public class City {
String name;
int pincode;
@Override
public String toString() {
	return this.name+"  "+this.pincode+" ";
}
public static void main(String[] args) {
	City c1=new City();
	c1.name="bangalore";
	c1.pincode=514622;
	System.out.println(c1);
	
	City c2=new City();
	c2.name="hyderabad";
	c2.pincode=516006;
	System.out.println(c2);
}
}
