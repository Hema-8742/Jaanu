import java.util.*; 
  
class StreamCount { 
  
    
    public static void main(String[] args) 
    { 
        List<Integer> list = Arrays.asList(0, 2, 4, 6, 
                                           8, 10, 12); 
  
        long total = list.stream().count(); 
        System.out.println(total); 
        List<String> list1 = Arrays.asList("Surya", "Rao", "Software", "sense", 
                                   
        "sense", "RAO"); 
        long names = list1.stream().distinct().count(); 
        System.out.println(names); 
    } 
} 