package springassighnment13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	
	ApplicationContext obj = new ClassPathXmlApplicationContext("applicationContext.xml");
	System123 i1=(System123) obj.getBean("CustID");
	i1.show();
	
}
}
