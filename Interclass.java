//We can define class in interface
 interface Library
  {
     void issueBook(Book a);
     void retrieveBook(Book a);
     public class Book {
        int bookId;
        String bookName;
        int issueDate;
        int returnDate;
      }
   }
   public class Interclass implements Library
    {
       public void issueBook(Book a) 
       {
          System.out.println("Book Issued");
       }
       public void retrieveBook(Book a)
       {
       System.out.println("Book Retrieved");
       }
       public static void main(String args[])
       {
          Interclass obj = new Interclass();
          obj.issueBook(new Library.Book());
          obj.retrieveBook(new Library.Book());
      }
}








