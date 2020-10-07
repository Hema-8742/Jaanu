import java.util.*; 
import java.util.stream.*; 
  
class StreamIntermediate 
{ 
  public static void main(String args[]) 
  {  
    List<String> names = Arrays.asList("Anywhere","Adaptiveu","Teleport"); 
    List<String> result = names.stream().filter(s->s.startsWith("A")).collect(Collectors.toList()); 
    System.out.println(result);
    List<String> show =names.stream().sorted().collect(Collectors.toList()); 
    System.out.println(show);
  }
}