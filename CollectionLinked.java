import java.util.*;

public class CollectionLinked{
   public static void main(String args[]){

     LinkedList<String> list=new LinkedList<String>();
     list.add("adaptiveu");
     list.add("anywhereapps");
     list.add("Switchboard");
     list.addFirst("Answerconnect");
     list.addLast("Integration");
     list.add(2, "Full creative");
     Iterator<String> iterator=list.iterator();
     while(iterator.hasNext()){
       System.out.println(iterator.next());
     }
     list.removeFirst();
     list.remove(2);
     System.out.println(list);
     list.add(1,"Video");
     System.out.println(list);
     Object firstElement = list.getFirst();
     System.out.println("First Element is: "+firstElement);
     Object lastElement = list.getLast();
     System.out.println("Last Element is: "+lastElement);
     int firstIndex = list.indexOf("Switchboard");
     System.out.println("First Occurrence: " + firstIndex);
     int lastIndex = list.lastIndexOf("Switchboard");
     System.out.println("Last Occurrence: " + lastIndex);
     System.out.println("Element removed: "+list.poll());
     System.out.println("LinkedList after: "+list);
     System.out.println("Element removed: "+list.pollFirst());
     System.out.println("LinkedList after: "+list);
     System.out.println("Element removed: "+list.pollLast());
     System.out.println("LinkedList after: "+list);

   } 
} 