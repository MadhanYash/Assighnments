package springassighnment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testavg {
	public static void main(String[] args) {

		ApplicationContext obj = new ClassPathXmlApplicationContext("Que_2.xml");

		Avg g = (Avg) obj.getBean("que2");
		g.avgno();
	}
}