import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class maximumlengthofstring {
	List<String> names = Arrays.asList("John","Paul","Ringo"); 
	Pair<String,Integer> longestName = names.stream()
	 .map(n->new Pair<>(n,n.length())) // pretend n.length() to be a lengthy operation
	 .max(Comparator.comparing(Pair::getB)).get();
	System.out.println(longestName.getA()+" "+longestName.getB());
	
}
