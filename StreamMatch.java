import java.util.*; 
  
class StreamMatch { 
      
    // Driver code 
    public static void main(String[] args) { 
          
    // Creating a list of Integers 
    List<Integer> list = Arrays.asList(3, 4, 6, 12, 20); 
   
    // Stream anyMatch(Predicate predicate)  
    boolean answer = list.stream().anyMatch(n 
                     -> (n/5==0)); 
    boolean question= list.stream().allMatch(n
                    -> (n/5==0));
    boolean quide= list.stream().noneMatch(n
                    -> (n/5==0));
    // Displaying the result 
    System.out.println(answer); 
    System.out.println(question);
    System.out.println(quide);
} 
} 