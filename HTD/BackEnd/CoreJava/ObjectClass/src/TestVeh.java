
public class TestVeh {
public static void main(String[] args) throws CloneNotSupportedException {
	Vehicle v1=new Vehicle("Royal enfield...");
	Object o1=v1.clone();
	Vehicle v2=(Vehicle) o1;
	System.out.println(v2.name);
}
}
