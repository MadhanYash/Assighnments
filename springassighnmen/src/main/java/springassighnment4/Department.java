package springassighnment4;

public class Department {
int did;
String dname;

public int getDid() {
	return did;
}

public void setDid(int did) {
	this.did = did;
}

public String getDname() {
	return dname;
}

public void setDname(String dname) {
	this.dname = dname;
}

public void show() {
	System.out.println("id is = "+did);
	System.out.println("department name = "+dname);
}
}