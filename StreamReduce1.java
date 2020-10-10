import java.util.*; 
import java.util.stream.IntStream; 
  
class StreamReduce1 {
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int product = IntStream.range(2, 8) 
                     .reduce((num1, num2) -> num1 * num2) 
                     .orElse(-1); 
        System.out.println("The product is : " + product); 

        List<Integer> array = Arrays.asList(-2, 0, 4, 6, 8); 
        int sum = array.stream().reduce(0, 
                (element1, element2) -> element1 + element2); 
        System.out.println("The sum of all elements is " + sum); 
    
    } 

}