import java.util.*; 
import java.util.stream.*;
 public class Stream1 {
    public static void main(String args[]) 
    { 
 
      List<Integer> number = Arrays.asList(2,3,4,5); 
      List<Integer> square = number.stream().collect(Collectors.toList());;
      System.out.println(square); 
    }
}