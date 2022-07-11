package mypack;

public class clone {
	private int id;
	private String name;
public clone(int id,String name) {
	super();
	this.id=id;
	this.name=name;
}
public Object clone()throws CloneNotSupportedException{
	return super.clone();
}
public static boolean checkclone(clone s1,clone s2) {
	if(s1.id==s2.id && s1.name==s2.name)
		return true;
	else
		return false;
	
}

}
