import java.io.*;  
class TransientExample{  
 public static void main(String args[])throws Exception{  
  Student s1 =new Student(211,"ravi",22);
  //writing object into file  
  FileOutputStream f=new FileOutputStream("f.txt");  
  ObjectOutputStream out=new ObjectOutputStream(f);  
  out.writeObject(s1);  
  out.flush();  
  
  out.close();  
  f.close();  
  System.out.println("success");  
 }  
}  