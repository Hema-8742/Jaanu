import jdk.nashorn.internal.objects.NativeUint16Array;

public class Runnableimp implements Runnable
{  
    public void run()
    {  
    System.out.println("Try running thread");  
    }  
      
    public static void main(String args[])
    { 
        Runnableimp n1=new Runnableimp();  
        Thread t1 =new Thread(n1);  
        t1.start();
    }  
} 