import java.util.TreeSet;
public class Treeset {
     public static void main(String args[]) {
         TreeSet<String> tset = new TreeSet<String>();

         tset.add("A");
         tset.add("S");
         tset.add("T");
         tset.add("P");
         tset.add("I");
         tset.add("J");
         System.out.println(tset);
         TreeSet<Integer> tset2 = new TreeSet<Integer>();
         tset2.add(88);
         tset2.add(7);
         tset2.add(101);
         tset2.add(0);
         tset2.add(3);
         tset2.add(222);
         System.out.println(tset2);
    }
 }
