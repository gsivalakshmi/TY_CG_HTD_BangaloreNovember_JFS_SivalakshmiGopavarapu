package customunchecked;

public class DayLimitException extends RuntimeException {
  String msg="limit exceeds";
  DayLimitException(){
	  
  }
public DayLimitException(String m){
	this.msg=m;
}
public String getMessage() {
	return this.msg;
}
}
