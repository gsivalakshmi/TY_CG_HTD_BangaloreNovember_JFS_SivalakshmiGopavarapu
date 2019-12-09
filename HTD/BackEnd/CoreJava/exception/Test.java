
public class Test {
public static void main(String[] args) {
	System.out.println("starts");
	int[] a=new int[2];
	a[0]=10;
	a[1]=20;
	try {
	a[2]=30;
	}catch(ArrayIndexOutOfBoundsException a1) {
		System.out.println("array xception");
	}
	System.out.println(a.length);
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	System.out.println("ends");
}

}
