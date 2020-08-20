import java.io.Serializable;  
import java.io.*;
class Student implements Serializable{  
 int id;  
 String name;  
 transient int age; public static void name() {
     
 }
 public Student(int id, String name,int age) {  
  this.id = id;  
  this.name = name;  
  this.age=age;  
 }  
}   
