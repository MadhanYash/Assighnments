import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class MaximumofArray{
	public static void main(String[] args){
		List<Integer> li = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of number: ");
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			System.out.print("Enter numbers into list: ");
			Scanner ls = new Scanner(System.in);
			int el = ls.nextInt();
			li.add(el);
		}
		Integer max = li.stream().max((a,b)->a.compareTo(b)).get();
		System.out.println("Max Number is:"+max);
	}

}
	