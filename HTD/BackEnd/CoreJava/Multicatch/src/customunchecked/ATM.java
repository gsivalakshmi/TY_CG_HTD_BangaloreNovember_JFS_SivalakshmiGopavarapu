package customunchecked;

public class ATM {
void withdrawl(double amount) {
	if(amount>40000) {
		throw new DayLimitException();
	}
}
}
