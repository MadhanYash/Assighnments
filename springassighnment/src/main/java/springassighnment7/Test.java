package springassighnment7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	 ApplicationContext obj = new ClassPathXmlApplicationContext("que7.xml");
	Array1 obj1= (Array1) obj.getBean("que7a");
	obj1.merge();
}
}