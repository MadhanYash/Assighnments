package springassighnment4;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
int eid;
String ename;
double salary;
@Autowired
Department dept;


public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Department getDept() {
	return dept;
}
public void setDept(Department dept) {
	this.dept = dept;
}
public void display() {
	System.out.println("eid name of employee ="+eid);
	System.out.println("name of employee ="+ename);
	System.out.println("salary of employee ="+salary);
	dept.show();
	
	
	
	
}

}