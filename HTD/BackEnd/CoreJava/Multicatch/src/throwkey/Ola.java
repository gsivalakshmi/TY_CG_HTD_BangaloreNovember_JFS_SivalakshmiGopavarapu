package throwkey;

public class Ola {
GoogleMap gm;
Ola(GoogleMap gm){
	this.gm=gm;
}
void find(String a) {
	try {
		gm.findLocation(a);
	}catch(NullPointerException ne) {
		System.out.println("ola user plz fill d loc name");
	}
}
}
