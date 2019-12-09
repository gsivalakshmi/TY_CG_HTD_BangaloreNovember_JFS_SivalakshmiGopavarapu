import java.util.HashSet;

public class HashSet2 {
public static void main(String[] args) {
HashSet<Student> hs=new HashSet<Student>();	
hs.add(new Student("shiva",22));
hs.add(new Student("chandu",24));
hs.add(new Student("mummy",45));
hs.add(new Student("shiva",22));

for (Student s1 : hs) {
	System.out.println(s1.name +" and age is: "+ s1.age);
}

}
}
