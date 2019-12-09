
public class Emp1 {
int empId;
String empName;
public Emp1(int empId, String empName) {
	super();
	this.empId = empId;
	this.empName = empName;
}
@Override
public boolean equals(Object obj) {
	Emp1 e1=(Emp1) obj;
	if(e1.empId==this.empId) {
		if(e1.empName==this.empName) {
			return true;
		}else {
			return false;
		}
	}else {
		return false;
	}
}

}
