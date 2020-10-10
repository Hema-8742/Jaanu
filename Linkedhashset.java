import java.util.LinkedHashSet;
public class Linkedhashset {
     public static void main(String args[]) {
         LinkedHashSet<String> lhset = new LinkedHashSet<String>();
         lhset.add("H");
         lhset.add("EM");
         lhset.add("A");
         lhset.add("S");
         lhset.add("H");
         lhset.add("REE");
         System.out.println(lhset);
         LinkedHashSet<Integer> lhset2 = new LinkedHashSet<Integer>();
         lhset2.add(77);
         lhset2.add(7);
         lhset2.add(0);
         lhset2.add(67);
         lhset2.add(89);
         lhset2.add(66);
         System.out.println(lhset2);
    }
}
