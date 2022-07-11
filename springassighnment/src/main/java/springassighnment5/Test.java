package springassighnment5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext objCTX = new ClassPathXmlApplicationContext("que5.xml");
		 Number1 obj1 = (Number1) objCTX.getBean("que5");
		 obj1.method(new int[] { 2, 6, 4, 6, 3, 22, 4, 5, 3, 3, 45 });
		 
	}

}