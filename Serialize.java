import java.io.*;  
class Serialize
{  
 public static void main(String args[])
 {
     try
     {
         Student1 s1 =new Student1(43,"jaanu");
         FileOutputStream zout=new FileOutputStream("z.txt");
         ObjectOutputStream out=new ObjectOutputStream(zout);
         out.writeObject(s1);
         out.flush();
         out.close();
         System.out.println("success");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

