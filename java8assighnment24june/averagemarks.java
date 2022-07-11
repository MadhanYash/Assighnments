import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class averagemarks {
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
		Integer sum = li.stream()
				  .reduce(0, (a, b) -> a + b);
		System.out.println("Average of marks  is:"+sum/li.size());
		List<Integer> distinctElements =li.stream()
				.distinct()
                .collect(Collectors.toList());
		System.out.println("Distinct list:"+ distinctElements);
		

	}

}
