import java.util.*;  
class CollectionArray{  
   public static void main(String args[]){  
       //create an arraylist of string  type
      ArrayList<String> alist=new ArrayList<String>();  
      alist.add("Hema");
      alist.add("Nikitha");
      alist.add("Kanaga");
      alist.add("Surya");
      alist.add("Rao");
      alist.add("Mouni");
      System.out.println(alist);
      //add the value to the list
      alist.add(3, "Usha");
      System.out.println(alist);
      //change the value at index 0 by set
      alist.set(0,"Shree");
      System.out.println(alist);
      //remove elements from given list
      alist.remove("Shree");
      alist.remove(3);
      System.out.println(alist);
      //iterate through given list
      for(String str:alist)
      System.out.println(str);
      System.out.println(alist.size());
      //sort the array list using sort method
      Collections.sort(alist);
      System.out.println(alist);
      //sublist of the arraylist
      ArrayList<String> al = new ArrayList<String>(alist.subList(1, 4));
      System.out.println("SubList stored in ArrayList: "+al);
      System.out.println("'1' is present in arraylist: "+alist.contains(1));
      System.out.println("'Surya' is present in arraylist: "+alist.contains("Surya"));
      Collections.swap(alist,1, 4);
      System.out.println(alist);





   }  
}