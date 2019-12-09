package customunchecked;

public class SBIa {
public static void main(String[] args) {
	
	System.out.println("starts");
	ATM a=new ATM();
	try
	{
	a.withdrawl(41000);
	}catch(DayLimitException e) {
		System.out.println(e.getMessage());
	}
	System.out.println("ends");
}
}
