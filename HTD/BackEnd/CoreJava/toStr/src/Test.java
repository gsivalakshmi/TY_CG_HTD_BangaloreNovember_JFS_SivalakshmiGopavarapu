
public class Test {
public static void main(String[] args) {
	Account Ac =new Account();
	Ac.setAccountNum(154236987452l);
	Ac.setbalance(2500.96);
	Ac.setName("shiva");
	long AccountNum=Ac.getAccountNum();
	System.out.println(AccountNum);
	double balance=Ac.getbalance();
	System.out.println(balance);
	String Name=Ac.getName();
	System.out.println(Name);
}
}
