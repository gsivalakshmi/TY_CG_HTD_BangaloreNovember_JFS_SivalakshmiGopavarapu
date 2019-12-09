package toStr;

public class Student {
String name;
double perc;

@Override
public String toString()
{
	return this.name+"scored" +this.perc+"%";
}
public static void main(String[] args) {
	Student s1=new Student();
	s1.name="shiva";
	s1.perc=85.4;
	System.out.println(s1);
	
	Student s2=new Student();
	s2.name="chandu";
	s2.perc=99.4;
	System.out.println(s2);
	
}
}
