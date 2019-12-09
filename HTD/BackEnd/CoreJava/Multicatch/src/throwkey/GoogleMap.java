package throwkey;

public class GoogleMap {
void findLocation(String a) {
	try {
		System.out.println(a.length());
	}catch(NullPointerException ne) {
		System.out.println("user plz fill the loc name");
		throw ne;
	}
}
}
