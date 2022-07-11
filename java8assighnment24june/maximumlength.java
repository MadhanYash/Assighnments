
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class maximumlength {
  public static void main(String[] args) {

    List<String> friends = Arrays.asList("hemu", "mohan", "loky", "nani");
    Comparator<String> compByLength = (aName, bName) -> aName.length()
        - bName.length();
    friends
        .stream()
        .max(compByLength)
        .ifPresent(
            longest -> System.out.println("\nThe longest name is " + longest));
  }
}