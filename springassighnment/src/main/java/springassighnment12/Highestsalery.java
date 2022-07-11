package springassighnment12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Highestsalery {
	public static void main(String[] args) {

		List<Employee> slist = new ArrayList<Employee>();

		ApplicationContext ctxobj = new ClassPathXmlApplicationContext("Que_12.xml");

		Employee ct1 = (Employee) ctxobj.getBean("que12a");
		Employee ct2 = (Employee) ctxobj.getBean("que12b");
		Employee ct3 = (Employee) ctxobj.getBean("que12c");
		Employee ct4 = (Employee) ctxobj.getBean("que12d");
		slist.add(ct1);
		slist.add(ct2);

		slist.add(ct3);
		slist.add(ct4);

		Employee max = slist.stream().max((e1, e2) -> e1.salary > e2.salary ? 1 : -1).get();

		System.out.println(max.toString());
		System.out.println("===========================================");
		Double avg = slist.stream().collect(Collectors.averagingDouble(e -> e.salary));
          System.out.println("Average number is"+avg);
          List<Employee> minimumavg= slist.stream().filter(i->i.salary< avg).toList();

          for(Employee a:minimumavg) {
          	
          	System.out.println(a.ename+" "+a.salary);
          }
          System.out.println("============================");
          List<String > department=slist.stream().map(r->r.dept).distinct().toList();
      	for(String d:department) {
      		Double avg1=slist.stream().filter(e->e.dept.equals(d)).collect(Collectors.averagingDouble(e->e.salary));
      	System.out.println("Avarage Salary = "+avg1+" = Department = "+d);
      	
      	}

	}
}