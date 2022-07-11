package springassighnment6;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestVowels {
public static void main(String[] args) {
	ApplicationContext objCTX = new ClassPathXmlApplicationContext("que_6.xml");
	 Vowels obj1 = (Vowels) objCTX.getBean("que6");
	 obj1.result();
	
}
}
