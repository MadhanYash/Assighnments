package springassighnment10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Que10.xml");

        Student student = (Student) context.getBean("que10");

    

    student.getStd();
    }
}