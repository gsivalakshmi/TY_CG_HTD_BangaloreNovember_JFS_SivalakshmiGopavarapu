
public class Employee23 implements Comparable<Employee23> {
int age;
double sal;
String name;
public Employee23(int age, double sal, String name) {
	super();
	this.age = age;
	this.sal = sal;
	this.name = name;
}

@Override
public String toString() {
	return "Employee23 [age=" + age + ", sal=" + sal + ", name=" + name + "]";
}
@Override
public int compareTo(Employee23 o) {
	return o.name.compareTo(this.name);
}
}
