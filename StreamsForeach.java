import java.util.List;
import java.util.ArrayList;
public class StreamsForeach {
   public static void main(String[] args) {
      List<String> names = new ArrayList<String>();
      names.add("Microsoft");
      names.add("Mac");
      names.add("Windows");
      names.add("Linux");
      names.add("Unix");
      names.stream() 
     .filter(f->f.startsWith("M"))
     .forEach(System.out::println);
   }
}