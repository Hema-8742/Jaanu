import java.util.*; 
class StreamSort{ 
public static void main(String[] args)
{
    List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);
    System.out.println("The sorted stream is : ");
    list.stream().sorted().forEach(System.out::println); 
    List<String> list1 = Arrays.asList("He", "Hema", 
                     "Hemashree", "HemaShree", "Heeema");
    System.out.println("The sorted stream is : "); 
    list1.stream().sorted().forEach(System.out::println); 
    } 
}