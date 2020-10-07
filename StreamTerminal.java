import java.util.*; 
import java.util.stream.*; 
class StreamTerminal{ 
  public static void main(String args[]) 
  {
      List<Integer> numbers = Arrays.asList(4,6,7,8,9);
      Set<Integer> squareSet = numbers.stream().map(x->x*x).collect(Collectors.toSet());
      System.out.println(squareSet);
      numbers.stream().map(x->x*x).forEach(y->System.out.println(y));
  } 
} 