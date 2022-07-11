import java.util.*;
import java.util.stream.Collectors;
class item {
	int id;
	String itemname;
	int price;
	item(int id,String itemname,int price){
		this.id=id;
		this.itemname=itemname;
		this.price=price;
	}

}
public class avgofprice{
	public static void main(String[]args) {
		List<item>plist=new ArrayList<item>();
		plist.add(new item(001,"chips",25));
		plist.add(new item(002,"choclates",30));
		plist.add(new item(003,"icecream",40));
		plist.add(new item(004,"oil",29));
		
	double avgprice=plist.stream().collect(Collectors.averagingInt(pl->pl.price));
	System.out.println(avgprice);
	for(int i=0;i<plist.size();i++) {
		if((plist.get(i).price)<avgprice){
			System.out.println("price less than average:"+plist.get(i).price);
			}
			if((plist.get(i).price%2)==0) {
				System.out.println("even price list:"+plist.get(i).price);
			}
		}
	}
}

