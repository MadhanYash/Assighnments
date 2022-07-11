package springassighnment13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testclass {
public static void main(String[] args) {
	
	ApplicationContext obj = new ClassPathXmlApplicationContext("que13.xml");
	Movie i1=(Movie) obj.getBean("CustID");
	i1.show();
	
}
}