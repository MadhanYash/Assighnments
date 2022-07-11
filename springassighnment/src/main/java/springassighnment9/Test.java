package springassighnment9;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	 public static void main(String[] args) {
	        List<Distance> cityDistList = new ArrayList<Distance>();
	        Scanner sc = new Scanner(System.in);

	        ApplicationContext ctxobj = new ClassPathXmlApplicationContext("que9.xml");

	        Distance ct1 = (Distance) ctxobj.getBean("que9a");
	        Distance ct2 = (Distance) ctxobj.getBean("que9b");
	        Distance ct3 = (Distance) ctxobj.getBean("que9c");
	        Distance ct4 = (Distance) ctxobj.getBean("que9d");

	        cityDistList.add(ct1);
	        cityDistList.add(ct2);
	        cityDistList.add(ct3);
	        cityDistList.add(ct4);

	        System.out.println("enter from city name");
	        String fromCity = sc.next();

	        System.out.println("enter to city name");
	        String toCity = sc.next();

	        List<Distance> matchedList = cityDistList.stream().filter(c -> c.getFromcity().equalsIgnoreCase(fromCity))
	                .filter(c -> c.getTocity().equalsIgnoreCase(toCity)).toList();

	        if (!matchedList.isEmpty()) {
	            for (Distance cities : matchedList) {
	                System.out.print("distance between "+cities.getFromcity() +" & "+cities.getTocity()+" is "+cities.getDistance() + " Km");

	            }
	        } else
	            System.out.println("data not available");
	    }}