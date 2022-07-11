package springassighnment11;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	List<Student> slist = new ArrayList<Student>();
	ApplicationContext obj = new ClassPathXmlApplicationContext("que11.xml");
	Student e1 = (Student) obj.getBean("que11b");
	Student e2 = (Student) obj.getBean("que11d");

	slist.add(e1);
	slist.add(e2);
	for(Student s :slist) {
		System.out.println(s.studentname+" "+s.res.total_marks);
		
	}
	System.out.println("On the basis of total marks");
	List<Student> sortedlist = slist.stream().sorted((s1, s2) -> Double.compare(s1.res.total_marks, s2.res.total_marks)).toList();
	for (Student w : sortedlist) {
	System.out.println(w.res.total_marks);
}
}
}