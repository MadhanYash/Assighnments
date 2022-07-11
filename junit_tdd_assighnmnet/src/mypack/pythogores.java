package mypack;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class pythogores {
  public int pythagoreanTriple(int[] triple){
    Integer[] toIntArray = Arrays.stream(triple).boxed().toArray(Integer[]::new);
        Arrays.sort(toIntArray, Collections.reverseOrder()); 
        return Math.pow(toIntArray[0], 2)==(Math.pow(toIntArray[1], 2)+Math.pow(toIntArray[2], 2)) ? 1 : 0;
  }
  }
