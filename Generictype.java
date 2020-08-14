/*This program explains need of generics in java.
Generics type is a class or interface that is parametrized over a a type*/
package blockof;
import java.util.*;
public class Generictype
{
public static void main(String args[])
  {
      int val=10;
      List id=new ArrayList();
      id.add(8);
      id.add(9);
      id.add("Try");
      int i=Integer.parseInt(id.get(3).toString());
      System.out.println(i);
  }  

}