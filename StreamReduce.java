import java.util.*; 
  
class  StreamReduce{  
    public static void main(String[] args) 
    {
        String[] array = { "DO", "OR", "DIE" }; 
        Optional<String> String_combine = Arrays.stream(array).reduce((str1, str2) -> str1 + "-" + str2);
        if (String_combine.isPresent()) { 
        System.out.println(String_combine.get()); 
        } 
    } 
} 