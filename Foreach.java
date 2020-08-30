import java.util.List;
import java.util.ArrayList;
public class Foreach{
   public static void main(String[] args) {
      ArrayList<String> products= new ArrayList<String>();
      products.add("AW");
      products.add("SWITCHBOARD");
      products.add("ADAPTIVEU");
      products.add("TELEPORT"); 
      products.add("ANSWERCONNECT");
      products.forEach(str->System.out.println(str));
   }
}