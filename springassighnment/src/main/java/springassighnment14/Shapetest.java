package springassighnment14;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Shapetest {

	
		public static void main(String[] args) {
			ApplicationContext ctxobj = new ClassPathXmlApplicationContext("Que14.xml");
			Circle cj = (Circle) ctxobj.getBean("que14");
			Square cj1 = (Square) ctxobj.getBean("que14a");
			Rectangle cj2 = (Rectangle) ctxobj.getBean("que14b");

			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter choice");
			String ch = sc.next();
			switch (ch) {
			case "Circle":
				cj.area(11);
				cj.side();
				break;
			case "Square":
				cj1.area(5);
				cj1.side();
				break;
			case "Rectangle":
				cj2.area(2, 4);
				cj2.side();
				break;
				default: System.out.println("Enter valid");
			}
		}
	}
	