
import java.util.stream.IntStream;
public class parallelstreamapi {

    public static void main(String[] args) {

        System.out.println("Normal...");
      
		IntStream range = IntStream.rangeClosed(3, 7);
        range.forEach(System.out::println);

        System.out.println("Parallel...");

        IntStream range2 = IntStream.rangeClosed(3, 7);
        range2.parallel().forEach(System.out::println);

    }

}
