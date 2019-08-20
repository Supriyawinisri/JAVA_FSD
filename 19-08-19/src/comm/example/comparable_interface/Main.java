package comm.example.comparable_interface;

import java.io.ObjectInputStream.GetField;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> set = new TreeSet<Student>();
		set.add(new Student("A","B",9.19));
		set.add(new Student("A","B",3.19));
		set.add(new Student("A","B",7.19));
		set.add(new Student("A","B",9.47));
		set.add(new Student("A","B",3.65));
		for(Student s : set) {
			System.out.println(s);
		}
		Student s = null;
		Object[] obj = set.toArray();
		for(Object o : obj) {
			System.out.printf("%s %s GPA is %1f",s.getfName(),s.getlName(),s.getGpa());
		}
	}

}
