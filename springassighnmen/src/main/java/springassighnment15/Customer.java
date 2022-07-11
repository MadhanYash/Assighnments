package springassighnment15;

public class Customer {
	int id;
	String custname;
	iteam iteam;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	
	public iteam getIteam() {
		return iteam;
	}
	public void setIteam(iteam iteam) {
		this.iteam = iteam;
	}
	public void display() {
		System.out.println("id is = "+id);
		System.out.println("customer name = "+custname);
		System.out.println("iteam id = "+iteam.id);
		System.out.println("iteam name "+iteam.iname);
		System.out.println("Iteam price = "+iteam.price);
		System.out.println("catagory name is = "+iteam.cat.catagaryname);
	}

}