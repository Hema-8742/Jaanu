import java.io.*;  
class Deserialize
{
    public static void main(String args[])
    {
        try
        {
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("z.txt"));
            Student1 s=(Student1)in.readObject();
            System.out.println(s.id+" "+s.name);
            in.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
 }  
}